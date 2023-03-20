class Solution {
    static int shortestXYDist(ArrayList<ArrayList<Character>> grid, int N,
                              int M) {
        // code here
        int answer=Integer.MAX_VALUE;
        ArrayList<int[]> xposition=new ArrayList<>();
        ArrayList<int[]> yposition=new ArrayList<>();
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                char c=grid.get(i).get(j);
                if(c == 'X'){
                    xposition.add(new int[]{i,j});
                }else if(c == 'Y'){
                    yposition.add(new int[]{i,j});
                }
            }
        }
        for(int[] x:xposition){
            for(int[] y:yposition){
                int dist=Math.abs(x[0]-y[0])+Math.abs(x[1]-y[1]);
                if(dist<answer){
                    answer=dist;
                }
            }}
            return answer;
    }
};
