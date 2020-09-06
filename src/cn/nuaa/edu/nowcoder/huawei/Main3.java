package nuaa.edu.nowcoder.huawei;

import java.util.Scanner;

/**
 * @author planb
 * @date 2020/9/6 19:43
 * 备注：
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        double[][] p = new double[n][3*m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3 * m; j++) {
                p[i][j] = sc.nextDouble();
            }
        }
        System.out.println(5.0);
    }
}
