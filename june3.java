public static int maxEqualSum(int N1,int N2,int N3, int[] S1, int[] S2, int[] S3) {
        // code here
        int i=0,j=0,k=0,sum1=0,sum2=0,sum3=0;
        for(int l=0;l<N1;l++)sum1+=S1[l];
        for(int l=0;l<N2;l++)sum2+=S2[l];
        for(int l=0;l<N3;l++)sum3+=S3[l];
        while(i<N1 && j<N2 && k<N3){
            if(sum1==sum2 && sum2==sum3)return sum1;
            else if(sum1<=sum2 && sum1<=sum3){
                if(sum1<sum2){
                    sum2-=S2[j];
                    j++;
                }
                if(sum1<sum3){
                    sum3-=S3[k];
                    k++;
                }
            }
            else if(sum2<=sum1 && sum2<=sum3){
                if(sum2<sum1){
                    sum1-=S1[i];
                    i++;
                }
                if(sum2<sum3){
                    sum3-=S3[k];
                    k++;
                }
            }
            else{
                if(sum3<sum2){
                    sum2-=S2[j];
                    j++;
                }
                if(sum3<sum1){
                    sum1-=S1[i];
                    i++;
                }
            }
        }
        return 0;
    }
    
