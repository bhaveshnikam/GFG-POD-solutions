class Solution{
    // Time Complexity :- O(n);
    // Space Compleixty :- O(1);
	long no_of_subarrays(int N, int [] arr) {
		//Write your code here
		long ct=0,ans=0;
		for(int v : arr) {
		    if(v==0) {
		        ct++;
		    } else {
		        ans+=(ct*(ct+1)/2);
		        ct=0;
		    }
		}
		ans+=(ct*(ct+1)/2);
		return ans;
	}
}
