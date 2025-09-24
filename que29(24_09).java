import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{   
	    Scanner sc=new Scanner(System.in);
	    int n,k;
	    n=sc.nextInt();
	    k=sc.nextInt();
	    String str=sc.nextLine();
	    String newstr="";
	    char[] arr=str.toCharArray();
	    for (int i=k;i<=n-k-1;i++){
	        newstr+=arr[i];
	    }
	    System.out.print(newstr);
	}
}
