class Solution {

    
    static class Pair{
        int weak ; 
        int index ; 
        Pair(int weak ,
        int index ){
            this.weak = weak ; 
        this.index = index ; 
        }
        
    }

    public int[] kWeakestRows(int[][] mat, int k) {
        Queue<Pair> pair = new PriorityQueue<>(
        
          (a,b) -> {                                            
              if(a.weak < b.weak){
                  return -1;
              }
              if(a.weak > b.weak){
                  return 1;
              }
              
               if(a.index < b.index){
                  return -1;
              }
              if(a.index > b.index){
                  return 1;
              }
              
               return 0 ;
          }
        );
        
        for(int i= 0 ; i < mat.length; i++){
            int c = 0 ;
            for(int j= 0 ; j < mat[0].length; j++){
                if(mat[i][j] > 0) c++;
            } 
            
            
             pair.offer(new Pair(c,i));
        }
        
        
   int[] ele  = new int[k];
        for(int i = 0 ; i < k; i++){
         Pair pa =    pair.poll();
          ele[i]=pa.index ;  
        }
        return ele ;
        
        
        
    }
}