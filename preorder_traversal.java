import java.util.*;
import java.lang.*;
import java.io.*;
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    public TreeNode(int data){
        this.data=data;
    }
}
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    TreeNode root=new TreeNode (1);
	    root.left=new TreeNode(2);
	    root.right=new TreeNode(3);
		Stack<TreeNode>st=new Stack<>();
        List<Integer>preorder=new ArrayList<>();
        st.push(root);
        while (!st.isEmpty()){
            TreeNode node=st.pop();
            preorder.add(node.data);
            if (node.right!=null)st.push(node.right);
            if (node.left!=null)st.push(node.left);
        }
        for (int i:preorder){
            System.out.print(i+" ");
        }
	}
}
