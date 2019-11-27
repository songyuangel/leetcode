//给定两个数组，编写一个函数来计算它们的交集。 
//
// 示例 1: 
//
// 输入: nums1 = [1,2,2,1], nums2 = [2,2]
//输出: [2]
// 
//
// 示例 2: 
//
// 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//输出: [9,4] 
//
// 说明: 
//
// 
// 输出结果中的每个元素一定是唯一的。 
// 我们可以不考虑输出结果的顺序。 
// 
// Related Topics 排序 哈希表 双指针 二分查找
  
  package pers.song.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArrays{
      public static void main(String[] args) {
           Solution solution = new IntersectionOfTwoArrays().new Solution();
           int[] a = {1,2,2,1};
           int[] b = {2,2};
           System.out.println(solution.intersection(a,b));
      }
      

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();
        List<Integer> reslut = new ArrayList<>();
        for(int i = 0 ; i < nums1.length ; i++){
            map.put(nums1[i],1);
        }
        for(int i = 0 ; i < nums2.length ; i++){
            if(map.containsKey(nums2[i])){
                map2.put(nums2[i],1);
            }
        }
        int[] resultint = new int[map2.size()];
        int index = 0 ;
        for (Map.Entry<Integer, Integer> entry : map2.entrySet()) {
            resultint[index] =  entry.getKey() ;
            index ++;
        }
        return resultint;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }