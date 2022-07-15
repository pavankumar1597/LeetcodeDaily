package org.example;

import java.util.Arrays;

class Solutio {
//     public int[] plusOne(int[] digits) {
        
        
        
        
        
//         for(int i = digits.length ; i ; i++ ){
         
            
//             if(digits[i] != 9 ){
//                 digits[i]++;
//                 break ;
//             }else{
//                 digits[i] =0 ;
//             }
               
//         }
        
        
//         if(digits[0] == 9 ){
         
//             int[] arr = new int[digits.length+1] ; 
//             arr.
            
            
//         }
        
        
        
        
        
        
        
//     }
//     return digits;




public static int[] plusOne(int[] digits) {
        
    int n = digits.length;
    for(int i=n-1; i>=0; i--) {
        if(digits[i] < 9) {
            digits[i]++;
            return digits;
        }
        
        digits[i] = 0;
    }
    
    int[] newNumber = new int [n+1];
    newNumber[0] = 1;
    System.out.print(Arrays.toString(newNumber));
    return newNumber;
}


    public static void main(String[] args) {
        plusOne(new int[]{9,9,9,9 });
    }}