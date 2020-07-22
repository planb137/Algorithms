package cn.nuaa.edu.leetcode;

/**
 * @author planb
 * @date 2020/7/22 15:36
 * 备注：合法构成ip的数目
 */
public class IPSum {
    public static int dp(String str){
        int[][] arr = new int[5][str.length()+1];
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < str.length()+1; j++) {
                if (i == 0 && j==0){
                    arr[i][j] = 1;
                    continue;
                }
                if(i == 0){
                    arr[i][j] = 0;
                    continue;
                }
                for (int k = 1; k <= 3; k++) {
                    if (j - k >= 0 && validate(str.substring(j-k, j))){
                        arr[i][j] += arr[i-1][j-k];
                    }
                }
            }
        }
        return arr[4][str.length()];
    }
    public  static boolean validate(String s ){
        if (s.equals("0")) {
            return true;
        }
        if (s.startsWith("0")) {
            return false;
        }
        return Integer.parseInt(s) < 256;
    }
    public static void main(String[] args) {
        String ip = "19216801";
        System.out.println(dp(ip));
    }
}
