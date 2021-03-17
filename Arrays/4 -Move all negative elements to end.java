// TC : O(n)
// Sc : O(n)
// Link: https://practice.geeksforgeeks.org/problems/move-all-negative-elements-to-end1813/1#
class Compute {
    
    public void segregateElements(int arr[], int n)
    {
        // Your code goes here
        int temp[]  = new int [n+1];
        int j = 0;
        for( int i =  0; i<n ; i++)
        {
            if(arr[i] > 0 )
            {
            temp[j] = arr[i];
            j++;
            }
           
        }
        
         for( int i =  0; i<n ; i++)
        {
            if(arr[i] < 0 )
            {temp[j] = arr[i];
            j++;
            }
        }
        
        for( int i =  0; i<n ; i++)
        {
        //     System.out.println(temp[i]);
        arr[i] =  temp[i];
        }
    }
}