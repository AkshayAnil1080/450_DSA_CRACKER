import java.util.*;

class GFG {
	public static void main (String[] args) {
		System.out.println("GfG!");
		
		Scanner sc = new Scanner(System.in);
		
		
		int D =  sc.nextInt();
		int d =  sc.nextInt();
		
		if(Integer.MIN_VALUE == D && d==-1)
		System.out.println(Integer.MAX_VALUE);
		
		 int sign = ((D < 0) ^ 
                   (d < 0)) ? -1 : 1;
        int a  = Math.abs(D);
         int b  = Math.abs(d);
         int res  =  0;
         while( (a-b) >= 0)  // n/2
         {
             int x = 0 ;
             while( a - (b << 1 << x) >= 0)  //  it will run max 2 - 3 times.
             {
                 x++;
             }
             res += 1<<x;
             a -= b<<x;
         }
         System.out.println(sign*res);
	}
}


Input 10 3
Ouput 3
https://ide.geeksforgeeks.org/b39ZBkCkWc