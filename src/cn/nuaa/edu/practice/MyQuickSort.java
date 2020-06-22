package cn.nuaa.edu.practice;

/**
 * @author planb
 * @date 2020/6/22 16:25
 * 备注：
 */
public class MyQuickSort {
    public static int[] qsort(int arr[],int start,int end) {
        int pivot = arr[start];
        int i = start+1;
        int j = end;
        while (i<j) {
            while ((i<j)&&(arr[j]>pivot)) {
                j--;
            }
            while ((i<j)&&(arr[i]<pivot)) {
                i++;
            }
            if (i==j) {
                int temp = arr[start];
                arr[start] = arr[i];
                arr[i] = temp;
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
        int arr[] = new int[]{3,1,5,7,9,2,10};
        int len = arr.length-1;
        arr=qsort(arr,0,len);
        for (int i:arr) {
            System.out.print(i+"\t");
        }
    }
}
