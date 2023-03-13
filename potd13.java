class Solution 
{ 
    long maxPossibleValue(int N, int A[] ,int B[]) { 
        // code here
        long sum=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<N;i++){
            if(B[i]>=4){
                min=Math.min(min,A[i]);
                sum+=(B[i]/4)*A[i]*4;
                B[i]%=4;
            }
        }
        int count=0;
        for(int i=0;i<N;i++){
            if(B[i]>=2){
                count++;
                min=Math.min(min,A[i]);
                sum+=A[i]*2;
                B[i]%=2;
            }
        }
        if(count%2 != 0) sum-=min*2;
        return sum;
        
    }
}
