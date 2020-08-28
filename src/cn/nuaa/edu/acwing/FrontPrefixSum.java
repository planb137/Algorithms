package nuaa.edu.acwing;

/**
 * @author planb
 * @date 2020/8/25 14:19
 * 备注：acwing - 前缀和
 */
public class FrontPrefixSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //int[] sum = new int[arr.length];
        //sum[0] = arr[0];
        int n = arr.length;
        int[] s = new int[n+1];
        for (int i = 1; i <= n; i++) {
           s[i] = s[i-1] + arr[i-1];
        }
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
        System.out.println();
        System.out.println(s[3] - s[1]);
    }
}
