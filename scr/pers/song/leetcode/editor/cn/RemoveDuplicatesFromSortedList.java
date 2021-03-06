//给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。 
//
// 示例 1: 
//
// 输入: 1->1->2
//输出: 1->2
// 
//
// 示例 2: 
//
// 输入: 1->1->2->3->3
//输出: 1->2->3 
// Related Topics 链表
//2019-10-16 ok
package pers.song.leetcode.editor.cn;
public class RemoveDuplicatesFromSortedList{
    public static void main(String[] args) {

        Solution solution = new RemoveDuplicatesFromSortedList().new Solution();
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(2);
        second.next = third;
        first.next = second;
        ListNode result = solution.deleteDuplicates(first);
        System.out.println(result);

    }
    

//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;

        if(head.val == head.next.val){
            head = deleteDuplicates(head.next);
        }else{
            head.next = deleteDuplicates(head.next);
        }

        return  head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}