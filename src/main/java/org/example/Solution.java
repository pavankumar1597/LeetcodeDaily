package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public static String countAndSay(int n) {
        String  ii = "1";
        if(n == 1) return "1"; 
        for(int i = 0 ; i< n ;i++){

           ii =  say(ii);

            
        }
                    return ii;   
    }
    
    
    static String say(String s){
        char current = s.charAt(0); 
        String val = "" ; 
        int count = 1; 
        for(int i = 1 ; i< s.length() ; i++){
            
            if(current == s.charAt(i)){
                
                count++;
                 
            }else{
                
                val += count+""+current;
                count = 1 ; 
                current =  s.charAt(i) ;   
            }   
        }
        
        
        return val+count+""+current;
       
        
        
        
    }

    public static int solve(ArrayList<Integer> A) {




        for(int i=0; i< A.size(); i++){
            int c=0 ;
            for(int j= 0; j< A.size(); j++){

                if(A.get(i).equals(A.get(j))){
                    c++;
                }
            }


            if(c==1){
                return A.get(i);
            }


        }

        return 0;


    }


    public static void main(String[] args) {

        ArrayList<Integer> i =new ArrayList<Integer>(Arrays.asList(2,1,2 ));
System.out.println(solsve(i));

    }






        public static int solsve(ArrayList<Integer> A) {

            int max1 = -1;
            int max2 = -1;
            for(int i = 0; i < A.size();i++){


                if(max2 <= A.get(i)){
                    max2 = max1 ;
                    max1 = A.get(i);
                }

                else if(max2 <= A.get(i)){
                    max2 = A.get(i);
                }



            }


            return max2;
        }




}



















