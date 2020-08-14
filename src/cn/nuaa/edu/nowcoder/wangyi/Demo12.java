package nuaa.edu.nowcoder.wangyi;

/**
 * @author planb
 * @date 2020/8/14 18:30
 * 备注：数组连续子序列的最大和
 */
public class Demo12 {
    public static int maxSeq(int[] num){
        int[] dp = new int[num.length];
        dp[0] = num[0];
        int max = num[0];
        for (int i = 1; i < num.length; i++) {
            dp[i] = Math.max(num[i],dp[i-1]+num[i]);
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] num = {1, -2, 3, 5, -4, 7, 2, -5};
        System.out.println(maxSeq(num));
    }
}
