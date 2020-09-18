package nuaa.edu.nowcoder.qushi;

/**
 * @author planb
 * @date 2020/9/18 16:15
 * 备注：趋势科技面试题目
 */
public class QushiDemo {
    public static void main(String[] args) {
        int[] a = new int[20];

        for (int i = 0; i < 20; i++) {
            a[i] = (int) (Math.random() * 20);
            System.out.print(a[i] + " ");
        }
        System.out.println("      =======        ");

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    a[i] = a[i] + a[j];
                    a[j] = a[i] - a[j];
                    a[i] = a[i] - a[j];
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
