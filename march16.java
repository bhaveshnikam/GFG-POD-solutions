class Solution{
    static String secondSmallest(int S, int D){
        // code here
         String ans="";
        boolean b=false;
        if(S==D*9)
        return "-1";
        for(int i=1;i<=D;i++)
        {
            int res =(D-i)*9,d;
            if(S>res)
            d=S-res;
            else
            {
                if(i==1)
                d=1;
                else
                d=0;
            }
            if(d>9)
            return "-1";
            if(!b && S-d==res)
            {
                d++;
                b=true;
            }
            if(!b && i==D-1)
            {
                d++;
                b=true;
            }
            S-=d;
            ans+=Integer.toString(d);
        }
        return ans;

    }
}
