//给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。 
//
// 示例 1: 
//
// 输入: "abcabcbb"
//输出: 3 
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
// 
//
// 示例 2: 
//
// 输入: "bbbbb"
//输出: 1
//解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
// 
//
// 示例 3: 
//
// 输入: "pwwkew"
//输出: 3
//解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
// 
// Related Topics 哈希表 双指针 字符串 Sliding Window
//2019-11-22 ok
  
  package pers.song.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters{
      public static void main(String[] args) {
           Solution solution = new LongestSubstringWithoutRepeatingCharacters().new Solution();
           System.out.println(solution.lengthOfLongestSubstring("dvdf"));
      }
      

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int length = 0;
        Map<Character ,Integer> map = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            char cur = s.charAt(i);
            if(map.containsKey(cur)){
                maxLength = Math.max(maxLength,length);
                i = map.get(cur);
                map.clear();
                length = 0;
            }else {
                map.put(cur,i);
                length ++ ;
            }
        }
        maxLength = Math.max(maxLength,length);
        return maxLength;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }