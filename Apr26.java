public static boolean is_possible_to_get_seats(int n, int m, int[] seats) {
        // code here
        if(n==0)return true;
        if(m==1){
            if(n==1 && seats[0]==0)return true;
            return false;
        }
        int c=0;
        for(int i=0;i<m;i++){
            if(seats[i]==0){
                if(i==0){
                    if(seats[1]==0){
                        c++;
                        seats[i]=1;
                    }
                }
                else if(i==m-1){
                    if(seats[i-1]==0){
                        c++;
                        seats[i]=1;
                    }
                }
                else{
                    if(seats[i-1]==0 && seats[i+1]==0){
                        c++;
                        seats[i]=1;
                    }
                }
            }
        }
        return c>=n;
    }
