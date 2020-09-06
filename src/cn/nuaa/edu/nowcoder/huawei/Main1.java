package nuaa.edu.nowcoder.huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author planb
 * @date 2020/9/6 19:50
 * 备注：
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> arr = new ArrayList<>();

        while (true) {
            String cur = in.next();
            String s9 = cur;
            if (s9.trim().equals("")) {
                break;
            }
            arr.add(cur);
        }
        int N = arr.size() - 2;
        int A = Integer.parseInt(arr.get(N));
        String target = arr.get(N + 1);
        System.out.println(target);
        StringBuilder newTarget = new StringBuilder();
        for (int i = 0; i < target.length(); i++) {
            if (Integer.parseInt(String.valueOf(target.charAt(i))) < A) {
                newTarget.append(target.charAt(i));
            }
        }
        List<String> res = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String s = arr.get(i);
            StringBuilder s_ = new StringBuilder();
            for (int j = 0; j <s.length() ; j++) {
                if(Integer.parseInt(String.valueOf(s.charAt(j))) < A){
                    s_.append(s.charAt(j));
                }
            }
            if(s_.toString().contains(newTarget.toString())){
                res.add(s);
            }
        }
        for (String re: res) {
            System.out.println(re);
        }

    }
}
