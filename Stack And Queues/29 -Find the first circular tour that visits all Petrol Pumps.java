// profile : https://auth.geeksforgeeks.org/user/akshayanil/practice/
// https://practice.geeksforgeeks.org/problems/circular-tour/1#
Expected Time Complexity: O(N)
Expected Auxiliary Space : O(1)

class Solution
{
    //Function to find starting point where the truck can start to get through
    //the complete circle without exhausting its petrol in between.
    int tour(int petrol[], int distance[])
    {
	// Your code here
	int start = 0;  int curr_pet =0 ;
	int prev_pet =0;
	for( int i =0 ;i <petrol.length ;i ++)
	{
	    curr_pet += (petrol[i] - distance[i]);
	    if(curr_pet <0 )
	    {
	        prev_pet += curr_pet;
	        start =i+1;
	        curr_pet =0;
	    }
	}
	return ((curr_pet + prev_pet) >=0 )? (start):-1;
    }
}

Input:
N = 4
Petrol = 4 6 7 4
Distance = 6 5 3 5
Output: 1
Explanation: There are 4 petrol pumps with
amount of petrol and distance to next
petrol pump value pairs as {4, 6}, {6, 5},
{7, 3} and {4, 5}. The first point from
where truck can make a circular tour is
2nd petrol pump. Output in this case is 1
(index of 2nd petrol pump).
