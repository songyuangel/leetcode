//给定一个整数数组 nums，将该数组升序排列。 
//
// 
//
// 
// 
//
// 示例 1： 
//
// 
//输入：[5,2,3,1]
//输出：[1,2,3,5]
// 
//
// 示例 2： 
//
// 
//输入：[5,1,1,2,0,0]
//输出：[0,0,1,1,2,5]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= A.length <= 10000 
// -50000 <= A[i] <= 50000 
// 
//
//尝试用快速排序 2019-11-01 ok
  
  package pers.song.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortAnArray{
      public static void main(String[] args) {
           Solution solution = new SortAnArray().new Solution();
           int[] nums = {5,1,6,2,7,0};
           List result = solution.sortArray(nums);
           System.out.print(result);
      }
      

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> sortArray(int[] nums) {
        quickSort(nums,0,nums.length);

        List<Integer> result = new ArrayList<Integer>();
        for(int i : nums){
            result.add(i);
        }

        return result;
    }

    private void quickSort(int[] nums , int begin , int end){
        if(begin >= end - 1){
            return;
        }
        int lindex = begin;
        int rindex = end - 1;
        int std = nums[lindex];
        while (lindex < rindex)
        {
            while (lindex < rindex)
            {
                if (nums[rindex] < std)
                {
                    nums[lindex++] = nums[rindex];
                    break;
                }
                --rindex;
            }

            while (lindex < rindex)
            {
                if (nums[lindex] >= std)
                {
                    nums[rindex--] = nums[lindex];
                    break;
                }
                ++lindex;
            }
        }

        nums[lindex] = std;

        quickSort(nums,begin,lindex);
        quickSort(nums,lindex+1,end);

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }