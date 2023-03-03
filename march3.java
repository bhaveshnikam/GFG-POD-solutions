lass Solution{
    static List<Long> minimumSquares(long L, long B)
    {
        List<Long> answer=new ArrayList<>();
        long a=GCD(L,B);
        long noofsquares=(L*B)/(a*a);

        answer.add(noofsquares);
        answer.add(a);
        return answer;
        // code here

    }
     public static long GCD(long a,long b){
         while(b!=0){
             long temp=b;
             b=a%b;
             a=temp;
         }
         return a;
     }    


}
