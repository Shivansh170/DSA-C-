import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    ArrayList<Character>arr=new ArrayList<>();
	    ArrayList<Character>char_arr=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String s=sc.nextLine();
		char[]  s_char=s.toCharArray();
		for (char i:s_char){
		    if (Character.isDigit(i)){
		        arr.add(i);
		    }else{
		        char_arr.add(i);
		    }
		}
		int sum=0;
		int numchar=-1;
		for  (char i:arr){
		    numchar=Character.getNumericValue(i);
		    sum+=(numchar*numchar);
		}
		int k=sum%(char_arr.size());
		if (sum%2==0){
		    Collections.rotate(char_arr,k);
		}else{
		    Collections.rotate(char_arr,-k);
		}
		String res="";
		for (char i:char_arr){
		    res+=i;
		}
		System.out.println(res);
	}
}
