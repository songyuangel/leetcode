//给你一个整数 n，请你返回 任意 一个由 n 个 各不相同 的整数组成的数组，并且这 n 个数相加和为 0 。 
//
// 
//
// 示例 1： 
//
// 输入：n = 5
//输出：[-7,-1,1,3,4]
//解释：这些数组也是正确的 [-5,-1,1,2,3]，[-3,-1,2,-2,4]。
// 
//
// 示例 2： 
//
// 输入：n = 3
//输出：[-1,0,1]
// 
//
// 示例 3： 
//
// 输入：n = 1
//输出：[0]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 1000 
// 
// Related Topics 数组

  
  package pers.song.leetcode.editor.cn;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.util.Arrays;

public class FindNUniqueIntegersSumUpToZero{
      public static void main(String[] args) {
          Solution solution = new FindNUniqueIntegersSumUpToZero().new Solution();
          int[] result = solution.sumZero(5);
          System.out.println(Arrays.toString(result));
      }
      

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        int flag = 1;
        int step = 1;
        if(n%2 == 1){
            result[0] = 0 ;
            for(int i = 1; i < n; i++){
                result[i] = flag * step;
                flag = -1 * flag ;
                if(i%2 == 0){
                    step ++ ;
                }
            }
        }else{
            for(int i = 0; i < n; i++){
                result[i] = flag * step;
                flag = -1 * flag ;
                if(i%2 == 1){
                    step ++ ;
                }
            }
        }

        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }