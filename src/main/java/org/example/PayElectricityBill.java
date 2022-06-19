package org.example;

//this teaches you how to  implement   "if - else" condition


/**
 *
 Beginner : If-Else - 2|Lecture

 * if units are less than 50 -> 1 unit costs 1.rs
 * if units are  > 50 and less than 150   - 2/unit
 * if units are  > 100 and less than 250  - 3/unit
 * greater than 250  unit cost - 5/unit
 *
 */
public class PayElectricityBill {
    public static void main(String[] args) {
        int u = 200 ;
        if(u <= 50){
            System.out.println(u * 1);
        }else if (u <= 150) {
            System.out.println((50 * 1) + (u-50) *2 );
        }else if (u <= 250){
            System.out.println((50 * 1) + 100 *2 + (u-150) *3 );
        }else {
            System.out.println((50 * 1) + 100 *2 + 100 *3+( u-250)*5);
        }

    }
}
