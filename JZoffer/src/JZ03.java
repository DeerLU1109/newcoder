import java.util.ArrayList;

/**
 * @author jinlu
 * @create 2021-04-21 15:54
 */
public class JZ03 {//输入一个链表，按链表从尾到头的顺序返回一个ArrayList

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ListNode pre=null;
        ListNode cur=listNode;
        ArrayList<Integer> res=new ArrayList<>(0);
        if (listNode==null) return res;
        while (cur!=null){
            ListNode next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
    }
        while (pre!=null){
            res.add(pre.val);
            pre=pre.next;
        }
        return res;
}

}
 class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}