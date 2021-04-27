import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author jinlu
 * @create 2021-04-25 21:16
 */
public class JZ59 {//按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>(0);
        if (pRoot==null) return res ;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(pRoot);
        int flag=1;
        while (!queue.isEmpty()){
            ArrayList<Integer> list =new ArrayList<>();
            int count= queue.size();
            for (int i = 0; i < count; i++) {
                TreeNode tmp=queue.poll();
                list.add(tmp.val);
                if (tmp.left!=null) queue.add(tmp.left);
                if (tmp.right!=null) queue.add(tmp.right);
            }
            if (flag%2==0){
                Collections.reverse(list);
            }
            res.add(list);
            flag++;
        }
        return res;
    }
}
