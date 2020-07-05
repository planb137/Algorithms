package cn.nuaa.edu.practice;

import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @author planb
 * @date 2020/7/4 10:11
 * 备注：
 */
public class Solution {
    public Solution() {
    }

    public String sloution(String s){
        String rs = "";
        if(s.length()<=1){
            rs = "Not Found";
            return rs;
        }
        char[] n = s.substring(1).toCharArray();
        char[] n2 = s.substring(1).toCharArray();
        Arrays.sort(n2);
        char[] n3 = reverse(n2);
        for (int i = 0; i < n2.length; i++) {
            for(int j = 0; j < n3.length; j++){
                while (n3[j]==n[i]){
                    break;
                }
                while (n3[j]<n[i]){
                    char temp = n3[j];
                    n3[j] = n3[i];
                    n3[i] = temp;
                    i=n.length-1;
                    break;
                }
            }
        }
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>(200,0.6f);
        for (int i = 0; i < s.length()-1; i++) {
            while (n3[i]>n[i]){
                return s.substring(0, 1)+ new String(n3);
            }

        }
        rs = "Not Found";
        return rs;
    }
    public static char [] reverse(char []array){

        char []array1 =new char [array.length];
        int j=0;
        for(int i=array.length-1;i>=0;i--){
            array1[j++] =array[i];
        }
        return array1;

    }
    public static void main(String[] args) {
        System.out.println(new Solution().sloution("153"));
    }
}
