int solve(int a, int b, int c) {
        // code here
        if((a>2*(b+c)+2) || (b>2*(a+c)+2) || (c>2*(a+b)+2))return -1;
        return a+b+c;
    }
