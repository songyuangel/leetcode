//给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。 
//
// J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。 
//
// 示例 1: 
//
// 输入: J = "aA", S = "aAAbbbb"
//输出: 3
// 
//
// 示例 2: 
//
// 输入: J = "z", S = "ZZ"
//输出: 0
// 
//
// 注意: 
//
// 
// S 和 J 最多含有50个字母。 
// J 中的字符不重复。 
// 
// Related Topics 哈希表 
// 👍 621 👎 0

  
  package pers.song.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

public class JewelsAndStones{
      public static void main(String[] args) {
           Solution solution = new JewelsAndStones().new Solution();
           String J = "z";
           String S = "zZ";
           System.out.println(solution.numJewelsInStones(J,S));
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character,Integer> jewelsMap = new HashMap<>();
        for(int i = 0 ; i < jewels.length() ; i++){
            jewelsMap.put(jewels.charAt(i),0);
        }

        for(int j = 0 ; j < stones.length() ; j++){
            Character c = stones.charAt(j);
            Integer i = jewelsMap.get(c);
            if(i != null){
                jewelsMap.put(c,i+1);
            }
        }

        int result = 0 ;
        for (Integer value : jewelsMap.values()) {
            result += value;
        }
        return result;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }