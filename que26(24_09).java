import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int k,n,m;
		k=sc.nextInt();
		n=sc.nextInt();
		m=sc.nextInt();
		String s="AB*abXYDEF#@pqr";
		char[] arr=s.toCharArray();
		for (int i:arr){
		    if (i>=n&&i<=m){
		        System.out.print((char) i);
		    }
		}
	}
}
