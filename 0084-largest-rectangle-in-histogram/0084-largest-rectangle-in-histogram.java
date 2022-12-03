


public class Solution {
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
