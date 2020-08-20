package nuaa.edu.acwing;

/**
 * @author planb
 * @date 2020/8/20 10:04
 * 备注：双指针代码模板
 */
public class DoublePointer {
    public static boolean check(int i,int j){
        return false;
    }

    public static void main(String[] args) {
        int n  = 10;

        for (int i = 0, j = 0; i < n; i ++ )
        {
            while (j < i && check(i, j)) {
                j ++ ;
            }

            // 具体问题的逻辑
        }
    }
}
