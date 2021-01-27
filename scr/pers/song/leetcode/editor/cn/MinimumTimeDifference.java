//给定一个 24 小时制（小时:分钟）的时间列表，找出列表中任意两个时间的最小时间差并已分钟数表示。 
//
// 
//示例 1： 
//
// 
//输入: ["23:59","00:00"]
//输出: 1
// 
//
// 
//备注: 
//
// 
// 列表中时间数在 2~20000 之间。 
// 每个时间取值在 00:00~23:59 之间。 
// 
// Related Topics 字符串
//2019-11-12 ok 不能用simpleDataFormat，将字符串转为分钟再比较
  
  package pers.song.leetcode.editor.cn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class MinimumTimeDifference{
      public static void main(String[] args) {
           Solution solution = new MinimumTimeDifference().new Solution();
           List<String> a = new ArrayList<>();
           a.add("23:59");
           a.add("00:00");
           System.out.println(solution.findMinDifference(a));
      }
      

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findMinDifference(List<String> timePoints) {
        Collections.sort(timePoints);
        int result = Integer.MAX_VALUE;

        for (int i = 1; i < timePoints.size(); i++) {

            int m1 = Integer.parseInt(timePoints.get(i - 1).split(":")[0]) * 60;
            int m2 = Integer.parseInt(timePoints.get(i - 1).split(":")[1]);
            int m3 = m1 + m2;
            int m11 = Integer.parseInt(timePoints.get(i).split(":")[0]) * 60;
            int m22 = Integer.parseInt(timePoints.get(i).split(":")[1]);
            int m33 = m11 + m22;

            int minute = Math.abs(m33 - m3);
            minute = Math.min(minute, 1440 - minute);
            result = Math.min(result, minute);
        }

        int m1 = Integer.parseInt(timePoints.get(0).split(":")[0]) * 60;
        int m2 = Integer.parseInt(timePoints.get(0).split(":")[1]);
        int m3 = m1 + m2;
        int m11 = Integer.parseInt(timePoints.get(timePoints.size() - 1).split(":")[0]) * 60;
        int m22 = Integer.parseInt(timePoints.get(timePoints.size() - 1).split(":")[1]);
        int m33 = m11 + m22;

        int minute = Math.abs(m33 - m3);
        minute = Math.min(minute, 1440 - minute);
        result = Math.min(result, minute);

        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }