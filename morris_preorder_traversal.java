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
        List<Integer>preorder=new ArrayList<>();
        TreeNode curr=root;
        while (curr!=null){
            if (curr.left==null){
                preorder.add(curr.data);
                curr=curr.right;
            }else{
                TreeNode predecessor=curr.left;
                while (predecessor.right!=null && predecessor.right!=curr){
                    predecessor=predecessor.right;
                }
                if (predecessor.right==null){
                    preorder.add(curr.data);
                    predecessor.right=curr;
                    curr=curr.left;
                }else{
                    predecessor.right=null;
                    curr=curr.right;
                }
            }
        }
        for (int i:preorder){
            System.out.print(i+" ");
        }
	}
}
