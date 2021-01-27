//给定一个整数序列：a1, a2, ..., an，一个132模式的子序列 ai, aj, ak 被定义为：当 i < j < k 时，ai < ak < aj。设计一个算法，当给定有 n 个数字的序列时，验证这个序列中是否含有132模式的子序列。 
//
// 注意：n 的值小于15000。 
//
// 示例1: 
//
// 
//输入: [1, 2, 3, 4]
//
//输出: False
//
//解释: 序列中不存在132模式的子序列。
// 
//
// 示例 2: 
//
// 
//输入: [3, 1, 4, 2]
//
//输出: True
//
//解释: 序列中有 1 个132模式的子序列： [1, 4, 2].
// 
//
// 示例 3: 
//
// 
//输入: [-1, 3, 2, 0]
//
//输出: True
//
//解释: 序列中有 3 个132模式的的子序列: [-1, 3, 2], [-1, 3, 0] 和 [-1, 2, 0].
// 
// Related Topics 栈
/**
 * 从后往前遍历找到符合条件的次大值（注意只用找次大值）
 * 之后只需要和次大数值比较即可，如果当前元素<次大值则返回true
 *
 * 寻找右面符合条件的最大值和次大值的方法如下：
 *
 * 如果当前元素小于栈顶元素，则入栈
 * 如果当前元素大于栈顶元素，则先出栈，出到当前元素小于栈顶元素（之前的一个局部最大值），同时将出栈元素赋给third
 * 2019-11-04 ok
 */
  
  package pers.song.leetcode.editor.cn;

import java.util.Stack;


public class One32Pattern{
      public static void main(String[] args) {
           Solution solution = new One32Pattern().new Solution();
           int[] a = {1, 2, 3, 4};
           System.out.println(solution.find132pattern(a));
      }
      

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        /*  运行失败:
		    Time Limit Exceeded
        for(int i=0 ; i < n;i++){
            int one = nums[i];
            for(int j = i+1;j< n;j++){
                int two = nums[j];
                for(int k = j+1;k< n ; k++){
                    int three = nums[k];
                    if(one < three && three < two){
                        return true;
                    }
                }

            }

        }
        */
        Stack<Integer> stack = new Stack<>();
        int third = java.lang.Integer.MIN_VALUE;
        for(int i = n - 1 ; i >= 0 ; i --){
            if(nums[i] < third) return true;
            while(!stack.isEmpty() && nums[i] > stack.peek()){
                third = stack.pop();
            }
            stack.push(nums[i]);

        }

        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }