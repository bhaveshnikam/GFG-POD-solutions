static int xmod11(String x)
	{    
	    // code here
	   int ans = 0;
       for(int i=0;i<x.length();i++){
           ans = (ans*10 + (x.charAt(i)-'0'))%11;
       }
       return ans;
	}
