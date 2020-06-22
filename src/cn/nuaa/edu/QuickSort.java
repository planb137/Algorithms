package cn.nuaa.edu;

import java.util.Arrays;

/**
 * @author planb
 * @date 2020/5/14 16:29
 * 备注：
 */
public class QuickSort {
    public static int[] qsort(int arr[],int start,int end) {
        int pivot = arr[start];
        int i = start;
        int j = end;
        while (i<j) {
            while ((i<j)&&(arr[j]>pivot)) {
                j--;
            }
            while ((i<j)&&(arr[i]<pivot)) {
                i++;
            }
            if ((arr[i]==arr[j])&&(i<j)) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        if (i-1>start) {
            arr=qsort(arr,start,i-1);
        }
        if (j+1<end) {
            arr=qsort(arr,j+1,end);
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{3,1,2,7,9,5};
        int len = arr.length-1;
        arr=qsort(arr,0,len);
        for (int i:arr) {
            System.out.print(i+"\t");
        }
    }
}
