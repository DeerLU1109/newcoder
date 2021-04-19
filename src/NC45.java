import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author jinlu
 * @create 2021-04-14 19:45
 */
public class NC45 {



    public int[][] threeOrders (TreeNode root) {
        List<Integer> priorres=new LinkedList<>();
        List<Integer> mediumlist=new LinkedList<>();
        List<Integer> postlist=new LinkedList<>();
        prior(root,priorres);
        medium(root,mediumlist);
        post(root,postlist);
        // write code here
        int[][] res=new int[3][priorres.size()];
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                if (i==0){
                    res[i][j]=priorres.get(j);
                }
                else if (i==1){
                    res[i][j]=mediumlist.get(j);
                }
                else{
                    res[i][j]=postlist.get(j);
                }

            }
        }
        return res;
    }
    public void prior(TreeNode root,List priorlist){//先序遍历

        if (root==null) return ;
        priorlist.add(root.val);

        prior(root.left,priorlist);

        prior(root.right,priorlist);
    }
    public void medium(TreeNode root,List mediumlist){//中序遍历

        if (root==null) return ;
        medium(root.left,mediumlist);
        mediumlist.add(root.val);
        medium(root.right,mediumlist);
    }
    public void post(TreeNode root,List postlist){//后序遍历

        if (root==null) return ;

        post(root.left,postlist);
        post(root.right,postlist);
        postlist.add(root.val);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {//层次遍历

        List<List<Integer>> res=new LinkedList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if (root==null) return null;
        queue.add(root);
        while (!queue.isEmpty()){
            int length=queue.size();
            List<Integer> list=new LinkedList<>();
            for (int i = 0; i < length; i++) {
                   TreeNode tmp=queue.poll();
                   list.add(tmp.val);
                   if (tmp.left!=null) queue.add(tmp.left);
                   if (tmp.right!=null) queue.add(tmp.right);
            }
            res.add(list);
        }

        return  res;


    }
}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
  }
