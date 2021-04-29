// https://practice.geeksforgeeks.org/problems/stack-using-two-queues/1

class Queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();

    //Function to push an element into stack using two queues.
    void push(int a)
    {
	    // Your code here
	    q1.add(a);
    }

    //Function to pop an element from stack using two queues.
    int pop()
    {
	    // Your code here
	    if(q1.isEmpty())
	    return -1;

	    reverse(q1);

	    while(!q1.isEmpty())
	    q2.add(q1.remove());


	    int temp =  q2.remove();

	    reverse(q2);

	    while(!q2.isEmpty())
	    q1.add(q2.remove());


	    return temp;
    }

    void reverse(Queue<Integer> q)
    {
        if(q.isEmpty())
        return;

        int x = q.remove();
        reverse(q);
        q.add(x);
    }

}

Input:
push(2)
push(3)
pop()
push(4)
pop()
Output: 3 4
Explanation:
push(2) the stack will be {2}
push(3) the stack will be {2 3}
pop()   poped element will be 3 the
        stack will be {2}
push(4) the stack will be {2 4}
pop()   poped element will be 4  
