package leetcode;

public class leetcode814 {/*��������(�ڵ�ֵֻ��0,1)��֦�����һ��֦(����)û��һ��1�ڵ㣬
	                      	��ô����(���Բ�����Ҷ�ӽڵ�Ϊ0)
	                      */

	//˼·�ݹ飬��ǰ����0���������Ӷ���true(�ü����ĵ�)����ô��ǰ��Ҫ����
	//�ڵݹ�Ĺ����м�֦
	
    public TreeNode pruneTree(TreeNode root) {
        if(pruning(root)) return null;//�ж�root�ò��ü����ü���return null�����
        return root;
    }
    public boolean pruning(TreeNode root){
        boolean left=root.left==null?true:pruning(root.left);
        boolean right=root.right==null?true:pruning(root.right);
        //�ݹ飬�ж����Ҷ��Ӹò��ü������������Ϊ����Ϊ�ü�
        
        if(left) root.left=null;
        if(right) root.right=null;
        //˳�ְѸü��Ķ��Ӽ���
        
        if(left&&right&&root.val==0) return true;
        //���Ҷ��Ӷ��ü����Լ���0���Լ�Ҳ�ü�
        
        return false;
    }
}

class TreeNode {
	int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
