package cn.nuaa.edu.offer;

/**
 * @author planb
 * @date 2020/6/19 14:51
 * 备注：
 */
public class MergeSort {
    // 归并排序（Java-迭代版）
    public static int[] merge_sort(int[] arr) {
        int len = arr.length;
        int[] result = new int[len];
        int block, start;

        for(block = 1; block < len*2; block *= 2) {
            for(start = 0; start <len; start += 2 * block) {
                int low = start;
                int mid = (start + block) < len ? (start + block) : len;
                int high = (start + 2 * block) < len ? (start + 2 * block) : len;
                //两个块的起始下标及结束下标
                int start1 = low, end1 = mid;
                int start2 = mid, end2 = high;
                //开始对两个block进行归并排序
                while (start1 < end1 && start2 < end2) {
                    result[low++] = arr[start1] < arr[start2] ? arr[start1++] : arr[start2++];
                }
                while(start1 < end1) {
                    result[low++] = arr[start1++];
                }
                while(start2 < end2) {
                    result[low++] = arr[start2++];
                }
            }
            int[] temp = arr;
            arr = result;
            result = temp;
        }
        result = arr;
        return result;
    }

    public static void main(String[] args) {
         int[] test = {2,4,7,1,9,2,90,33};
         int[] rs= merge_sort(test);
         for (int x : rs){
             System.out.print(x+" ");
         }
    }
}
