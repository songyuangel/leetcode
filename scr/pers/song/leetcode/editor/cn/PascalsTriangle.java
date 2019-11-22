//给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。 
//
// 
//
// 在杨辉三角中，每个数是它左上方和右上方的数的和。 
//
// 示例: 
//
// 输入: 5
//输出:
//[
//     [1],
//    [1,1],
//   [1,2,1],
//  [1,3,3,1],
// [1,4,6,4,1]
//] 
// Related Topics 数组
//2019-11-22 ok
  
  package pers.song.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle{
      public static void main(String[] args) {
           Solution solution = new PascalsTriangle().new Solution();
           System.out.println(solution.generate(5));
      }
      

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0 ; i < numRows ; i++){
            List<Integer> cur = new ArrayList<>();
            if(i==0){
                cur.add(1);
                result.add(cur);
                continue;
            }
            for(int j = 0 ; j <= i;j++){
                if(j==0 || j==i ){
                    cur.add(1);
                }else{
                    cur.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
                }
            }
            result.add(cur);

        }

        return result;
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }