package cn.nuaa.edu.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author planb
 * @date 2020/7/22 13:39
 * 备注：合法ip地址
 */
public class IPDemo {
    public static List<String> res = new ArrayList<>();
    public static void dfs(String str,int index,int level,StringBuilder sb, List<String> res){
        if(level == 5 || index == str.length() - 1){
            if (level == 5 && index == str.length()-1){
                res.add(sb.toString());
                return;
            }
            return;
        }
        for (int i = 1; i < 4; i++) {
            String pivot = new String();
            if(index + i >= str.length()){
                pivot = str.substring(index);
            }else {
                pivot = str.substring(index, index + i);
            }
            if(Integer.parseInt(pivot) < 256 && (pivot.equals("0") || !pivot.startsWith("0"))){
                sb.append(pivot);
            }
            dfs(str, index+i, level+1, sb, res);
            //sb.remove(pivot);
            sb.delete(index,Integer.MAX_VALUE);
        }
    }
    public static void main(String[] args) {
        String ip = "19216801";
        dfs(ip, 0, 1, new StringBuilder(), res);
        System.out.println(res.size());
        for (String s :res) {
            System.out.print(s+" ");
        }
    }
}
