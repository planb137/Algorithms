package cn.nuaa.edu.practice;

/**
 * @author planb
 * @date 2020/6/29 14:48
 * 备注：
 */
public class QuickSortPartition {
    public static int[] qsort(int arr[],int start,int end) {
        int pivot = partition(arr,start,end);
        if (pivot > start){
            qsort(arr,start,pivot-1);
        }
        if (pivot < end){
            qsort(arr,pivot+1,end);
        }
        return arr;
    }

    public static int partition(int arr[],int l,int r) {
        int x = arr[r];
        int i = l ;
        for (int j = l; j < r; j++) {
            if (arr[j] < x) {
                swap(arr,i++,j);
            }
        }
        swap(arr,i,r);
        return i;
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
