package cn.nuaa.edu.practice;

/**
 * @author planb
 * @date 2020/6/25 20:28
 * 备注： // 在上一种零钱状态的基础上增大
 *      // 例如对于总额5，当只有面额为1的零钱时，只有一种可能 5x1
 *      // 当加了面额为2的零钱时，除了原来的那一种可能外
 *      // 还加上了组合了两块钱的情况，而总额为5是在总额为3的基础上加上两块钱来的
 *      // 所以就加上此时总额为3的所有组合情况
 */
public class Charge {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount+1];
        dp[0] = 1;
        for (int con : coins){
            for (int x = con ; x <= amount ; x++){
                dp[x] = dp[x]+dp[x-con];
            }
        }
        return dp[amount];
    }
}
