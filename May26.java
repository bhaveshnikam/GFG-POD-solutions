static int mod = 1000000007;
    static int help(int n,int x,int num,int dp[][]){
        if(n==0)return 1;
        if(num>n || n<0)return 0;
        if(dp[n][num]!=-1)return dp[n][num];
        int temp = (int)Math.pow(num,x);
        return dp[n][num]=(help(n-temp,x,num+1,dp)+help(n,x,num+1,dp))%mod;
    }
    static int numOfWays(int n, int x)
    {
        // code here
        int dp[][] = new int[n+1][n+1];
        for(int temp[]:dp)Arrays.fill(temp,-1);
        return help(n,x,1,dp);
    }
