static int index=0;
    static Node help(int start,int end,int pre[],int preMirror[],int n){
        if(index>=n || start>end)return null;
        if(index==n-1 || start==end){
            Node temp = new Node(pre[index]);
            index++;
            return temp;
        }
        Node temp = new Node(pre[index]);
        index++;
        for(int i=start;i<=end;i++){
            if(pre[index]==preMirror[i]){
                temp.left = help(i,end,pre,preMirror,n);
                temp.right = help(start+1,i-1,pre,preMirror,n);
                break;
            }
        }
        return temp;
    }
    public Node constructBTree(int pre[], int preM[], int size)
    {
        // your code here
        index=0;
        return help(0,size-1,pre,preM,size);
    }
