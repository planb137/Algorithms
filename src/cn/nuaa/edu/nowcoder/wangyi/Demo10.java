package nuaa.edu.nowcoder.wangyi;


import java.util.HashMap;
import java.util.Scanner;

/**
 * @author planb
 * @date 2020/8/8 20:43
 * 备注：小易的公司一共有n\mathit nn名员工, 第i\mathit ii个人每个月的薪酬是xix_ixi​万元。
 * 现在小易的老板向小易提了m\mathit mm次询问, 每次询问老板都会给出一个整数k\mathit kk, 小易要快速回答老板工资等于k\mathit kk的员工的数量。
 */
public class Demo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] num = new int[n];
        int[] time = new int[m];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
            if(map.containsKey(num[i])){
                map.put(num[i],map.get(num[i])+1);
            }else {
                map.put(num[i],1);
            }
            //map.put(num[i],map.getOrDefault(map.get(num[i])+1, 1));
        }
        for (int i = 0; i < m; i++) {
            time[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            if(map.containsKey(time[i])){
                System.out.println(map.get(time[i]));
            }else {
                System.out.println(0);
            }

        }


    }
}
