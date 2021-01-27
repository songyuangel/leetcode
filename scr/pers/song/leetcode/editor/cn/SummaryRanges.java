//给定一个无重复元素的有序整数数组，返回数组区间范围的汇总。 
//
// 示例 1: 
//
// 输入: [0,1,2,4,5,7]
//输出: ["0->2","4->5","7"]
//解释: 0,1,2 可组成一个连续的区间; 4,5 可组成一个连续的区间。 
//
// 示例 2: 
//
// 输入: [0,2,3,4,6,8,9]
//输出: ["0","2->4","6","8->9"]
//解释: 2,3,4 可组成一个连续的区间; 8,9 可组成一个连续的区间。 
// Related Topics 数组
//2019-11-19 ok 有一个测试用例是空数组...
  
  package pers.song.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges{
      public static void main(String[] args) {
           Solution solution = new SummaryRanges().new Solution();
           int[] a = {0,1,2,3,4,6,8,9,10,12,13,15};
           List<String> s = solution.summaryRanges(a);
           System.out.println(s);
      }
      

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if(nums.length<=0 ){
            return result;
        }
        int last = nums[0];
        int first = nums[0];
        StringBuilder sb;

        boolean start = false;
        for(int i = 1 ; i < nums.length ; i++){

            if(last + 1 == nums[i]){
                last = nums[i];
                continue;
            }else{
                sb = new StringBuilder();

                if(first == last) {
                    sb.append(first);
                }else{
                    sb.append(first).append("->").append(last);
                }
                result.add(sb.toString());
                first = nums[i];
                last = nums[i];
            }

        }

        sb = new StringBuilder();
        if(first == last) {
            sb.append(first);
        }else{
            sb.append(first).append("->").append(last);
        }
        result.add(sb.toString());
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }