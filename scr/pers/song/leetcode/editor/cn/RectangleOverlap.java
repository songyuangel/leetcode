//矩形以列表 [x1, y1, x2, y2] 的形式表示，其中 (x1, y1) 为左下角的坐标，(x2, y2) 是右上角的坐标。 
//
// 如果相交的面积为正，则称两矩形重叠。需要明确的是，只在角或边接触的两个矩形不构成重叠。 
//
// 给出两个矩形，判断它们是否重叠并返回结果。 
//
// 示例 1： 
//
// 输入：rec1 = [0,0,2,2], rec2 = [1,1,3,3]
//输出：true
// 
//
// 示例 2： 
//
// 输入：rec1 = [0,0,1,1], rec2 = [1,0,2,1]
//输出：false
// 
//
// 说明： 
//
// 
// 两个矩形 rec1 和 rec2 都以含有四个整数的列表的形式给出。 
// 矩形中的所有坐标都处于 -10^9 和 10^9 之间。 
// 
// Related Topics 数学
//ok 2019-10-24
  
  package pers.song.leetcode.editor.cn;
  public class RectangleOverlap{
      public static void main(String[] args) {
           Solution solution = new RectangleOverlap().new Solution();
           int[] rec1 = {0,0,1,1};
           int[] rec2 = {1,0,2,1};
           boolean is = solution.isRectangleOverlap(rec1,rec2);
           System.out.println(is);
      }
      

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int x1,y1,x2,y2;
        int xx1,yy1,xx2,yy2;
        x1 = rec1[0];
        y1 = rec1[1];
        x2 = rec1[2];
        y2 = rec1[3];
        xx1 = rec2[0];
        yy1 = rec2[1];
        xx2 = rec2[2];
        yy2 = rec2[3];
        //完全重合
        if(x1 == xx1 && y1 == yy1 && x2 == xx2 && y2 == yy2) return true;
        //以第一个矩形为基准，分别对第二个矩形的四个点做判断
        //(xx1,yy1)
        if(xx2 <= x1) return false;
        //(xx1,yy2)
        if(yy2 <= y1) return false;
        //(xx2,yy1)
        if(yy1 >= y2) return false;
        //(xx2,yy2)
        if(xx1 >= x2) return false;

        return true;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }