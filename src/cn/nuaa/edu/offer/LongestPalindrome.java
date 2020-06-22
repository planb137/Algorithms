package cn.nuaa.edu.offer;

/**
 * @author planb
 * @date 2020/6/22 22:17
 * 备注：
 */
public class LongestPalindrome {
    public String longestPalindrome(String s) {
        if(s.length() < 2){
            return s;
        }
        int maxLength = 1;
        int begin = 0;
        char[] arr = s.toCharArray();
        for(int i =0;i<arr.length-1;i++){
            for(int j = i+1 ; j<arr.length;j++){
                if( j-i+1>maxLength && isValid(arr,i,j) ){
                    maxLength = j-i+1;
                    begin = i;
                }
            }
        }
        return s.substring(begin,begin+maxLength);
    }

    public boolean isValid(char[] str,int start,int end){
        int i = start;
        int j = end;
        while (i<j){
            if (str[i]!=str[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
