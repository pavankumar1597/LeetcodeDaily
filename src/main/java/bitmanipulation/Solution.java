package bitmanipulation;

public class Solution {
    public static String addBinary(String A, String B) {


    int c = 0 ; 


    int maxlen = Math.max(A.length(),B.length());
    int i = 0 ;
   
String sum = "";
   while(i < maxlen ){
 int a = 0 ; 
    int b  = 0 ; 
       if(i < A.length()) a = A.charAt((A.length()-1)-i)-'0';
       if(i < B.length()) b = B.charAt((B.length()-1)-i)-'0';
       int  s = (c+a+b)/2 ;
        c = (c+a+b)%2 ;
       if(s%2 == 1) sum = s+""+sum;
        i++;
   }

   return sum ; 
    
    }


    public static void main(String[] args) {
        System.out.println(addBinary("100","11"));
    }
}
