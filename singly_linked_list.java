import java.util.*;
import java.lang.*;
import java.io.*;
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
        this.next=null;
    }
}
class LinkedList{
    public ListNode insertAtBeg(ListNode head,int val){
        ListNode temp=new ListNode(val);
        if (head==null){
            head=temp;
        }else{
            temp.next=head;
            head=temp;
        }
        return head;
    }
    public ListNode insertAtEnd(ListNode head,int val){
        ListNode newNode=new ListNode(val);
        ListNode temp=head;
        if (temp==null){
            head=newNode;
            return head;
        }
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        return head;
    }
    public ListNode deleteNode(ListNode head,int val){
       if (head==null){
           System.out.println("Node can not be deleted from an empty list!");
           return null;
       }
       if (head.next==null){
           if (head.val==val){
               head=null;
               return head;
           }else{
               System.out.println("No node found with this value!");
               return null;
           }
       }
       if (head.val==val){
           head=head.next;
           return head;
       }
       ListNode prev=null;
       ListNode curr=head;
       while (curr!=null){
           if (curr.val==val){
               prev.next=curr.next;
               return head;
           }else{
               prev=curr;
               curr=curr.next;
           }
       }
       if (curr==null){
           return null;
       }else{
           return head;
       }
    }
    public ListNode reverseLinkedList(ListNode head){
        if (head==null || head.next==null){
            return head;
        }
        ListNode prev=null;
        ListNode curr=head;
        ListNode nxt=curr.next;
        while (curr!=null){
            curr.next=prev;
            prev=curr;
            curr=nxt;
            if (curr!=null){
                nxt=curr.next;
            }
        }
        return prev;
    }
    public void print(ListNode head){
        if (head==null){
            System.out.println("The list is empty!");
            return;
        }
        ListNode temp=head;
        while (temp!=null){
            if (temp.next!=null){
              System.out.print(temp.val+" ----> ");  
            }else{
                System.out.println(temp.val);
            }
            temp=temp.next;
        }
    }
}
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    ListNode head=null;
	    LinkedList ll=new LinkedList();
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    try {
	        int n=Integer.parseInt(br.readLine());
	        for (int i=0;i<n;i++){
	            int x=Integer.parseInt(br.readLine());
	            head=ll.insertAtBeg(head,x);
	        }
	        ll.insertAtEnd(head,89);
	        ll.print(head);
	        System.out.println("Linked List after reversal is: ");
	        ListNode reversed_head=ll.reverseLinkedList(head);
	        ll.print(reversed_head);
	    } catch(IOException e) {
	        System.out.print(e);
	    }
	}
}
