package nuaa.edu.acwing.bcsic;

import java.util.Scanner;

/**
 * @author planb
 * @date 2020/8/19 19:53
 * 备注：数的范围：（给定一个按照升序排列的长度为n的整数数组，以及 q 个查询。
 *      对于每个查询，返回一个元素k的起始位置和终止位置（位置从0开始计数）。）
 */
public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        while (q-- != 0) {
            int k = sc.nextInt();
            int l = 0, r = n - 1;
            while (l < r) {
                int mid = l + r >> 1;
                if (num[mid] >= k) {
                    r = mid;
                } else {
                    l = mid + 1;
                }
            }
            if(num[l] != k ){
                System.out.println("-1 -1");
            }else {
                System.out.print(l + " ");
                l = 0; r = n - 1;
                while (l < r){
                    int mid = l + r + 1 >> 1;
                    if(num[mid] <= k){
                        l = mid;
                    }else {
                        r= mid - 1;
                    }
                }
                System.out.println(l);
            }
        }
    }
}
