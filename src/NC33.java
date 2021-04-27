/**
 * @author jinlu
 * @create 2021-04-15 19:36
 */
public class NC33 {//合并两个有序链表

    public ListNode mergeTwoLists (ListNode l1, ListNode l2) {
        // write code here
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        //先处理头
        ListNode head = (l1.val <= l2.val)? l1:l2;
        ListNode tail = head;
        l1 = (head == l1)? l1.next:l1;
        l2 = (head == l2)? l2.next:l2;
        while(l1 != null && l2 != null)
        {
            if(l1.val <= l2.val){
                tail.next = l1;
                l1 = l1.next;
            }else{
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        tail.next = (l1 == null)? l2 : l1;
        return head;
    }
}
 class ListNode {
     int val;
     ListNode next = null;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }