//给定两个二进制字符串，返回他们的和（用二进制表示）。 
//
// 输入为非空字符串且只包含数字 1 和 0。 
//
// 示例 1: 
//
// 输入: a = "11", b = "1"
//输出: "100" 
//
// 示例 2: 
//
// 输入: a = "1010", b = "1011"
//输出: "10101" 
// Related Topics 数学 字符串
//2019-11-13 ok 不能直接将二进制转成int或者long，位数太长会超出范围
  
  package pers.song.leetcode.editor.cn;
  public class AddBinary{
      public static void main(String[] args) {
           Solution solution = new AddBinary().new Solution();
           String a = "11";
           String b = "1";
           System.out.println(solution.addBinary(a,b));
      }
      

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String addBinary(String a, String b) {
        int alength = a.length();
        int blength = b.length();
        int maxLength = Math.max(alength,blength);
        String as = new StringBuilder(a).reverse().toString();
        String bs = new StringBuilder(b).reverse().toString();
        StringBuilder result = new StringBuilder();
        char add = '0';
        for(int i = 0 ; i < maxLength ; i ++){
            char ac,bc;
            if( i < alength)
                ac = as.charAt(i) ;
            else
                ac = '0';
            if( i < blength)
                bc = bs.charAt(i) ;
            else
                bc = '0';

            if(ac=='1' && bc=='1'){
                if(add == '1'){
                    result.append('1');
                    add = '1';
                }else{
                    result.append('0');
                    add = '1';
                }
            }else if((ac=='1' || bc=='1') && add == '1'){
                result.append('0');
                add = '1';
            }else if(ac=='0' && bc=='0'){
                result.append(add);
                add = '0';
            }else{
                result.append((char)Math.max(ac,bc));
                add = '0';
            }

        }
        if(add == '1') result.append('1');

        return result.reverse().toString();

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }