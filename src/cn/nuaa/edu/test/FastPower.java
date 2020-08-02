package cn.nuaa.edu.test;

/**
 * @author planb
 * @date 2020/8/2 13:50
 * 备注：快速幂取模
 */
public class FastPower {
    private int  mod = 1000;
    public int fastPower(int a, int b) {
        int ans = 1;
        int base = a;
        while (b != 0) {
            if ((b & 1) != 0) { //如果当前的次幂数最后一位(二进制数)不为0的话，那么我们将当前权值加入到最后答案里面去
                ans = (ans * base)% mod;
            }
            //权值增加
            base = (base * base)%mod;
            b >>= 1;
        }
        return ans % mod;
    }
    public int fastPower2(int a, int b) {
        int res = 1;

        for (int i = 1; i <=b ; i++) {
            res = (res * a) % mod;
        }
        return res % mod;
    }

    public static void main(String[] args) {
        System.out.println(new FastPower().fastPower(2, 9));
        System.out.println(10>>1);
    }
}
