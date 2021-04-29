// https://practice.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/1

class GfG
{
    //Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k)
    {
      //add code here.
         Queue<Integer> q1 =  new LinkedList<>();

    for( int i =0 ;i <k; i++)
    {
        q1.add(q.remove());
    }

    reverse(q1);

    while(!q.isEmpty())
    q1.add(q.remove());

    return q1;
    }

    void reverse(Queue<Integer> q)
    {
        if(q.isEmpty())
        return;

        int x =  q.remove();
        reverse(q);
        q.add(x);
    }

}


Input:
5 3
1 2 3 4 5

Output:
3 2 1 4 5

Explanation:
After reversing the given
input from the 3rd position the resultant
output will be 3 2 1 4 5.
