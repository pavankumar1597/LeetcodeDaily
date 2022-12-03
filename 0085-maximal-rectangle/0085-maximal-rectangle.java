


public class Solution {
    public int maximalRectangle(char[][] chrr) {
        
        
        
        int[][] A = new int[chrr.length][chrr[0].length];
    
            int max = 0 ; 
            for(int i = 0 ; i < A.length ;i++){
                
                 for(int j = 0 ;  j < A[0].length ;j++){
                     
                     
                     if(i==0){
                         A[i][j] = chrr[i][j] - '0';
                     }else{
                      A[i][j] = (chrr[i][j] != '0') ? chrr[i][j]-'0' +  A[i-1][j] : 0 ; 
                     }
                                  
            }
               max = Math.max(largestRectangleArea(A[i]) , max )    ;               
            }


            return max ; 
        
    }




        public int largestRectangleArea(int[] A) {

        int[] l = leftMinimun(A);

        int[] r = rightMinimun(A);
        int max = 0 ;
        for(int i = 0 ; i <  A.length; i++){
             int w = (r[i] - l[i]-1 ) * A[i] ;
                max =Math.max(max ,w);
        }
return max ;

    }





    int[] leftMinimun(int[] A){
        
    int[] arr = new int[A.length];
    Stack<Integer> stack = new Stack<>();

        for(int i = 0 ; i <  A.length; i++){
            
            while(stack.size() != 0 && A[stack.peek()] >= A[i]){
                    stack.pop();
            }


            if(stack.size() == 0 ){
                arr[i]=-1;
            }else{
                arr[i]=stack.peek();;
            }
                stack.push(i);
        }
        return arr ;

    }


      int[] rightMinimun(int[] A){
        
    int[] arr = new int[A.length];
    Stack<Integer> stack = new Stack<>();

        for(int i = A.length-1; i >=0 ; i--){
            
            while(stack.size() != 0 && A[stack.peek()] >= A[i]){
                    stack.pop();
            }
            if(stack.size() == 0 ){
                arr[i]=A.length;
            }else{
                arr[i]=stack.peek();
            }
                stack.push(i);
        }
        return arr ;

    }
}
