import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author jinlu
 * @create 2021-04-22 16:48
 */
public class JZ38 {
    public int TreeDepth(TreeNode root) {
        if (root==null) return 0;
        int depth=0;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int l=queue.size();
            for (int i = 0; i < l; i++) {
                TreeNode tmp=queue.poll();

                if (tmp.left!=null) queue.add(tmp.left);
                if (tmp.right!=null) queue.add(tmp.right);
            }
            depth++;
        }
        return depth;
    }

}
