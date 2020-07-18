package cn.nuaa.edu.test;

/**
 * @author planb
 * @date 2020/7/18 14:56
 * 备注：递归
 */
public class DPDemo2 {
    public static boolean rec_Subset(int[] arr,int i, int s){
        if( s == 0){
            return true;
        }
        else if(i == 0){
            return (arr[i] == s);
        }else if(arr[i]>s ){
            return rec_Subset(arr,i-1,s);
        }
        else {
            boolean a = rec_Subset(arr,i-1,s-arr[i]);
            boolean b = rec_Subset(arr, i-1, s);
            return a || b;
        }
    }
    public static boolean noRec_Subset(int[] arr,int s){
        boolean[][] subset = new boolean[arr.length][s+1];
        for (int i = 0; i < s+1; i++) {
            subset[0][i] = false;
        }
        for (int i = 0; i < arr.length; i++) {
            subset[i][0] = true;
        }
        subset[0][arr[0]] = true;

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1;j < s+1;j++){
                if(arr[i]>j){
                    subset[i][j] = subset[i-1][j];
                }else {
                    boolean a = subset[i-1][j-arr[i]];
                    boolean b = subset[i-1][j];
                    subset[i][j] = a || b;
                }
            }
        }
        return subset[arr.length-1][s];



    }
    public static void main(String[] args) {
        int[] nums ={3,34,4,12,5,2};
        //System.out.println(rec_Subset(nums, nums.length - 1, 10));
        //System.out.println(rec_Subset(nums, nums.length - 1, 11));
        //System.out.println(rec_Subset(nums, nums.length - 1, 13));
        System.out.println(noRec_Subset(nums, 9));
        System.out.println(noRec_Subset(nums, 10));
        System.out.println(noRec_Subset(nums, 11));
        System.out.println(noRec_Subset(nums, 12));
        System.out.println(noRec_Subset(nums, 13));
    }
}
