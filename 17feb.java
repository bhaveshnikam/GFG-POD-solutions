//is it fibonaci
class Solution {
    static  long solve(int N, int K, ArrayList<Long> GeekNum) {
        //code here
     for(int i=K;i<N;i++)
     {
         long sum=0;
         for(int j=i-K;j<i;j++)
         {
             sum=sum+GeekNum.get(j);
         }
         GeekNum.add(sum);
     }
     return GeekNum.get(N-1);
    }
}
