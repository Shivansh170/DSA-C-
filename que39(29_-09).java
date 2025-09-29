import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		sc.nextLine();
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		char[] s1_arr=s1.toCharArray();
		char[] s2_arr=s2.toCharArray();
		int sum=0;
		for (char i:s1_arr){
		    sum=0;
		    for (char j:s2_arr){
		        if (i==j){
		            sum+=1;
		        }
		    }
		    System.out.print(sum+" ");
		}
	}
}
