package nuaa.edu.nowcoder.wangyi;

/**
 * @author planb
 * @date 2020/8/7 16:21
 * 备注：匈牙利算法的最大男女匹配问题
 */
public class BoyAndGirsMatch {
    int N = 50;
    int[][] line = new int[N][N];
    int match[] = new int[N];
    boolean[] used;

    boolean find(int x){
        for (int i = 1; i <= 4; i++) {
            if(line[x][i]==1 && !used[i]){
                used[i] = true;
                if(match[i] == 0 || find(match[i])){
                    match[i] = x;
                    return true;
                }
            }
        }
        return false;
    }

    int match(){
        int sum = 0;
        for (int i = 1; i <= 4; i++) {
            int[] used = new int[N];
            if(find(i)){
                sum++;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        long x = 34;
        System.out.println((Long.parseLong(String.valueOf(x))));
    }
}
