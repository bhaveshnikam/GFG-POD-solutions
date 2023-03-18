long help(int n,int arr[],int m){
        int mm[] = new int[2*n+1];
        Arrays.fill(mm,0);
        long ans=0,currElement=0;
        int sum=n;
        mm[n]++;
        for(int i=0;i<n;i++){
            if(arr[i]<m){
                sum--;
                currElement-=mm[sum];
            }
            else{
                currElement+=mm[sum];
                sum++;
            }
            ans+=currElement;
            mm[sum]++;
        }
        return ans;
    }
    long countSubarray(int N, int A[], int M) 
    { 
        // code here
        long a = help(N,A,M);
        long b = help(N,A,M+1);
        return a-b;
    }
