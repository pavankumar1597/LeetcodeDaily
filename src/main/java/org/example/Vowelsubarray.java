package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Vowelsubarray {
    public int solve(String A) {
Set<Character> set= new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

long c =  0  ;


            for(int i=0;i<A.length();i++){
                if(set.contains(A.charAt(i))){
                    c += A.length() - i ;
                }
            }

return (int)c%10003;



    }
}
