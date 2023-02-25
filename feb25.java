class Solution {
    static int checkCompressed(String s, String T) {
        // code here
        int j=0;
        for(int i=0;i<T.length();i++)
        {
            if(Character.isDigit(T.charAt(i)))
            {
                int val=0;
                while(i<T.length()&&Character.isDigit(T.charAt(i)))
                {
                    val=val*10+T.charAt(i)-'0';
                    i++;
                }
                i--;
                j=j+val;
            }
            else
            {
                if(s.charAt(j)!=T.charAt(i))
                {
                    return 0;
                }
                else
                {
                    j++;
                }
            }
        }
        if(j!=s.length())
        {
            return 0;
        }
        else
        {
            return 1;
        }
        
    }
}
