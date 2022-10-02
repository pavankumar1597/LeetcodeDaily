package HashMap;

import java.util.*;

class Program {
  public static String longestSubstringWithoutDuplication(String str) {
    // Write your code here
    HashMap<Character,Integer> map = new HashMap<>();
    int i = 0  ; 
    int j = 0 ; 
    int max = 0 ; 
    int a = 0 ;
    int b = 0 ; 
    while(j < str.length()){
    if(map.containsKey(str.charAt(j))){
      int f  = map.get(str.charAt(j))+1;
      while(i<f){
        map.remove(str.charAt(i++));
      }
    }else{
      map.put(str.charAt(j),j);
      j++;
    }
      if(max < (j-i+1)){
        max = (j-i+1);
        a = i ; 
        b = j ; 
      }
    }
    return str.substring(a,b);
  }


  public static void main(String[] args) {
    System.out.println(longestSubstringWithoutDuplication("pavankumarexzatchconsulting"));
  }
}
