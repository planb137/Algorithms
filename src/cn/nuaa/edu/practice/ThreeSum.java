package cn.nuaa.edu.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author planb
 * @date 2020/6/22 22:44
 * 备注：
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i =0;i<nums.length-2;i++){
            for (int j = i+1;j<nums.length-1;j++){
                List<Integer> rs = new ArrayList<>();
                int pivot = 0-nums[i]-nums[j];
                int ks = exits(nums,pivot,i,j);
                if (ks>=0){
                    rs.add(nums[i]);
                    rs.add(nums[j]);
                    rs.add(nums[ks]);
                    Collections.sort(rs);
                    if(!exit2(result,rs)){
                        result.add(rs);
                    }

                }

            }
        }
        return result;
    }
    public int exits(int[] num,int x,int i,int j){
        for(int temp = 0;temp<num.length;temp++){
           if((temp!=i) && (temp!=j) &&(num[temp]==x)){
               return temp;
            }
        }
        return -1;
    }

    public boolean exit2(List<List<Integer>> list,List<Integer> mid){
        for(List<Integer> in : list){
            if(in.toString().equals(mid.toString())){
                return true;
            }
        }
        return false;
    }

}
