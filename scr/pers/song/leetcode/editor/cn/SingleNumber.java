//给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。 
//
// 说明： 
//
// 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？ 
//
// 示例 1: 
//
// 输入: [2,2,1]
//输出: 1
// 
//
// 示例 2: 
//
// 输入: [4,1,2,1,2]
//输出: 4 
// Related Topics 位运算 哈希表
//2019-11-19 ok
//   异或运算(^)
//   运算规则：0^0=0；   0^1=1；   1^0=1；   1^1=0；
//
//　　即：参加运算的两个对象，如果两个相应位为“异”（值不同），则该位结果为1，否则为0。
  
  package pers.song.leetcode.editor.cn;
  public class SingleNumber{
      public static void main(String[] args) {
           Solution solution = new SingleNumber().new Solution();
           int[] a = {4,1,2,1,2};
           System.out.println(solution.singleNumber(a));
      }
      

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int singleNumber(int[] nums) {
        int ans = nums[0];
        for(int i = 1 ; i < nums.length ; i ++){
            ans = ans ^ nums[i];
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }