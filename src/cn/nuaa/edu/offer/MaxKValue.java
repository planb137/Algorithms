package cn.nuaa.edu.offer;

/**
 * @author planb
 * @date 2020/6/22 15:11
 * 备注：
 */
public class MaxKValue {
    public static void main(String[] args) {
        int[] arr={3,1,5,7,9,2,10};
        int rs=maxKValue(arr,0,arr.length-1,1);
        System.out.println(rs);
    }

    // 求数组[l,h]范围内的第k大的数，编号从0开始
    public static int maxKValue(int[] arr,int l,int h,int k){
        if(l>h){
            return -1;
        }
        int i=l,j=h;
        // 基准
        int temp=arr[l];
        while(i<j){
            while(arr[j]>temp && i<j){
                j--;
            }
            if(i<j){
                arr[i]=arr[j];
                i++;
            }
            while(arr[i]<temp && i<j){
                i++;
            }
            if(i<j){
                arr[j]=arr[i];
                j--;
            }
        }
        arr[i]=temp;
        // // 第k大就是排序后在数组中最终位置时n-1的元素
        if(i==arr.length-k){
            return arr[i];
        }else if(arr.length-k<i){
            return maxKValue(arr,l,i-1,k);
        }else{
            return maxKValue(arr,i+1,h,k);
        }

    }
}
