package nuaa.edu.test;

import java.io.*;
import java.util.*;

public class MyAnswer {
    public static HashMap<String, List<String>> map = new HashMap<>();
    public static HashMap<String, Set<String>> nameMap = new HashMap<>();//存储每个文件去重的嘉宾id
    public static HashMap<String, List<Double>> temp = new HashMap<>();  //记录每个人所有的体温情况
    public static HashMap<String, Double> tempMid = new HashMap<>();  //记录每个人所有的体温中位数
    public static HashMap<String, Integer> errorCount = new HashMap<>();//记录每个文件的错误数

    public MyAnswer() {

    }

    /**
     * 加载数据
     *
     * @param folder 文件所在目录
     * @throws IOException 加载异常
     */
    public void loadData(String folder) throws IOException {
        try {
            String encoding = "GBK";
            String[] filelist = new File(folder).list();
            for (int i = 0; i < filelist.length; i++) {
                File readfile = new File(folder + "/" + filelist[i]);
                //System.out.println("文件名："+filelist[i]);
                InputStreamReader read = new InputStreamReader(
                        new FileInputStream(readfile), encoding);
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;
                HashSet<String> name = new HashSet<>();
                List<String> res = new ArrayList<>();//记录所有来宾
                while ((lineTxt = bufferedReader.readLine()) != null) {
                    res.add(lineTxt);
                    String[] arr = lineTxt.split("\\s+");
                    //System.out.println(arr[1]);
                    name.add(arr[1]);
                }
                map.put(filelist[i], res);
                nameMap.put(filelist[i], name);
                read.close();
            }
        } catch (Exception e) {
            System.out.println("读取文件内容出错");
            e.printStackTrace();
        }
    }


    /**
     * 第一题
     *
     * @param date 格式  yyyyMMdd 例如 20220303
     * @return 检测到的人数
     */
    public int countGuests(String date) throws IOException {
        //如果没有加载文件，先加载
        if (map.size() == 0) {
            loadData("/Users/planb/Desktop/door");
        }
        //还要对每个文件的嘉宾记录再去重
        HashSet<String> name2 = new HashSet<>();
        for (String s : nameMap.keySet()) {
            if (s.contains(date)) {
                Set<String> s2 = nameMap.get(s);
                for (String name3 : s2) {
                    name2.add(name3);
                }
            }
        }
        return name2.size();
    }

    /**
     * 第二题
     *
     * @return 错误记录数
     */
    public int countErrors() throws IOException {
        //如果没有加载文件，先加载
        if (map.size() == 0) {
            loadData("/Users/planb/Desktop/door");
        }
        int num = 0;

        for (String li : map.keySet()) {
            for (String s : map.get(li)) {
                String[] oneLine = s.split("\\s+");
                String id = oneLine[1];
                Double te = Double.valueOf(oneLine[2]);
                List<Double> one = new ArrayList<>();
                if (temp.containsKey(id)) {
                    one = temp.get(id);
                    one.add(te);
                } else {
                    one.add(te);
                }
                temp.put(id, one);
            }
        }
        //统计出错的次数,首先算出体温中位数
        for (String s : temp.keySet()) {
            List<Double> x = temp.get(s);
            Collections.sort(x);
            int size = x.size();
            double mid = 0.0;
            if (x.size() % 2 == 1) {
                mid = x.get((size - 1) / 2);
            } else {
                mid = (x.get(size / 2 - 1) + x.get(size / 2)) / 2;
            }
            for (Double t : x) {
                if (Math.abs(t - mid) >= 1.2) {
                    // System.out.println("温度为：" + t + " 中位数为：" + mid);
                    num++;
                }
            }
            tempMid.put(s, mid);//记录每个人体温的中位数
        }
        return num;
    }

    /**
     * 第三题
     *
     * @return 总误检率从低到高, 品牌中文名称
     */
    public List<String> brandRank() throws IOException {
        //如果没有加载文件，先加载
        if (map.size() == 0) {
            loadData("/Users/planb/Desktop/door");
        }
        countErrors();//必须先计算上面错误数
        List<String> brand = new ArrayList<>();

        HashMap<String, Integer> brandSum = new HashMap<>();//所有品牌总的测量次数
        HashMap<String, Integer> brandErr = new HashMap<>();//所有品牌的出错次数
        HashMap<String, Double> brandRate = new HashMap<>();//所有品牌出错率
        for (String li : map.keySet()) {
            brandSum.put(li.substring(4, 6), brandSum.getOrDefault(li.substring(4, 6), 0) + map.get(li).size());
            for (String s : map.get(li)) {
                String[] oneLine = s.split("\\s+");
                String id = oneLine[1];
                Double te = Double.valueOf(oneLine[2]);
                if (tempMid.containsKey(id)) {
                    double mid = tempMid.get(id);
                    if (Math.abs(te - mid) >= 1.2) {
                        //计算所有品牌的出错率
                        brandErr.put(li.substring(4, 6), brandErr.getOrDefault(li.substring(4, 6), 0) + 1);
                    }
                }
            }
        }
        //计算出错率,用TreeMap从小到大记录出错顺序
        // TreeMap<Double, String> treeRate = new TreeMap<>();
        for (String s2 : brandSum.keySet()) {
            if (brandErr.containsKey(s2)) {
                double r = (double) (brandErr.get(s2) / brandSum.get(s2));
                brandRate.put(s2, r);
                // treeRate.put(r, s2);
            }
        }
        TreeSet<String> brandName = new TreeSet<>();
        for (String s3 : brandRate.keySet()) {
            if (!brandName.contains(s3)) {
                brandName.add(s3);
            }
        }
        //把厂商名字英文简写替换成中文
        for (String s : brandName) {
            if (s.equals("DH")) {
                brand.add("大画");
            } else if (s.equals("HK")) {
                brand.add("海看");
            } else if (s.equals("YS")) {
                brand.add("宇识");
            } else {
                brand.add("商探");
            }
        }
        return brand;
    }

    /**
     * 第四题
     *
     * @return 配备防疫人员的数量
     */
    public int countWorkers() {
        return 0;
    }


}
