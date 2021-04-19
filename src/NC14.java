import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author jinlu
 * @create 2021-04-18 22:00
 */
public class NC14 {//二叉树Z字形遍历
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder (TreeNode root) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if (root==null) return res;
        int flag=0;
        queue.add(root);
        while (!queue.isEmpty()){
            int count=queue.size();
            ArrayList<Integer> list=new ArrayList<>();
            while(count>0){
                TreeNode tmp=queue.poll();
                list.add(tmp.val);
                if (tmp.left!=null){
                    queue.add(tmp.left);
                }
                if (tmp.right!=null){
                    queue.add(tmp.right);
                }
                count--;
                if (flag%2==1&&count==0){
                    Collections.reverse(list);

                }
            }
            res.add(list);
            flag++;
        }
        return res;
    }
}
