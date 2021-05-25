Link :  https://practice.geeksforgeeks.org/problems/swap-kth-node-from-beginning-and-kth-node-from-end-in-a-singly-linked-list/1/?track=DSASP-LinkedList&batchId=154#
Given a singly linked list of size N, and an integer K. You need to swap the Kth node from the beginning and Kth node from the end of the linked list. Swap the nodes through the links. Do not change the content of the nodes.

 

Example 1:

Input:
N = 4,  K = 1
value[] = {1,2,3,4}
Output: 1
Explanation: Here K = 1, hence after
swapping the 1st node from the beginning
and end thenew list will be 4 2 3 1.
 

Example 2:

Input:
N = 5,  K = 7
value[] = {1,2,3,4,5}
Output: 0
Explanation: K > N. Swapping is invalid. 
Return the head node as it is.



class GFG
{
    //Function to swap Kth node from beginning and end in a linked list.
    Node swapkthnode(Node head, int num, int k)
    {
        // your code here
        // c1.
        if(num<k)
        return head;
        
        //c2.
        if((2*k-1)==num)
        return head;
        
       //1. find x_prev, x & y_prev, x
       Node x_prev =  null;
       Node x = head;
       for( int i =1; i <k ;i++)
       {
            x_prev = x;
            x = x.next;
       }
        Node y_prev =  null;
       Node y = head;
       for( int i =1; i <num-k+1 ;i++)
       {
            y_prev = y;
            y = y.next;
       }
       //2
   if(x_prev!=null) x_prev.next = y;
   if(y_prev!=null) y_prev.next = x;
   
   //3
   Node temp = x.next;
   x.next = y.next;
   y.next = temp;
   
   //4.
   if(k==1) head =y;
   if(k==num) head = x;
       
return head;       
    }
}
