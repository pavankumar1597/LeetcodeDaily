package LinkedList;

import java.util.*;

class Pascletriangle1 {
    public static List<Integer> getRow(int rowIndex) {
        
        
        
      LinkedList<Integer> linkedlist =   new LinkedList<Integer>() ;
        linkedlist.add(1);
        
         return pascleit(linkedlist,rowIndex);
        
    }
    
    
    
   static List<Integer> pascleit(LinkedList<Integer>list,   int n){
       System.out.println(list+"  begin");
        
        if(list.size() == n+1) return list ; 
        
        int prev = 0 ; 
        if (list.size() > 1)
                 prev  = list.get(0) ;
        else prev =  list.get(0); 


        for(int i = 0 ; i < list.size()-1; i++){
            int temp  = list.get(i+1) ;
            list.set(i+1,list.get(i+1)+prev);
            prev = temp;
            
        }
       list.add(1);
       return pascleit(list,n);
    }

    public static void main(String[] args) {
        System.out.println(getRow(4));
    }
}