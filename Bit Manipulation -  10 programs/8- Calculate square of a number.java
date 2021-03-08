package BitManipulation;
import java.util.*;
public class SqureOfNum {

	public void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(square(n));
		
		
		
		
		
	}
	
	int square(int n)
	{
	if(n == 0 )
		return 0;
	
	if(n<0)
		n = -n;
	
	int x = n<<1;
	
	if(n%2!=0)
		return (  (square(x)<<2)  + (x<<2)  + 1   );
	
	else
		return ( square(x)<<2 );
	}
}
