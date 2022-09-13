class Solution {
     public boolean solveSudoku(char[][] board) {
         
         return solve(board);
     }
    
     public boolean solve(char[][] board) {
        
        int r = board.length;
        int c = board[0].length ;
        for(int i = 0 ; i  < r ; i++){
            for(int j = 0 ; j  < c ; j++){
                if(board[i][j] == '.'){
                    
                    
                    for(char k='1' ;k<='9' ;k++){
                        
                        if(isvalid(board,j,i,k)){
                            board[i][j] = k ;
                            
                            if(solve(board)){
                                return true ;
                            }else{
                                                         board[i][j] = '.' ;
   
                            }
                    }
                    }
                    return false ;
                }
                
            }
        }
        return true ;
    
         
         
     }
    
    
    
    
    
    boolean isvalid(char[][] board ,int c ,int r , char k  ){
        for(int i = 0 ; i < board.length ;i++){
            if(i != c && board[r][i] == k ){
                return false ;
            }
            
              if(i != r && board[i][c] == k ){
                return false ;
            }
        
            if( ((3* (c/3) + i%3) != c) && (3* (r/3) + i/3 != r) &&  board[3* (r/3) + i/3][3* (c/3) + i%3] ==                          k){
                return false ;
            }
            
        }
        return true  ;
 
    }
}