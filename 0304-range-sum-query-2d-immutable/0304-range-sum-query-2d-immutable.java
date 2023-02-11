class NumMatrix {
    int[][] dp ; 
    
    public NumMatrix(int[][] matrix) {
        dp = new int[matrix.length][matrix[0].length];
        populate(matrix,dp) ;
        vertical(dp) ;
    }
    
    
    void vertical(int[][] dp){
             for(int i = 1 ; i < dp.length; i++){
            for(int j = 0 ; j < dp[0].length; j++){
                dp[i][j] = dp[i][j] + dp[i-1][j] ; 
            }
        } 
    }
    
    
    void populate(int[][] arr ,int[][] dp){
        for(int i = 0 ; i < arr.length; i++){
            for(int j = 0 ; j < arr[0].length; j++){
                if( j == 0 ){
                    dp[i][j] = arr[i][j];
                }else{
                    dp[i][j] = arr[i][j] + dp[i][j-1] ; 
                }
            }
        }
        
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        if (row2 >= dp.length || col2 >= dp[0].length || row1 < 0 || col1 < 0)
			return -1;
        int sum = 0;  

        return dp[row2][col2] -
            (row1 > 0 ? dp[row1-1][col2] :0 ) -
           (col1 > 0 ? dp[row2][col1-1] : 0 ) + 
            ((row1 > 0 && col1 > 0)? dp[row1-1][col1-1] : 0) ; 
    }
    
    //    public int sumRegion(int row1, int col1, int row2, int col2) {
    //     return dp[row2][col2] - (row1 > 0? dp[row1-1][col2] : 0) - (col1 > 0? dp[row2][col1-1] : 0) + ((row1 > 0 && col1 > 0)? dp[row1-1][col1-1]: 0);
    // }
    
    
    
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */