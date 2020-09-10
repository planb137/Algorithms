package nuaa.edu.nowcoder.ali;

/**
 * @author planb
 * @date 2020/9/8 08:56
 * 备注：alibaba 面试题目（比较两个泛型数组）
 */

import java.util.concurrent.atomic.AtomicInteger;

/**
 * * 阿里巴巴有上万名程序员，层级不一，用法和解决的问题也不一。
 * * 现在你需要给他们写一个数组比较的工具类，要求：
 * * <ul>
 * * <li>1. 考虑足够的容错性</li>
 * * <li>2. 考虑一定的性能</li>
 * * </ul>
 * * 请在15分钟内完成这个工具类方法的编写
 * * @param src 源数组
 * * @param dst 目标数组
 * * @param <T> 类型
 * * @return TRUE:数组相等;FALSE:数组不相等
 */

public class ArrayUtils {
    public static <T> boolean isEquals(T[] src, T[] dst) {
        if (src == null || dst == null) {
            return false;
        }
        if (src.length != dst.length) {
            return false;
        }
        for (int i = 0; i < src.length; i++) {
            if (src[i] == null && dst[i] != null) {
                return false;
            } else if (src[i] != null && dst[i] == null) {
                return false;
            } else {
                if (src[i] == null && dst[i] == null) {
                    continue;
                }
                if (src[i].getClass() != dst[i].getClass()) {
                    return false;
                }
                if (!src[i].equals(dst[i])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int s = 9;
        Integer t = 9;
        System.out.println();
        System.out.println(t instanceof Integer);
        System.out.println(int[].class);
        AtomicInteger ai = new AtomicInteger();
        //ai.compareAndSet()
    }
}