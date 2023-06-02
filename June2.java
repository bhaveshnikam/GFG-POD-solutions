static ArrayList<Integer> ans;
    static int temp=0;
    public static void precompute () {
        //Complete the function
        ans=new ArrayList<>();
        boolean isprime[]=new boolean[1000001];
        Arrays.fill(isprime,true);
        isprime[0]=false;
        isprime[1]=false;
        for(int i=2;i<=1000000;i++){
            if(isprime[i]==true){
                ans.add(i);
                for(int j=2*i;j<=1000000;j+=i){
                    isprime[j]=false;
                }
            }
        }
    }
    static void dfs(int node,boolean vis[],ArrayList<Integer> g[]){
        vis[node]=true;
        for(int i=0;i<g[node].size();i++){
            if(vis[g[node].get(i)]==false){
                dfs(g[node].get(i),vis,g);
            }
        }
        temp++;
    }
    // Function for finding maximum and value pair
    public static int helpSanta (int n, int m, int g[][]) {
        //Complete the function
        ArrayList<Integer> arr[] = new ArrayList[n+1];
        for(int i=0;i<=n;i++){
            arr[i]=new ArrayList<>();
        }
        for(int i=0;i<m;i++){
            arr[g[i][0]].add(g[i][1]);
            arr[g[i][1]].add(g[i][0]);
        }
        boolean vis[]=new boolean[n+1];
        Arrays.fill(vis,false);
        int s=0;
        for(int i=1;i<=n;i++){
            if(vis[i]==false){
                temp=0;
                dfs(i,vis,arr);
                s=Math.max(temp,s);
            }
        }
        if(s==1)return -1;
        return ans.get(s-1);
    }
