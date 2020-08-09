/*
 * @lc app=leetcode id=32 lang=java
 *
 * [32] Longest Valid Parentheses
 */

// @lc code=start
class Solution {
    public int longestValidParentheses(String s) {
        int maxans = 0;
        int dp[] = new int[s.length()];
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(') {
                    dp[i] = (i >= 2 ? dp[i - 2] : 0) + 2;
                } else if (i - dp[i - 1] > 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                    if(i - dp[i -1] -2>=0){
                        dp[i] = dp[i-1]+dp[i-dp[i-1]-2]+2;
                    }else{
                        dp[i] = dp[i-1]+2;
                    }
                }
                maxans = maxans>=dp[i]?maxans:dp[i];
            }
        }
        return maxans;
    }
}
// @lc code=end

