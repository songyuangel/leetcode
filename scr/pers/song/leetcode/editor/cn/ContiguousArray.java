//给定一个二进制数组, 找到含有相同数量的 0 和 1 的最长连续子数组（的长度）。 
//
// 
//
// 示例 1: 
//
// 输入: [0,1]
//输出: 2
//说明: [0, 1] 是具有相同数量0和1的最长连续子数组。 
//
// 示例 2: 
//
// 输入: [0,1,0]
//输出: 2
//说明: [0, 1] (或 [1, 0]) 是具有相同数量0和1的最长连续子数组。 
//
// 
//
// 注意: 给定的二进制数组的长度不会超过50000。 
// Related Topics 哈希表
//2019-10-21 OK
  
package pers.song.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray{
    public static void main(String[] args) {
        Solution solution = new ContiguousArray().new Solution();
        int[] nums = {0,0,1,1,0,1,0,1,0,1,0,0,0,1,1,1,1,1,0,0,1,0,0,1,1,0,1,1,0,0,1,0,0,0,1,0,0,1,0,1,0,0,1,0,1,1,1,0,0,1,1,0,0,1,1,0,0,0,1,0,1,0,0,1,1,0,0,1,0,1,0,0,0,0,0,1,0,1,1,0,0,1,1,0,0,1,0,1,0,0,0,1,1,0,1,1,1,0,0,1};
        int result = solution.findMaxLength(nums);
        System.out.println(result + "");
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findMaxLength(int[] nums) {
        //暴力求解 超出时间限制
//        int zeroCount = 0;
//        int oneCount = 0;
//        int maxCount = 0;
//        int result = 0;
//
//        for(int i : nums){
//            if( i == 0){
//                zeroCount ++;
//            }else{
//                oneCount ++;
//            }
//        }
//        if(zeroCount == oneCount){
//            result = nums.length;
//            return result;
//        }
//        maxCount = (zeroCount < oneCount ? oneCount : zeroCount);
//        if(maxCount > nums.length/2){
//            maxCount = (zeroCount > oneCount ? oneCount : zeroCount) * 2;
//        }else{
//            maxCount = maxCount * 2;
//        }
//        for(int i = 0 ; i < nums.length ; i++){
//            int zero = 0 ;
//            int one = 0 ;
//            for(int j = 0 ; j < maxCount ; j++){
//                if(i + j >= nums.length){
//                    break;
//                }
//                if( nums[ i + j] == 0){
//                    zero ++;
//                }else{
//                    one ++;
//                }
//                if(zero == one && (zero*2) > result ){
//                    result = zero * 2;
//                }
//                if((zero == one) && (zero * 2 == maxCount)){
//                    return maxCount;
//                }
//            }
//        }

        Map<Integer, Integer> map = new HashMap();
        map.put(0,-1);
        int maxLen = 0,count = 0;

        for(int i = 0 ; i < nums.length ;i++){
            count = count + (nums[i] == 1 ? 1 : -1);
            if(map.containsKey(count)){
                maxLen = Math.max(maxLen , i - map.get(count));
            }else{
                map.put(count,i);
            }

        }


        return maxLen;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}