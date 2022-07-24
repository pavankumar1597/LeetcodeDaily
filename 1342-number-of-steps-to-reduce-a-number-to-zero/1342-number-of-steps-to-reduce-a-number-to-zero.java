class Solution {
    public int numberOfSteps(int num) {
        
        
        int cc=0;
        
        while(num != 0 ){
            
            if(num == 1 ){
                cc++ ;
                break ;
            }
            else if(num%2 ==0){
                num /= 2 ;
                cc++ ;

            }else{
                
                cc++ ;
                cc++ ;
               num /= 2 ;


            }
            
            
        }
        
        return cc;
        
        
        
    }
}