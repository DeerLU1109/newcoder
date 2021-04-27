/**
 * @author jinlu
 * @create 2021-04-21 20:57
 */
public class JZ18 {
    public TreeNode Mirror (TreeNode pRoot) {
        // write code here
        if (pRoot==null) return null;
        TreeNode tmp=pRoot.left;
        pRoot.left=pRoot.right;
        pRoot.right=tmp;
        if (pRoot.left!=null) Mirror(pRoot.left);
        if (pRoot.right!=null) Mirror(pRoot.right);
       return pRoot;
    }
}
