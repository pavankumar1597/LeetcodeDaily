package twopointer;

class coninsmostwater {
    public int maxArea(int[] height) {
        
        
        
        int j =  height.length -1 ; 
        int i = 0 ; 
        
        int max = 0 ;
        while( i < j ){
            
            int w = j-i ;
        
            int min = 0 ; 
            
            
            if(height[i] > height[j]){
                
                max = Math.max(max,height[j]*w);
                j-- ;
            
            }else{
                max = Math.max(max,height[i]*w);
                i++;
            }
            
            
            
        }
        
        
        return max; 
        
    }

    public static void main(String[] args) {
        System.out.println( new coninsmostwater().maxArea(new int[]{3,9,3,4,7,2,12,6}));
    }
}