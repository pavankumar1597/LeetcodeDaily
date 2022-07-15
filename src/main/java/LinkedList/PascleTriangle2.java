package LinkedList;

import java.util.*;

class PascleTriangle2 {
    public static List<Integer> getRow(int rowIndex) {
        
        
     
        
         return pascleit(rowIndex);
        
    }
    
    
    
    //  type 1 recursion 
    
//     List<Integer> pascleit(LinkedList<Integer>list,   int n){
//        System.out.println(list+"  begin");
        
//         if(list.size() == n+1) return list ; 
        
//         int prev = 0 ; 
//         if (list.size() > 1)
//                  prev  = list.get(0) ;
//         else prev =  list.get(0); 


//         for(int i = 0 ; i < list.size()-1; i++){
//             int temp  = list.get(i+1) ;
//             list.set(i+1,list.get(i+1)+prev);
//             prev = temp;
            
//         }
//        list.add(1);
//        return pascleit(list,n);
//     }
    
    
    
        //  type 1 recursion 

    
      static ArrayList<Integer> pascleit(int n){
                    
          if( n == 0)  { 
               ArrayList<Integer> lit = new ArrayList<>();  
         lit.add(1);
          return lit ;
          }
          ArrayList<Integer> list    = pascleit(n-1) ;
             ArrayList<Integer> newlist  = new ArrayList();
          
          //1 1
          newlist.add(1);
          for(int i = 0 ; i < list.size() -1; i++){
              newlist.add(list.get(i)+list.get(i+1));
          }
          
          newlist.add(1);
          
          
          return newlist ;
      }



    public static void main(String[] args) {
        System.out.println(getRow(10));
    }
    
    

}