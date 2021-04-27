/**
 * @author jinlu
 * @create 2021-04-21 21:40
 */
public class JZ16 {
    public static void main(String[] args) {
        JZ16 o=new JZ16();
        ListNode l1=new ListNode(0);
        l1.next=new ListNode(2);
        ListNode l2=new ListNode(0);
        System.out.println(o.Merge(l1,l2));

    }
    public ListNode Merge(ListNode list1,ListNode list2) {
        if (list1==null&&list2==null) return null;
        ListNode head=list1.val>list2.val? list2:list1;
        ListNode res=head;
        if (list1.val<list2.val) list1=list1.next;
        else list2=list2.next;
        while (list1!=null&&list2!=null){
            if (list1.val<=list2.val){
                head.next=list1;
                list1=list1.next;
                head=head.next;
            }
            else {
                head.next=list2;
                list2=list2.next;
                head=head.next;
            }
        }
        while (list1!=null){
            head.next=list1;
            head=list1;
            list1=head.next;
        }
        while (list2!=null){
            head.next=list2;
            head=list2;
            list2=head.next;
        }

        return res;
    }
}
/*
*  public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode res= new ListNode(0);
        ListNode p = res;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                p.next = list1;
                list1=list1.next;
            }else{
                p.next = list2;
                list2=list2.next;
            }
            p=p.next;
        }
        if(list1==null) p.next = list2;
        if(list2==null) p.next = list1;
        return res.next;*/