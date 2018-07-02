package leetcode;

public class leetcode814 {/*给二叉树(节点值只有0,1)剪枝，如果一个枝(子树)没有一个1节点，
	                      	那么剪掉(所以不存在叶子节点为0)
	                      */

	//思路递归，当前点是0，且俩儿子都是true(该剪掉的点)，那么当前点要剪掉
	//在递归的过程中剪枝
	
    public TreeNode pruneTree(TreeNode root) {
        if(pruning(root)) return null;//判断root该不该剪，该剪就return null当结果
        return root;
    }
    public boolean pruning(TreeNode root){
        boolean left=root.left==null?true:pruning(root.left);
        boolean right=root.right==null?true:pruning(root.right);
        //递归，判断左右儿子该不该剪，特例，如果为空视为该剪
        
        if(left) root.left=null;
        if(right) root.right=null;
        //顺手把该剪的儿子剪了
        
        if(left&&right&&root.val==0) return true;
        //左右儿子都该剪且自己是0，自己也该剪
        
        return false;
    }
}

class TreeNode {
	int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
