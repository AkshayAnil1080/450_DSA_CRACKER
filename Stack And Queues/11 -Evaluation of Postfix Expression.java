// Profile : https://auth.geeksforgeeks.org/user/akshayanil/practice/
// https://practice.geeksforgeeks.org/problems/evaluation-of-postfix-expression1735/1


// TC: O(|S|)
// ASC: O(|S|)

class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String s)
    {
        // Your code here
        Stack<Integer> st = new Stack<>();
		for ( int i = 0 ;i< s.length() ;i ++)
		{
		     char c=s.charAt(i);
            if(Character.isDigit(c))
            {
                st.push(c-'0');
            }

            else
            {

                int n1=st.pop();
                int n2=st.pop();

                if((s.charAt(i))==('+'))
                {
                    st.push(n2+n1);
                }
                if((s.charAt(i))==('/'))
                {
                    st.push(n2/n1);
                }
                if((s.charAt(i))==('-'))
                {
                    st.push(n2-n1);
                }if((s.charAt(i))==('*'))
                {
                    st.push(n2*n1);
                }
            }
		}
		return st.peek();
    }
}


Input: S = "231*+9-"
Output: -4
Explanation:
After solving the given expression,
we have -4 as result.
