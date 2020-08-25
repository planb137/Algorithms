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
        for (int i = 1; i < arr.length; i++) {
           arr[i] += arr[i - 1];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(arr[5] - arr[2]);
    }
}
