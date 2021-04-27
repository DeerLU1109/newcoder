/**
 * @author jinlu
 * @create 2021-04-26 9:07
 */
public class Leetcode203 {//给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
    public ListNode removeElements(ListNode head, int val) {
        ListNode pre=new ListNode(0);
        pre.next=head;
        ListNode res=pre;
        ListNode cur=head;
        while (cur!=null){
            if (cur.val==val){
                ListNode next=cur.next;
                pre.next=next;
                cur=pre.next;

            }
            else{
                pre=cur;
                cur=cur.next;
            }
        }
        return res.next;
    }

}
