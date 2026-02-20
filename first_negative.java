import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    String[] n_k=br.readLine().split(" ");
	    int n=Integer.parseInt(n_k[0]);
	    int k=Integer.parseInt(n_k[1]);
	    String[] vals=br.readLine().split(" ");
	    int nums[]=new int[n];
	    for (int i=0;i<n;i++){
	        nums[i]=Integer.parseInt(vals[i]);
	    }
        Deque<Integer> temp = new LinkedList<>();
        ArrayList<Integer>ans=new ArrayList<>();
        for (int i=0;i<k;i++){
            if (nums[i]<0){
                temp.offerLast(i);
            }
        }
        ans.add(temp.isEmpty() ? 0 : nums[temp.peekFirst()]);
        int l=0;
        int r=k;
        while (r<n){
            if (nums[r]<0){
                temp.offerLast(r);
            }
            if (!temp.isEmpty() && temp.peekFirst()==l){
                temp.pollFirst();
            }
            ans.add(temp.isEmpty() ? 0 : nums[temp.peekFirst()]);
            l++;
            r++;
        }
        System.out.print(ans);
	}
}
