package slidingwindow;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

class stack {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stack = new Stack<>();
        
        for(String str :tokens){
            
            
            if(str.equals("*") || str.equals("-") || str.equals("/") || str.equals("+") )
            {
                int a = stack.pop();
                int b  = stack.pop();
                    
                if(str.equals("*")){
                    stack.push(b*a);
                }else if(str.equals("-")){
                    stack.push(b-a) ;

                }else if (str.equals("+")){
                    stack.push(b+a);

                }else {
                    stack.push(b/a) ;
   
                }
                
                          
            }else{
                stack.push(Integer.parseInt(str));
            }
                
                          
                          }    
          return stack.size();
            
        
        
    }


    public int lengthOfLongestSubstring(String s) {

        int i = 0 ; int j = 0;
        Set<Character > set = new HashSet<Character>();
        int max = Integer.MIN_VALUE ;
        int count =0;
        while(j < s.length()){

            if(set.contains(s.charAt(j))){
                while(set.contains(s.charAt(j))){
                    set.remove(s.charAt(i));
                    i++;
                }
            }

            set.add(s.charAt(j));
            max = Math.max(max,set.size());
            j++;



        }


        return max ;
    }
}



// Online Java Compiler
