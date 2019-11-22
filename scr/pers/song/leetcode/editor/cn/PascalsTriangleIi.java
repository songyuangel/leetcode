//给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。 
//
// 
//
// 在杨辉三角中，每个数是它左上方和右上方的数的和。 
//
// 示例: 
//
// 输入: 3
//输出: [1,3,3,1]
// 
//
// 进阶： 
//
// 你可以优化你的算法到 O(k) 空间复杂度吗？ 
// Related Topics 数组
//     [1],               1
//    [1,1],           1     1
//   [1,2,1],         1 (n-1) 1
//  [1,3,3,1],      1 (n-1) (n-1) 1
// [1,4,6,4,1]     1 (n-1) (n+1) (n-1) 1
//[1,5,10,10,5,1]
//杨辉三角的通用公式，第n行第m列：(n-1)!/[(m-1)!(n-m)!]
//2019-11-22 ok
  
  package pers.song.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleIi{
      public static void main(String[] args) {
           Solution solution = new PascalsTriangleIi().new Solution();
           System.out.println(solution.getRow(13));
      }
      

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> cur = new ArrayList<>();
        List<Integer> pre = new ArrayList<>();
        for(int i = 0 ; i <= rowIndex ; i ++){
            cur = new ArrayList<>();
            for(int j = 0 ; j <= i;j++){
                if(j==0 || j==i ){
                    cur.add(1);
                }else{
                    cur.add(pre.get(j-1) + pre.get(j));
                }
            }
            pre = cur;
        }
        return cur;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

  }