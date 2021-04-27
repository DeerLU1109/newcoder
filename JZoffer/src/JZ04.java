import java.util.HashMap;

/**
 * @author jinlu
 * @create 2021-04-21 16:30
 */
public class JZ04 {
    int[] pre;
    HashMap<Integer,Integer> map=new HashMap<>();
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        this.pre=pre;
        for (int i = 0; i < in.length; i++) {
            map.put(in[i],i);
        }


        return recur(0,0,pre.length-1);
    }

    private TreeNode recur(int root, int left, int right) {
        if (left>right) return null;
        int i=map.get(pre[root]);
        TreeNode r=new TreeNode(pre[root]);
        r.left=recur(root+1,left,i-1);
        r.right=recur(root+i-left+1,i+1,right);
        return r;

    }
}
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}
