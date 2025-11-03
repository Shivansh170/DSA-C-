import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    char[] arr=s.toCharArray();
	    String st="";
	    for (int i=0;i<arr.length;i++){
	        if ((i+1)%4!=0 && (i+1)%6!=0){
	            st+=arr[i];
	        }
	    }
	    char[] starr=st.toCharArray();
	    char[] result_arr=new char[arr.length];
	    for (int i=0;i<starr.length;i++){
	        result_arr[i]=starr[i];
	    }
	    int index=starr.length;
	    for (int i=0;i<arr.length;i++){
	        if ((i+1)%4==0 || (i+1)%6==0){
	            result_arr[index++]=arr[i];
	        }
	    }
	    for (char i:result_arr){
	        System.out.print(i);
	    }
	}
}
