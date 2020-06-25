package cn.nuaa.edu.practice;

import java.util.HashMap;
import java.util.List;

/**
 * @author planb
 * @date 2020/6/25 16:48
 * 备注：
 */
public class WordBreak {
    HashMap<String,Boolean> map =  new HashMap<String,Boolean>();
    public boolean wordBreak(String s, List<String> wordDict) {
            boolean[] dp = new boolean[s.length()+1];
            for (String s1 : wordDict){
                map.put(s1,true);
            }
            dp[0] = true;
            for(int i = 1;i<=s.length();i++){
                for (int j=i-1;j>=0;j--){
                    dp[i] =(dp[j] && check(s.substring(j,i)));
                    if (dp[i]){
                        break;
                    }
                }
            }
            return dp[s.length()];
    }

    public boolean check(String s){
        return map.getOrDefault(s,false);
    }
}
