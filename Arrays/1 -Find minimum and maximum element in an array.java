//TC: O(n) -  traversing in array once;
//SC: O(1) -  not used any additional space
class Compute 
{
    pair getMinMax(long a[], long n)  
    {
        
        //1 - w/o using sort function.
    //     pair obj ;
        
    //     Arrays.sort(a);
    //     long mn = a[0];
    //     long max = -1;
        
    //     for( int i = 0 ; i <a.length; i++)
    //     {
    //         mn =  Math.min(a[i] , mn);
    //         max = Math.max(a[i] , max);
    //     }
    //  obj =  new pair(mn, max);
     
     
    //  return obj;
     
     //2 . using Arrays.sort()
     pair obj ;
     Arrays.sort(a);
     
     long min = a[0];
     int y =  (int) n-1;
     long max =   a[y];
     
     obj =  new pair(min, max);  //  we have to return the obj with values as parameters.
     
    return obj;
    }
}


https://practice.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1#
Input:
N = 6
A[] = {3, 2, 1, 56, 10000, 167}
Output:
min = 1, max =  10000
