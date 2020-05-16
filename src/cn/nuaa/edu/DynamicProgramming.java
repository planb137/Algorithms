package cn.nuaa.edu;

/**
 * @author planb
 * @date 2020/5/16 17:32
 * 备注：
 */
public class DynamicProgramming {
    public static void main(String[] args) {
        int [] x = {5,10,25,1};
        System.out.println(coins1(x,1000));
        System.out.println(countWays(x,1000));
    }
    //暴力搜索算法
    public static int coins1(int[] arr, int aim) {
        if (arr == null || arr.length == 0 || aim < 0) {
            return 0;
        }
        return process1(arr, 0, aim);
    }

    public static int process1(int[] arr, int index, int aim) {
        int res = 0;
        if (index == arr.length) {
            res = aim == 0 ? 1 : 0;
        } else {
            for (int i = 0; i * arr[index] <= aim; i++) {
                res += process1(arr, index + 1, aim - i * arr[index]);
            }
        }
        return res;
    }

    //暴力搜索之记忆算法
    public static int countWays(int[] penny,int aim) {
        if (penny == null || penny.length == 0 || aim < 0) {
            return 0;
        }
        int[][] map = new int[penny.length + 1][aim + 1];
        return process2(penny, 0, aim, map);
    }

    public static int process2(int[] arr, int index, int aim, int[][] map) {
        int res = 0;
        if (index == arr.length) {
            res = aim == 0 ? 1 : 0;
        } else {
            for (int i = 0; i * arr[index] <= aim; i++) {
                int mapValue = 0;
                if (mapValue != 0) {
                    res += mapValue == -1 ? 0 : mapValue;
                } else {
                    res += process2(arr, index + 1, aim - i * arr[index], map);
                }
            }
        }
        map[index][aim] = res == 0 ? -1 : res;
        return res;
    }

    public static int countWays(int[] penny, int n, int aim) {
        if (penny == null || penny.length == 0 || aim < 0) {
            return 0;
        }
        int[][] dp = new int[n][aim + 1];
        // 初始化第一行的值
        for (int i = 0; i < aim + 1; i++) {
            if (i % penny[0] == 0) {
                dp[0][i] = 1;
            }
        }
        // 初始化第一列的值
        for (int i = 0; i < n; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < aim + 1; j++) {
                for (int k = 0; j - k * penny[i] >= 0; k++) {
                    dp[i][j] += dp[i - 1][j - k * penny[i]];
                }
            }
        }
        return dp[n - 1][aim];
    }


}
