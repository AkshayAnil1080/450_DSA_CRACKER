// https://practice.geeksforgeeks.org/problems/queue-using-two-stacks/1

class StackQueue
{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    //Function to push an element in queue by using 2 stacks.
    void Push(int x)
    {
	   // Your code here
	   s1.push(x);

    }


    //Function to pop an element from queue by using 2 stacks.
    int Pop()
    {
	   // Your code here
	   if(s1.isEmpty())
	   return -1;

	   while(!s1.isEmpty())
	   {
	       s2.push(s1.pop());
	   }
	   int temp =  s2.pop();

	   while(!s2.isEmpty())
	   s1.push(s2.pop());

	   return temp;
    }
}

Input:
5
1 2 1 3 2 1 4 2

Output:
2 3

Explanation:
In the first testcase
1 2 the queue will be {2}
1 3 the queue will be {2 3}
2   poped element will be 2 the queue
    will be {3}
1 4 the queue will be {3 4}
2   poped element will be 3.
