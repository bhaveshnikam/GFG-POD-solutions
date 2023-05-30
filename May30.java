public boolean help(char[][] board,String word,int i,int j,int index){
        if(index==word.length())return true;
        if(i<0||j<0||i==board.length||j==board[0].length||board[i][j]!=word.charAt(index))return false;
        board[i][j]='-';
        index++;
        boolean a = help(board,word,i+1,j,index)||help(board,word,i-1,j,index)||help(board,word,i,j+1,index)
        ||help(board,word,i,j-1,index);
        board[i][j]=word.charAt(index-1);
        return a;
    }
    public boolean isWordExist(char[][] board, String word)
    {
        // Code here
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]==word.charAt(0)){
                    boolean a = help(board,word,i,j,0);
                    if(a==true)return a;
                }
            }
        }
        return false;
    }
