//你要开发一座金矿，地质勘测学家已经探明了这座金矿中的资源分布，并用大小为 m * n 的网格 grid 进行了标注。每个单元格中的整数就表示这一单元格中的黄金数量；如果该单元格是空的，那么就是 0。 
//
// 为了使收益最大化，矿工需要按以下规则来开采黄金： 
//
// 
// 每当矿工进入一个单元，就会收集该单元格中的所有黄金。 
// 矿工每次可以从当前位置向上下左右四个方向走。 
// 每个单元格只能被开采（进入）一次。 
// 不得开采（进入）黄金数目为 0 的单元格。 
// 矿工可以从网格中 任意一个 有黄金的单元格出发或者是停止。 
// 
//
// 
//
// 示例 1： 
//
// 输入：grid = [[0,6,0],[5,8,7],[0,9,0]]
//输出：24
//解释：
//[[0,6,0],
// [5,8,7],
// [0,9,0]]
//一种收集最多黄金的路线是：9 -> 8 -> 7。
// 
//
// 示例 2： 
//
// 输入：grid = [[1,0,7],[2,0,6],[3,4,5],[0,3,0],[9,0,20]]
//输出：28
//解释：
//[[1,0,7],
// [2,0,6],
// [3,4,5],
// [0,3,0],
// [9,0,20]]
//一种收集最多黄金的路线是：1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= grid.length, grid[i].length <= 15 
// 0 <= grid[i][j] <= 100 
// 最多 25 个单元格中有黄金。 
// 
// Related Topics 回溯算法
  
  package pers.song.leetcode.editor.cn;
  public class PathWithMaximumGold{
      public static void main(String[] args) {
           Solution solution = new PathWithMaximumGold().new Solution();
           int[][] a = {{1,0,7},{2,0,6},{3,4,5},{0,3,0},{9,0,20}};
           System.out.println(solution.getMaximumGold(a));
      }
      

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int getMaximumGold(int[][] grid) {
        int mlength = grid.length;
        int nlength = grid[0].length;
        int result = 0 ;
        //grid2 = grid;
        for(int m = 0 ; m < mlength ; m++){
            for(int n = 0 ; n < nlength ; n++){
                //seached = new int[mlength][nlength];
                if(grid[m][n] != 0){
                    result = Math.max(result,nextStep(m,n,grid));
                }

            }
        }
        return result;
    }

    private int[][] dirs = {{1,0},{0,1},{-1,0},{0,-1}};

    //从m,n点出发
    private int nextStep(int m,int n,int[][] grid){
        //System.out.println("m:" + m +" n:" + n + " dir:" + dirIndex);
        if(m < 0 || m >= grid.length){
            return 0;
        }
        if(n < 0 || n >= grid[0].length){
            return 0;
        }
        if(grid[m][n] == 0){
            return 0;
        }

        int result = grid[m][n];
        grid[m][n] = 0 ;    //置为0，避免回溯的时候重复
        int ret = 0;
        for(int[] dir : dirs){
            int nR = m + dir[0], nC = n + dir[1];
            ret = Math.max(ret, result + nextStep(nR, nC,grid));

        }

        grid[m][n] = result;    //恢复


        return ret;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }