//给你一个 m * n 的矩阵，矩阵中的数字 各不相同 。请你按 任意 顺序返回矩阵中的所有幸运数。 
//
// 幸运数是指矩阵中满足同时下列两个条件的元素： 
//
// 
// 在同一行的所有元素中最小 
// 在同一列的所有元素中最大 
// 
//
// 
//
// 示例 1： 
//
// 输入：matrix = [[3,7,8],[9,11,13],[15,16,17]]
//输出：[15]
//解释：15 是唯一的幸运数，因为它是其所在行中的最小值，也是所在列中的最大值。
// 
//
// 示例 2： 
//
// 输入：matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
//输出：[12]
//解释：12 是唯一的幸运数，因为它是其所在行中的最小值，也是所在列中的最大值。
// 
//
// 示例 3： 
//
// 输入：matrix = [[7,8],[1,2]]
//输出：[7]
// 
//
// 
//
// 提示： 
//
// 
// m == mat.length 
// n == mat[i].length 
// 1 <= n, m <= 50 
// 1 <= matrix[i][j] <= 10^5 
// 矩阵中的所有元素都是不同的 
// 
// Related Topics 数组 
// 👍 33 👎 0

  
  package pers.song.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersInAMatrix{
      public static void main(String[] args) {
           Solution solution = new LuckyNumbersInAMatrix().new Solution();
           int[][] arr = new int[][]{{3,7,8},{9,11,13},{15,16,17}};
           List<Integer> result = solution.luckyNumbers(arr);
           for(Integer i : result){
               System.out.println(i);
           }
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int[][] visit = new int[matrix.length][matrix[0].length];
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j<matrix[i].length;j++){
                if(visit[i][j] == 0){
                    int current = matrix[i][j];
                    boolean linemin = false;
                    boolean columnmax = false;

                    for(int ii = 0 ; ii<matrix.length ; ii ++){ //列
                        if(ii == i ) {
                            if(ii == matrix.length - 1){
                                columnmax = true;
                            }
                            continue;
                        }
                        int next = matrix[ii][j];
                        if(next > current){
                            break;
                        }
                        if(ii == matrix.length - 1){
                            columnmax = true;
                        }
                    }

                    for(int jj = 0 ; jj<matrix[i].length ; jj ++){ //行
                        if(jj == j ) {
                            if (jj == matrix[i].length - 1){
                                linemin = true;
                            }
                            continue;
                        }
                        int next = matrix[i][jj];
                        if (next < current){
                            break;
                        }
                        if (jj == matrix[i].length - 1){
                            linemin = true;
                        }
                    }

                    if(columnmax && linemin){
                        visit[i][j] = 1;
                        for(int iii = 0 ; iii < visit.length ;iii++){
                            if (iii != i) visit[iii][j] = 2;
                        }

                        for(int jjj = 0 ; jjj < visit[i].length ;jjj++){
                            if (jjj != j) visit[i][jjj] = 2;
                        }

                    }else{
                        visit[i][j] = 2;
                    }



                }


            }
        }

        List<Integer> result = new ArrayList<>();
        for(int i = 0 ; i < visit.length ; i++){
            for(int j = 0 ; j < visit[i].length; j ++){
                if(visit[i][j] == 1){
                    result.add(matrix[i][j]);
                }
            }
        }

        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }