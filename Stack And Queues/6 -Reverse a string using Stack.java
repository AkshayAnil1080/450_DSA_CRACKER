
// Profile : https://auth.geeksforgeeks.org/user/akshayanil/practice/
// https://practice.geeksforgeeks.org/problems/reverse-a-string-using-stack/1

// TC : O(n)
// ASC:  O(n)
class Solution {

    public void reverse(String str){
       //your code here
        Stack<Character> sc = new Stack();
        for(int i=0 ; i<str.length(); i++)
        {
            sc.push(str.charAt(i));
        }

         for(int i=0 ; i<str.length(); i++)
         {
             System.out.print(sc.pop());
         }

         System.out.println();

        }

}

Input: S="GeeksforGeeks"
Output: skeeGrofskeeG
