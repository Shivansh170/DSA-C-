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
	    ArrayList<String>s_arr=new ArrayList<>();
	    String samp="";
	    for (int i=0;i<n;i++){
	        samp=sc.nextLine();
	        s_arr.add(samp);
	    }
	    String[] temp_st=samp.split(" ");
	    HashMap<Integer,Integer>hm=new HashMap<>();
	    for (String i:s_arr){
	        temp_st=i.split(" ");
	        System.out.println(temp_st[0].length()+" "+temp_st[m-1].length()); 
	    }
	}
}
