package cn.nuaa.edu.leetcode;

import java.util.*;

/**
 * @author planb
 * @date 2020/8/2 16:36
 * 备注：1487. 保证文件名唯一
 */
public class Leetcode1481 {
    //此种解法超时(31/33)
    public String[] getFolderNames2(String[] names) {
        List<String> res = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for(String name :names){
            String su = new String();
            int k = 0;
            while(set.contains(name+su)){
                k++;
                su = "(" + String.valueOf(k)+ ")";
            }
            set.add(name+su);
            res.add(name+su);
        }
        return res.toArray(new String[res.size()]);
    }
    //次解法AC
    public String[] getFolderNames(String[] names) {
        List<String> res = new ArrayList<>();
        Set<String>  set = new HashSet<>();
        Map<String,Integer> map = new HashMap<>();
        for(String name :names){
            String su = new String();
            int k = 0;
            if(map.containsKey(name)) {
                k = map.get(name);
            }

            while(set.contains(name+su)){
                k++;
                su = "(" + String.valueOf(k)+ ")";
            }
            map.put(name,k);
            set.add(name+su);
            res.add(name+su);
        }
        return res.toArray(new String[res.size()]);
    }

}
