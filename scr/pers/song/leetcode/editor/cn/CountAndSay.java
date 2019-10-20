//报数序列是一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下： 
//
// 1.     1
//2.     11
//3.     21
//4.     1211
//5.     111221
// 
//
// 1 被读作 "one 1" ("一个一") , 即 11。 
//11 被读作 "two 1s" ("两个一"）, 即 21。 
//21 被读作 "one 2", "one 1" （"一个二" , "一个一") , 即 1211。 
//
// 给定一个正整数 n（1 ≤ n ≤ 30），输出报数序列的第 n 项。 
//
// 注意：整数顺序将表示为一个字符串。 
//
// 
//
// 示例 1: 
//
// 输入: 1
//输出: "1"
// 
//
// 示例 2: 
//
// 输入: 4
//输出: "1211"
// 
// Related Topics 字符串
//2019-10-20 ok
  
package pers.song.leetcode.editor.cn;;
public class CountAndSay{
    public static void main(String[] args) {
        Solution solution = new CountAndSay().new Solution();
        String result = solution.countAndSay(6);
        System.out.println(result);
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String countAndSay(int n) {
        /**
         * 6. 312211
         */
        StringBuffer result = new StringBuffer();

        if(n == 1){

            return "1";
        }

        if(n == 2){
            return "11";
        }

        String temp = countAndSay(n-1);
        char lastChar = '0';
        int lastCount = 0;
        for(int index = 0 ; index < temp.length() ; index ++){
            if(index == 0 ){
                lastChar = temp.charAt(index);
                lastCount ++ ;
                continue;
            }
            if(lastChar != temp.charAt(index)){
                //result = result + lastCount + lastChar   ;
                result.append(lastCount).append(lastChar);
                lastChar = temp.charAt(index) ;
                lastCount = 1;
                if(index == temp.length() - 1){
                    result.append(lastCount).append(lastChar);
                }
            }else{
                lastCount ++ ;
                if(index == temp.length() - 1){
                    result.append(lastCount).append(lastChar);
                }
            }

        }

        return result.toString();

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}