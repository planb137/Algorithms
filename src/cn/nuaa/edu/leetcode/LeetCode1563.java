package nuaa.edu.leetcode;

/**
 * @author planb
 * @date 2020/8/28 14:30
 * 备注：LeetCode 1563. 石子游戏 V(区间dp，前缀和)
 * 游戏中的每一轮：Alice 会将这行石子分成两个 非空行（即，左侧行和右侧行）；Bob 负责计算每一行的值，
 * 即此行中所有石子的值的总和。Bob 会丢弃值最大的行，Alice 的得分为剩下那行的值（每轮累加）。
 * 如果两行的值相等，Bob 让 Alice 决定丢弃哪一行。下一轮从剩下的那一行开始。
 * 只 剩下一块石子 时，游戏结束。
 *
 */
public class LeetCode1563 {
    int s[];

    //获取区间和
    int get(int l, int r) {
        return s[r] - s[l - 1];
    }

    public int stoneGameV(int[] w) {
        s = new int[w.length + 1];
        int n = w.length;
        for (int i = 1; i <= n; i++) {
            s[i] = s[i - 1] + w[i - 1];
        }
        int dp[][] = new int[n + 1][n + 1];

        for (int len = 2; len <= n; len++) {
            for (int i = 1; i + len - 1 <= n; i++) {
                int j = i + len - 1;
                for (int k = i; k < j; k++) {
                    int left = get(i, k);
                    int right = get(k + 1, j);
                    if (left < right) {
                        dp[i][j] = Math.max(dp[i][j],dp[i][k]+left);
                    }else if(left > right){
                        dp[i][j] = Math.max(dp[i][j],dp[k+1][j]+right);
                    }else {
                        dp[i][j] = Math.max(dp[i][j],Math.max(dp[i][k],dp[k+1][j])+left);
                    }
                }
            }
        }

        return dp[1][n];
    }
}
