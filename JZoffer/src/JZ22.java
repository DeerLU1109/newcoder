import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author jinlu
 * @create 2021-04-22 15:31
 */
public class JZ22 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if (root==null) return new ArrayList<>(0);
        ArrayList<Integer> res=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int l=queue.size();
            for (int i = 0; i < l; i++) {
                TreeNode tmp=queue.poll();
                res.add(tmp.val);
                if (tmp.left!=null) queue.add(tmp.left);
                if (tmp.right!=null) queue.add(tmp.right);
            }
        }
        return res;
    }
}
