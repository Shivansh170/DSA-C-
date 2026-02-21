import java.util.*;
import java.lang.*;
import java.io.*;

class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

class Codechef
{
    private static void preorderTraversal(Node root){
        if (root==null)return;
        System.out.print(root.data+" ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }
    private static void inorderTraversal(Node root){
        if (root==null)return;
        inorderTraversal(root.left);
        System.out.print(root.data+" ");
        inorderTraversal(root.right);
    }
    private static void postorderTraversal(Node root){
        if (root==null)return;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.data+" ");
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Node root=new Node(1);
        root.left=new Node(5);
        root.right=new Node(8);
        preorderTraversal(root);
        System.out.println("");
        inorderTraversal(root);
        System.out.println("");
        postorderTraversal(root);
	}
}
