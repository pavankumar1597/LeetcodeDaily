class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        int sc = 0;
        int sr = 0 ;
        int er = matrix.length-1;
        int ec = matrix[0].length-1;
        List<Integer>  list = new ArrayList<Integer>(); 
        
        while(sr <= er && sc <= ec ){
            
            for(int i = sc; i <= ec ;i++){
                list.add(matrix[sr][i]);
            }
            
            for(int i =  sr+1  ; i <= er  ; i++){
                list.add(matrix[i][ec]);
            }
            
            for(int i = ec-1  ;  i >= sc  ; i--){
                  if(er == sr ) break ;
                list.add(matrix[er][i]);
            }
            
            for(int i = er-1  ; i > sr  ; i--){
                if(sc == ec) break;
                 list.add(matrix[i][sc]);
            }
            
            sc++;
            sr++;
            er--;
            ec--;
        }
        
        
        return list ;
        
        
    }
}