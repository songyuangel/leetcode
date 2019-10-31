//给你一个字符串 text，你需要使用 text 中的字母来拼凑尽可能多的单词 "balloon"（气球）。 
//
// 字符串 text 中的每个字母最多只能被使用一次。请你返回最多可以拼凑出多少个单词 "balloon"。 
//
// 
//
// 示例 1： 
//
// 
//
// 输入：text = "nlaebolko"
//输出：1
// 
//
// 示例 2： 
//
// 
//
// 输入：text = "loonbalxballpoon"
//输出：2
// 
//
// 示例 3： 
//
// 输入：text = "leetcode"
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// 1 <= text.length <= 10^4 
// text 全部由小写英文字母组成 
// 
// Related Topics 哈希表 字符串
//2019-10-31 ok
  
package pers.song.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfBalloons{
    public static void main(String[] args) {
        Solution solution = new MaximumNumberOfBalloons().new Solution();
        System.out.println(solution.maxNumberOfBalloons("leetcode"));
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('b',0);
        map.put('a',0);
        map.put('l',0);
        map.put('o',0);
        map.put('n',0);

        for(int i = 0 ; i < text.length();i++){
            char c = text.charAt(i);
            if(map.get(c) != null){
                int r = map.get(c);
                map.put(c,r+1);
            }
        }
        int bb = map.get('b');
        int aa = map.get('a');
        int ll = (int)Math.floor(map.get('l') / 2.0);
        int oo = (int)Math.floor(map.get('o') / 2.0);
        int nn = map.get('n');

        int result = aa;
        if(result > bb){
            result = bb ;
        }
        if(result > ll){
            result = ll ;
        }
        if(result > oo){
            result = oo ;
        }
        if(result > nn){
            result = nn ;
        }


        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}