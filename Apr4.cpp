int minSteps(string str) {
    // Write your code here.
     int cnt=0;
    for(int i=1; i<str.size(); i++)
    {
        if(str[i-1]!=str[i])
        cnt++;
    }
    if(cnt%2!=0)
    return (cnt+1)/2+1;

    return cnt/2 +1;
}
