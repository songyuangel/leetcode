//给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c。 
//
// 示例1: 
//
// 
//输入: 5
//输出: True
//解释: 1 * 1 + 2 * 2 = 5
// 
//
// 
//
// 示例2: 
//
// 
//输入: 3
//输出: False
// 
// Related Topics 数学
//2019-11-19 ok
//方法三：费马平方和定理
//费马平方和定理告诉我们：
//
//一个非负整数 c 能够表示为两个整数的平方和，当且仅当 c 的所有形如 4k+3 的质因子的幂次均为偶数。
//

  
  package pers.song.leetcode.editor.cn;
  public class SumOfSquareNumbers{
      public static void main(String[] args) {
           Solution solution = new SumOfSquareNumbers().new Solution();
           System.out.println(solution.judgeSquareSum(4));

      }
      

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean judgeSquareSum(int c) {
        int n = (int)Math.ceil(Math.sqrt(c));
        //boolean flag = false;
        for(int i=0 ; i <= n ; i ++){
            double b = Math.sqrt(c - i*i);
            if(b ==(int)b ){
                return true;
            }
        }
        //System.out.println(n);
        return false;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }