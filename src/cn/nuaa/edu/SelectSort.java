package cn.nuaa.edu;

import java.util.Arrays;

/**
 * @author planb
 * @date 2020/5/13 16:26
 * 备注：
 */
public class SelectSort {
    public static void main(String[] args) {
        int []arr = {1,8,12,6,5,34,3,57,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort (int []arr){
        for (int i =0 ;i< arr.length-1;i++) {
            for (int j = i+1; j< arr.length ;j++){
                if (arr[i] > arr[j] ){
                    int temp  = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
