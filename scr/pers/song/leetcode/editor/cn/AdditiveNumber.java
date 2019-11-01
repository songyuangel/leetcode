//累加数是一个字符串，组成它的数字可以形成累加序列。 
//
// 一个有效的累加序列必须至少包含 3 个数。除了最开始的两个数以外，字符串中的其他数都等于它之前两个数相加的和。 
//
// 给定一个只包含数字 '0'-'9' 的字符串，编写一个算法来判断给定输入是否是累加数。 
//
// 说明: 累加序列里的数不会以 0 开头，所以不会出现 1, 2, 03 或者 1, 02, 3 的情况。 
//
// 示例 1: 
//
// 输入: "112358"
//输出: true 
//解释: 累加序列为: 1, 1, 2, 3, 5, 8 。1 + 1 = 2, 1 + 2 = 3, 2 + 3 = 5, 3 + 5 = 8
// 
//
// 示例 2: 
//
// 输入: "199100199"
//输出: true 
//解释: 累加序列为: 1, 99, 100, 199。1 + 99 = 100, 99 + 100 = 199 
//
// 进阶: 
//你如何处理一个溢出的过大的整数输入? 
// Related Topics 回溯算法
//2019-10-29 ok
  
package pers.song.leetcode.editor.cn;
public class AdditiveNumber{
    public static void main(String[] args) {
        Solution solution = new AdditiveNumber().new Solution();
        System.out.println(solution.isAdditiveNumber("1231242471"));
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isAdditiveNumber(String num) {
        if(num.length() < 3) return false;
        int strMaxLen = num.length() / 2 ;
        //boolean flag = false;
        for(int i = 0 ; i < strMaxLen ; i++){
            String str1 = num.substring(0,i+1);
            int strLen = i + 1;
            for(int j = 0 ; j < strMaxLen ; j ++){
                String str2 = num.substring(strLen  , strLen + j + 1);
                String str3 = num.substring(str1.length() + str2.length());
                if(backtrack(str1,str2,str3)){
                    return true;
                }
            }


        }

        return false;
    }

    private boolean backtrack(String str1,String str2,String str3){
        if(str3.length() < Math.max(str1.length(),str2.length()) || (str1.length() > 1 && str1.charAt(0) == '0' )|| (str2.length() > 1 && str2.charAt(0) == '0' )||(str3.length() > 1 && str3.charAt(0) == '0') )
            return false;
        long num3 = Long.parseLong(str1) + Long.parseLong(str2);
        String str33 = String.valueOf(num3);
        if(str3.startsWith(str33) ){
            if(str3.length() == str33.length()) return true;
            String str11 = str2;
            String str22 = str33;
            String str333 = str3.substring(str33.length());
            return backtrack(str11,str22,str333);
        }else{
            return false;

        }

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}