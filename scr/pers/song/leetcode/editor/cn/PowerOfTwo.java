//给定一个整数，编写一个函数来判断它是否是 2 的幂次方。 
//
// 示例 1: 
//
// 输入: 1
//输出: true
//解释: 20 = 1 
//
// 示例 2: 
//
// 输入: 16
//输出: true
//解释: 24 = 16 
//
// 示例 3: 
//
// 输入: 218
//输出: false 
// Related Topics 位运算 数学
//二进制下，2的幂只会有一位是‘1’。
//恒有 n & (n - 1) == 0，这是因为：
// n二进制最高位为 1，其余所有位为 0；
// n - 1 二进制最高位为 0，其余所有位为 1；
//2019-11-01 ok

  
  package pers.song.leetcode.editor.cn;
  public class PowerOfTwo{
      public static void main(String[] args) {
           Solution solution = new PowerOfTwo().new Solution();
           System.out.print(solution.isPowerOfTwo(5));
      }
      

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPowerOfTwo(int n) {
        return (n>0) && ((n&(n-1)) == 0) ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }