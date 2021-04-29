// https://practice.geeksforgeeks.org/problems/queue-reversal/1


class GfG{
    //Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q){
        //add code here.
        Queue<Integer> q1  = new LinkedList<>();
        Stack<Integer> st =  new Stack<>();
        while(!q.isEmpty())
        st.push(q.remove());

        while(!st.isEmpty())
        q1.add(st.pop());


        return q1;

    }
}


// recusive way
void reverse(Queue<Integer> q)
    {
        if(q.isEmpty())
        return;

        int x =  q.remove();
        reverse(q);
        q.add(x);
    }



6
4 3 1 10 2 6

Output:
6 2 10 1 3 4

Explanation:
After reversing the given
elements of the queue , the resultant
queue will be 6 2 10 1 3 4.
