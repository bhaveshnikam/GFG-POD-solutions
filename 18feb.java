//Apple Sequence   18 feb 2023
class Solution{
    public static int appleSequence(int n, int m, String str){
        //code here
        ArrayList<Integer> v=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            if(str.charAt(i)=='O')
            {
                v.add(i);
            }
        }
        if(v.size()==0)
        {
            return n;
        }
        if(v.size()<=m)
        {
            return n;
        }
        int ans=Integer.MIN_VALUE;
        ans=Math.max(ans,v.get(m));
        int i=1;
        int j=m;
        
        while(j<v.size()-1)
        {
            ans=Math.max(ans,(v.get(j+1)-1)-(v.get(i-1)+1)+1);
            i++;
            j++;
        }
        ans=Math.max(ans,n-v.get(i-1)-1);
        return ans;
    }
}
