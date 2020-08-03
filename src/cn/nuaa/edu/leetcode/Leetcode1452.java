package cn.nuaa.edu.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author planb
 * @date 2020/8/3 13:13
 * 备注：收藏清单1452
 * 给你一个数组 favoriteCompanies ，其中 favoriteCompanies[i] 是第 i 名用户收藏的公司清单（下标从 0 开始）。
 *
 * 请找出不是其他任何人收藏的公司清单的子集的收藏清单，并返回该清单下标。下标需要按升序排列。
 */
public class Leetcode1452 {
    public List<Integer> peopleIndexes(List<List<String>> strs) {
        for(List<String> list :strs){
            Collections.sort(list);
        }
        int n = strs.size();
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            boolean isSub = false;
            for (int j = 0; j < n; j++) {
                if(i != j){
                    List<String> l = strs.get(i);
                    List<String> r = strs.get(j);
                    int a = 0;
                    for (int k = 0; k < r.size() && a <l.size(); k++) {
                        if(l.get(a).equals(r.get(k))){
                            a++;
                        }
                    }
                    if(l.size() == a){
                        isSub = true;
                    }
                }
            }
            if(!isSub){
                res.add(i);
            }
        }
        return res;
    }
}
