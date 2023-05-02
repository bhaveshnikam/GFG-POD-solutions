static boolean ispossible(int mid,int arr[],int K){
        int person=0,sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>=mid){
                person++;
                sum=0;
            }
        }
        return person>=K+1;
    }
	int maxSweetness(int [] sweetness, int N, int K) {
	    // Write your code here.
        int low=Integer.MAX_VALUE,high=0,mid=0;
	    for(int i=0;i<N;i++){
	        high+=sweetness[i];
	        low=Math.min(low,sweetness[i]);
	    }
	    int ans = 0;
        while(low<=high){
            mid=(low+high)/2;
            if(ispossible(mid,sweetness,K)==true){
                ans=mid;
                low=mid+1;
            }
            else high=mid-1;
        }
        return ans;
	}
