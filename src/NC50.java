import org.omg.PortableServer.LIFESPAN_POLICY_ID;

/**
 * @author jinlu
 * @create 2021-04-25 15:06
 */

/*
* 将给出的链表中的节点每\ k k 个一组翻转，返回翻转后的链表
如果链表中的节点数不是\ k k 的倍数，将最后剩下的节点保持原样
你不能更改节点中的值，只能更改节点本身。
要求空间复杂度 \ O(1) O(1)
例如：
给定的链表是1\to2\to3\to4\to51→2→3→4→5
对于 \ k = 2 k=2, 你应该返回 2\to 1\to 4\to 3\to 52→1→4→3→5
对于 \ k = 3 k=3, 你应该返回 3\to2 \to1 \to 4\to 53→2→1→4→5
*/
public class NC50 {
    public ListNode reverseKGroup (ListNode head, int k) {
        ListNode res=new ListNode(0);
        res.next=head;
        ListNode pre=res;
        ListNode end=res;
        while (end.next!=null){
            for (int i = 0; i < k && end != null; i++) {
                end=end.next;
            }
            if (end==null) break;
            ListNode start=pre.next;
            ListNode next=end.next;

            end.next=null;
            pre.next=reverse(start);
            start.next=next;
            pre=start;
            end=pre;
        }
        return res.next;
    }

    public ListNode reverse(ListNode head){
        ListNode pre=null;
        ListNode cur=head;
        while (cur!=null){
            ListNode next =cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        return pre;
    }
}
