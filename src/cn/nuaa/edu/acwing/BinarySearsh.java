package nuaa.edu.acwing;

/**
 * @author planb
 * @date 2020/8/19 19:18
 * 备注：整数二分模板（必背）  单调性一定可以二分，但是可以二分不一定具有单调性）
 */
public class BinarySearsh {
    // 检查x是否满足某种性质
    boolean check(int x) {
        return false;
    }

    // 区间[l, r]被划分成[l, mid]和[mid + 1, r]时使用：
    int bsearch_1(int l, int r) {
        while (l < r) {
            int mid = l + r >> 1;
            if (check(mid)) {
                r = mid;    // check()判断mid是否满足性质
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    // 区间[l, r]被划分成[l, mid - 1]和[mid, r]时使用：
    int bsearch_2(int l, int r) {
        while (l < r) {
            int mid = l + r + 1 >> 1;
            if (check(mid)) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
            return l;
        }
}
