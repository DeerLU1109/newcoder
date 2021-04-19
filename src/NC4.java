import java.util.HashSet;

/**
 * @author jinlu
 * @create 2021-04-19 10:54
 */
public class NC4 {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set=new HashSet<>();
        while (head!=null){
            if (!set.contains(head)){
                set.add(head);
            }
            else {
                if (set.contains(head)){
                    return true;
                }
            }
            head=head.next;
        }
        return false;
    }
}
