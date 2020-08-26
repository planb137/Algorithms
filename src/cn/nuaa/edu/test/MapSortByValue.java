package nuaa.edu.test;

import java.util.*;

/**
 * @author planb
 * @date 2020/8/26 18:49
 * 备注：TreeMap按照value进行排序
 */
public class MapSortByValue {
    public static void main(String[] args) {
        TreeMap<String, String> treeMap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        treeMap.put("c", "cccc");
        treeMap.put("b", "aaaa");
        treeMap.put("a", "dddd");
        treeMap.put("d", "bbbb");
/*        for (String str : treeMap.keySet()) {
            System.out.println(treeMap.get(str));
        }*/
        List<Map.Entry<String, String>> list =  new ArrayList<>(treeMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String,String>>() {
            @Override
            public int compare(Map.Entry<String,String> o1, Map.Entry<String,String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

/*        for (String str : treeMap.keySet()) {
            System.out.println(str+"  "+treeMap.get(str));
        }*/
        for (Map.Entry<String, String> e: list) {
            System.out.println(e.getKey()+":"+e.getValue());
        }
        ArrayList<Integer> integers = new ArrayList<>();

        for (Integer x: integers) {
            System.out.println(x);
        }

        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        ArrayList<String> li = new ArrayList<>();

    }
}
