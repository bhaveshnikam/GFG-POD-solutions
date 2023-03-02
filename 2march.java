class Solution{
	int minCost(int [][] costs) {
	    int n=costs.length;
	    int k=costs[0].length;
	    if(n>1 && k<=1){
	        return -1;
	    }
	    if(n==0) return 0;
	    if(n == 1){
	        Arrays.sort(costs[0]);
	        return costs[0][0];
	    }
	    int[][] dp=new int[n][k];
	    int[] min1=new int[2];
	    int[] min2=new int[2];
	    min1[0]=-1;
	    min1[1]=-1;
	    for(int i=0;i<n;i++){
	        int[] currmin1=new int[2];
	        int[] currmin2=new int[2];
	       currmin1[1]=-1;
	       currmin1[0]=-1;
	       currmin2[0]=-1;
	       currmin2[1]=-1;
	        for(int j=0;j<k;j++){
	            if(min1[0] != j){
	                dp[i][j]=costs[i][j] + (min1[0]>= 0? dp[i-1][min1[0]] : 0);
	            }else{
	                dp[i][j]=costs[i][j] + (min2[0]>= 0? dp[i-1][min2[0]] : 0);
	            }
	            if(currmin1[0] == -1 || dp[i][j] < dp[i][currmin1[0]]){
	                currmin2[0]=currmin1[0];
	                currmin2[1]=currmin1[1];
	                currmin1[0]=j;
	                currmin1[1]=dp[i][j];
	            }else if(currmin2[0] == -1 || dp[i][j]<dp[i][currmin2[0]]){
	                currmin2[0]=j;
	                currmin2[1]=dp[i][j];
	            }
	        }
	        min1[0]=currmin1[0];
	        min1[1]=currmin1[1];
	        min2[0]=currmin2[0];
	        min2[1]=currmin2[1];
	    }
	    int mincost=Integer.MAX_VALUE;
	    for(int i=0;i<k;i++){
	        mincost=Math.min(mincost,dp[n-1][i]);
	    }
	    if(mincost == Integer.MAX_VALUE) return -1;
	    else return mincost;
		//Write your code here
	}
}        
