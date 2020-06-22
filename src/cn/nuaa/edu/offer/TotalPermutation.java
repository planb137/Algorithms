package cn.nuaa.edu.offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author planb
 * @date 2020/6/22 11:59
 * 备注：
 */
public class TotalPermutation {
    public  static List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums){
        if(nums == null){
            result = null;
            return result;
        }
        ArrayList<Integer> path = new ArrayList<>();
        backtrack(nums,path);
        return result;
    }

    public  void backtrack(int[] input,ArrayList<Integer> path){
        if(path.size() == input.length ){
            result.add(new ArrayList(path));
            return;
        }

        for(int i = 0; i < input.length; i++){
            if(path.contains(input[i])){
                continue;
            }
            path.add(input[i]);
            backtrack(input,path);
            path.remove(path.size()-1);
        }
        return;
    }
    public static void main(String[] args) {
        int[] input = {1};
        new TotalPermutation().permute(input);

        for (List<Integer> rs : TotalPermutation.result){
            System.out.println(rs.toString());
        }
    }
}
