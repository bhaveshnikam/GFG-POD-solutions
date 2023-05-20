static boolean isStraightHand(int N, int groupSize, int hand[]) {
        // code here
        TreeMap<Integer,Integer> mm = new TreeMap<>();
        for(int x:hand){
            mm.putIfAbsent(x,0);
            mm.put(x,mm.get(x)+1);
        }
        int num=-1,c=0;
        while(true){
            num=mm.firstKey();
            c=0;
            while(c<groupSize){
                if(mm.get(num)==null)return false;
                mm.put(num,mm.get(num)-1);
                if(mm.get(num)==0)mm.remove(num);
                num++;
                c++;
            }
            if(mm.size()==0)break;
        }
        return true;
    }
