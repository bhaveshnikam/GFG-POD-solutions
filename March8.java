int modulo(String s, int m) {
		//Write your code here
		int ans=0,temp=1;
		for(int i=s.length()-1;i>=0;i--){
		    if(s.charAt(i)=='1'){
		        ans+=temp;
		        ans%=m;
		    }
		    temp*=2;
		    temp%=m;
		}
		return ans;
	}
