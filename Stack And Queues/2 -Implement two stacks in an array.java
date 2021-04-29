// Link : https://practice.geeksforgeeks.org/problems/implement-two-stacks-in-an-array/1
class Stacks
{
    //Function to push an integer into the stack1.
    void push1(int x, TwoStack sq)
    {
        if(sq.top1<sq.top2-1)
            {
                sq.top1++;
                sq.arr[sq.top1] = x;
            }
    }

    //Function to push an integer into the stack2.
    void push2(int x, TwoStack sq)
    {
        if(sq.top1<sq.top2-1)
          {
              sq.top2--;
              sq.arr[sq.top2] = x;
          }
    }

    //Function to remove an element from top of the stack1.
    int pop1(TwoStack sq)
    {
        int y =-1 ;
        if(sq.top1>=0)
        {
             y = sq.arr[sq.top1];
            sq.top1--;
        }
         return y;
    }

    //Function to remove an element from top of the stack2.
    int pop2(TwoStack sq)
    {
        int y =-1 ;
        if(sq.top2<sq.size)
        {
             y =sq.arr[sq.top2];
            sq.top2++;
        }
        return y;
    }
}

Input:
push1(2)
push1(3)
push2(4)
pop1()
pop2()
pop2()

Output:
3 4 -1

Explanation:
push1(2) the stack1 will be {2}
push1(3) the stack1 will be {2,3}
push2(4) the stack2 will be {4}
pop1()   the poped element will be 3
from stack1 and stack1 will be {2}
pop2()   the poped element will be 4
from stack2 and now stack2 is empty
pop2()   the stack2 is now empty hence -1 .
