class MyQueue {

    int front, size;
	int arr[] = new int[100005];

    MyQueue()
	{
		front=0;
		size=0;
	}

	//Function to push an element x in a queue.
	void push(int x)
	{
	    // Your code here
	    if(size==100005)
	    return;

	  int rear  = front+size-1;
	    rear  = (rear+1)%100005;
	    arr[rear]= x;
	    size++;

	}

    //Function to pop an element from queue and return that element.
	int pop()
	{
		// Your code here
		if ( size==0)
		return -1;

       int temp  = front;
       front = (front+1)%100005;
       size--;

       return arr[temp];

	}
}


Input:
Q = 5
Queries = 1 2 1 3 2 1 4 2
Output: 2 3
Explanation:
In the first test case for query
1 2 the queue will be {2}
1 3 the queue will be {2 3}
2   poped element will be 2 the
    queue will be {3}
1 4 the queue will be {3 4}
2   poped element will be 3 
