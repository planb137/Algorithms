package cn.nuaa.edu.practice;

/**
 * @author planb
 * @date 2020/6/23 13:25
 * 备注：
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuffer str = new StringBuffer();
        int maxLen = Math.max(a.length(),b.length());
        int jinwei = 0;
        for (int i = 0;i<maxLen ;i++){
            jinwei += i<a.length() ? (char)((a.charAt(a.length()-i-1)-'0')) : 0;
            jinwei += i<b.length() ? (char)((b.charAt(b.length()-i-1)-'0')) : 0;
            int temp = jinwei % 2;
            str.append((char)(temp+'0'));
            jinwei /= 2;
        }
        if(jinwei>0){
            str.append(1);
        }
        str.reverse();
        return str.toString();
    }
}
