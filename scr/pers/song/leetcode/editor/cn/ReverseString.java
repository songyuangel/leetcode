//编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。 
//
// 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。 
//
// 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。 
//
// 
//
// 示例 1： 
//
// 输入：["h","e","l","l","o"]
//输出：["o","l","l","e","h"]
// 
//
// 示例 2： 
//
// 输入：["H","a","n","n","a","h"]
//输出：["h","a","n","n","a","H"] 
// Related Topics 双指针 字符串
//不借助第三个变量，来交换两个变量的值
//      int a,b;
//      a=10;b=12;
//      a=b-a; //a=2;b=12
//      b=b-a; //a=2;b=10
//      a=b+a; //a=10;b=10
//ok 2019-10-24
  
  package pers.song.leetcode.editor.cn;
  public class ReverseString{
      public static void main(String[] args) {
           Solution solution = new ReverseString().new Solution();
           char[] chars = {'h','e','l','l','o'};
           solution.reverseString(chars);
           System.out.println(chars);
      }
      

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void reverseString(char[] s) {
        for(int i =0 ,j = s.length - 1; j > i ; i++ , j--){
            s[i] =(char) ((int)s[j] - (int)s[i]);
            s[j] =(char) ((int)s[j] - (int)s[i]);
            s[i] =(char) ((int)s[j] + (int)s[i]);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }