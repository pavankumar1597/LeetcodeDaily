class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        int r = board.length;
        int c = board[0].length ;
        for(int i = 0 ; i  < r ; i++){
            for(int j = 0 ; j  < c ; j++){
                if(board[i][j] != '.' && !isvalid(board,j,i)){
                    return false ;
                }
            }
        }
        return true ;
    }
    
    
    
    
    
    boolean isvalid(char[][] board ,int c ,int r ){
        for(int i = 0 ; i < board.length ;i++){
            if(i != c && board[r][i] == board[r][c] ){
                return false ;
            }
            
              if(i != r && board[i][c] == board[r][c] ){
                return false ;
            }
        
            if( ((3* (c/3) + i%3) != c) && (3* (r/3) + i/3 != r) &&  board[3* (r/3) + i/3][3* (c/3) + i%3] == board[r][c]){
                return false ;
            }
            
        }
        return true  ;
 
    }
}