package cn.nuaa.edu.practice;

/**
 * @author planb
 * @date 2020/7/15 11:19
 * 备注：手写归并排序
 */
public class MyMergeSort {
    public static void sort(int[] arr,int l,int r){
        if (l == r) {
            return;
        }
        int mid = l + ((r-l) >> 1) ;
        //左边排序
        sort(arr, l, mid);
        //右边排序
        sort(arr, mid+1, r);
        //归并
        merge(arr, l, mid+1, r);
    }
    public static void merge(int[] nums,int left,int right,int bound){
        int i = left;
        int mid = right -1;
        int j = right;
        int k = 0;

        int [] temp = new int[ bound - left + 1];
        while (i <= mid && j <= bound ){
            if(nums[i]<nums[j]){
                temp[k++] = nums[i++];
            }else {
                temp[k++] = nums[j++];
            }
        }
        while (i <=mid){
            temp[k++] = nums[i++];
        }
        while (j <=bound){
            temp[k++] = nums[j++];
        }
        //赋值到以前的数组
        for (int index = 0; index < temp.length; index++) {
            nums[left+index] = temp[index];
        }
    }
    public static void main(String[] args) {
            int[] test = {2,4,1,7,4,9,3};
            sort(test, 0, test.length-1);
        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i]+" ");
        }
    }
}
