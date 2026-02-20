import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    private static int atMost(String s,int k){
        int maxLen=0;
        HashMap<Character,Integer>hm=new HashMap<>();
        int l=0;
        for (int r=0;r<s.length();r++){
            hm.put(s.charAt(r),hm.getOrDefault(s.charAt(r),0)+1);
            while (hm.size()>k){
                hm.put(s.charAt(l),hm.getOrDefault(s.charAt(l),0)-1);
                if (hm.get(s.charAt(l))==0){
                    hm.remove(s.charAt(l));
                }
                l++;
            }
            maxLen=Math.max(maxLen,r-l+1);
        }
        return maxLen;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    int k=sc.nextInt();
	    System.out.print(atMost(s,k));
	}
}
