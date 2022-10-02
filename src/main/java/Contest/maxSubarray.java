package Contest;

public class maxSubarray {
    public static int maxSubarray(int A, int B, int[] C) {
        
        
        
        
        int i =  0 ; 
        int j = 0  ;
        int res = 0  ;
        int sum = 0 ;

        while(j < A){
        
        sum = sum + C[j];    
            j++ ;
            
            while(sum > B){
             sum = sum - C[i];
             i++;
            }
            
            
             if(sum == B){
                return B  ;
            }else{
             res = Math.max(res,sum) ;
             }
            
        }
        
        
        
        
        
        return res ;
        
        
        
    }


    public static void main(String[] args) {
        System.out.println(maxSubarray(4,22,new int[]{2,6,8,10}));
    }
}
