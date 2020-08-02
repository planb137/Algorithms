package cn.nuaa.edu.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author planb
 * @date 2020/8/2 17:25
 * 备注：1472. 设计浏览器历史记录
 */
class BrowserHistory {
    List<String> res = new ArrayList<>();
    int cur;

    public BrowserHistory(String homepage) {
        res.add(homepage);
        cur = 0;
    }

    public void visit(String url) {
        while(cur != res.size()-1){
            res.remove(res.size()-1);
        }
        res.add(url);
        cur++;
    }

    public String back(int steps) {
        cur = Math.max(0,cur - steps);
        return  res.get(cur);

    }

    public String forward(int steps) {
        cur = Math.min(res.size()-1,steps + cur);
        return  res.get(cur);

    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */