import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author jinlu
 * @create 2021-04-25 21:40
 */
public class JZ60 {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>(0);
        if (pRoot==null) return res ;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(pRoot);

        while (!queue.isEmpty()){
            ArrayList<Integer> list =new ArrayList<>();
            int count= queue.size();
            for (int i = 0; i < count; i++) {
                TreeNode tmp=queue.poll();
                list.add(tmp.val);
                if (tmp.left!=null) queue.add(tmp.left);
                if (tmp.right!=null) queue.add(tmp.right);
            }

            res.add(list);

        }
        return res;
    }
}
