//给你一个字符串数组 words ，只返回可以使用在 美式键盘 同一行的字母打印出来的单词。键盘如下图所示。 
//
// 美式键盘 中： 
//
// 
// 第一行由字符 "qwertyuiop" 组成。 
// 第二行由字符 "asdfghjkl" 组成。 
// 第三行由字符 "zxcvbnm" 组成。 
// 
//
// 
//
// 
//
// 示例 1： 
//
// 
//输入：words = ["Hello","Alaska","Dad","Peace"]
//输出：["Alaska","Dad"]
// 
//
// 示例 2： 
//
// 
//输入：words = ["omk"]
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：words = ["adsdf","sfd"]
//输出：["adsdf","sfd"]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= words.length <= 20 
// 1 <= words[i].length <= 100 
// words[i] 由英文字母（小写和大写字母）组成 
// 
// Related Topics 哈希表 
// 👍 122 👎 0

  
  package pers.song.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KeyboardRow{
      public static void main(String[] args) {
           Solution solution = new KeyboardRow().new Solution();
           String[] words =new String[]{"Hello","Alaska","Dad","Peace"};
           String[] out = solution.findWords(words);
           for(String o : out){
               System.out.println(o);
           }

      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String[] findWords(String[] words) {
        Character[] cline1 = new Character[]{'q','w','e','r','t','y','u','i','o','p'};
        List<Character> line1 = Arrays.asList(cline1);
        Character[] cline2 = new Character[]{'a','s','d','f','g','h','j','k','l'};
        List<Character> line2 = Arrays.asList(cline2);
        Character[] cline3 = new Character[]{'z','x','c','v','b','n','m'};
        List<Character> line3 = Arrays.asList(cline3);

        List<String> result = new ArrayList<>();

        for(int i = 0 ; i < words.length ; i ++){
            int current = 0 ;
            for(int j = 0 ; j < words[i].length();j++){
                char cc = words[i].toLowerCase().charAt(j);
                if(j == 0){
                    if(line1.contains(cc)){
                        current = 1;
                    }else if(line2.contains(cc)){
                        current = 2;
                    }else if(line3.contains(cc)){
                        current = 3;
                    }
                }

                boolean nopass=false;
                switch (current){
                    case 1:
                        if(! line1.contains(cc)) nopass = true;
                        break;
                    case 2:
                        if(! line2.contains(cc)) nopass = true;
                        break;
                    case 3:
                        if(! line3.contains(cc)) nopass = true;
                        break;
                }
                if (nopass) break;

                if(j == words[i].length() - 1){
                    result.add(words[i]);
                }

            }

        }
        return result.toArray(new String[result.size()]);

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }