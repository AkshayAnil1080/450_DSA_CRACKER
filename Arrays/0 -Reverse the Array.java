TC : O(n)
SC  : O(1)


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    sc.nextLine();
	    while(t -- > 0)
	    {
	        
	    
    	    String str = sc.nextLine();
    	    
    	    for (int i = str.length() -1 ;i>=0 ;i--)
    	    {
    	        System.out.print(str.charAt(i));
    	    }
    	    System.out.println();
    	   
	    }
	}
}



2nd: using Stacks.
TC : O(n)
SC  : O(n)


class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        
        Stack<Character> st = new Stack<>();
        
        for(int i  = 0  ; i <str.length() ; i ++)
        {
            st.push(str.charAt(i));
        }
        String s= "";
        while(!st.isEmpty())
        {
           
            s = s + st.pop();   
        }
        
        return s;
    }
}