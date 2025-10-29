import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void rightRotate(int n,char[] arr){
        char[] ans=new char[arr.length];
        int index=0;
        for (int i=arr.length-n;i<arr.length;i++){
            ans[index++]=arr[i];
        }
        int i=0;
        while (index<arr.length){
            ans[index++]=arr[i++];
        }
        for(int j=0;j<arr.length;j++){
            arr[j]=ans[j];
        }
    }
    public static void leftRotate(int n,char[] arr){
        char[] ans=new char[arr.length];
        int index=0;
        for (int i=n;i<arr.length;i++){
            ans[index++]=arr[i];
        }
        for (int i=0;i<n;i++){
            ans[index++]=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=ans[i];
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    String r=sc.nextLine();
	    int n=sc.nextInt();
	    int[] nums=new int[n];
	    for (int i=0;i<n;i++){
	        int ele=sc.nextInt();
	        nums[i]=ele;
	    }
	    char[] char_s=s.toCharArray();
	    for (int i:nums){
	        if (i>0){
	            rightRotate(i,char_s);
	        }else{
	            leftRotate(-i,char_s);
	        }
	    }
	    String result="";
	    for (char i:char_s){
	        result+=i;
	    }
	    if (result.equals(r)){
	        System.out.println("Password Matched");
	    }else{
	        System.out.println("Try Again");
	    }
	}
}
