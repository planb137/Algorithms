package cn.nuaa.edu.leetcode;

/**
 * @author planb
 * @date 2020/8/5 15:16
 * 备注：reverseWords2
 */
public class leetcode151 {
    public String reverseWords(String s1) {
        StringBuffer res = new StringBuffer();
        int k = 0;
        char[] s = s1.toCharArray();
        for(int i = 0; i < s.length; i++){
            if(s[i] == ' '){
                continue;
            }
            int j = i,t = k;
            while(s[i] != ' ' && j < s.length){
                s[t++] = s[j++];
            }
            String sb = new StringBuffer(new String(s1.substring(k, t))).reverse().toString();
            res.append(sb).append(" ");
            k = t;
            i = j;
        }
       res.replace(k, res.length(), " ");
       res.reverse();
      return res.toString().trim();
    }

    public String reverseWords2(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        // 删除首尾空格，分割字符串
        String[] arr = s.trim().split(" ");

        StringBuilder ans = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            // 遇到空单词则跳过
            if (arr[i].equals("")) {
                continue;
            }
            // 将单词拼接至 ans
            ans.append(arr[i] + " ");

        }
        // 转化为字符串，删除尾部空格，并返回
        return ans.toString().trim();
    }


}
