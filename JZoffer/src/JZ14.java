/**
 * @author jinlu
 * @create 2021-04-22 14:22
 */
public class JZ14 {//输入一个链表，输出该链表中倒数第k个结点。如果该链表长度小于k，请返回空。
    public ListNode FindKthToTail (ListNode pHead, int k) {
        int length=0;
        ListNode head=pHead;
        while (head!=null){
            length++;
            head=head.next;
        }
        if (k>length) return null;
        for (int i = 0; i < length - k ; i++) {
            pHead=pHead.next;
        }
        return pHead;
    }
}
