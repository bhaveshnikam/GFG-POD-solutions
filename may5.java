static int ans=0;
    static Map<Integer,Integer> help(Node root,int k){
        Map<Integer,Integer> mm = new HashMap<>();
        Map<Integer,Integer> mm2 = new HashMap<>();
        Map<Integer,Integer> mm3 = new HashMap<>();
        if(root.left!=null)
        mm2 = help(root.left,k);
        if(root.right!=null)
        mm3 = help(root.right,k);
        if(mm2.size()>k)return mm2;
        if(mm3.size()>k)return mm3;
        mm.putIfAbsent(root.data,0);
        mm.put(root.data,mm.get(root.data)+1);
        for(Map.Entry<Integer,Integer> x:mm2.entrySet()){
            mm.putIfAbsent(x.getKey(),0);
            mm.put(x.getKey(),mm.get(x.getKey())+x.getValue());
        }
        for(Map.Entry<Integer,Integer> x:mm3.entrySet()){
            mm.putIfAbsent(x.getKey(),0);
            mm.put(x.getKey(),mm.get(x.getKey())+x.getValue());
        }
        if(mm.size()<=k)ans++;
        return mm;
    }
    public static int goodSubtrees(Node root,int k)
    {
        ans=0;
        help(root,k);
        return ans;
    }
