package bitmanipulation;

import java.math.BigInteger;

public class poweroftwo {

//    public int power(String A) {
//        BigInteger num = new BigInteger(A);
//            BigInteger ele = BigInteger.valueOf(1);
//
//            while( num. ele){
//                ele = ele<<1;
//                if(num == ele ){
//                    return 1 ;
//                }
//            }
//
//            return 0;



            public boolean isPowerOfTwo(int n) {

                int ele = 1 ;

                while( n >= ele){
                    if(n == ele ){
                        return true ;
                    }
                    ele = ele<<1;

                }

                return false ;
            }




    public static void main(String[] args) {

        double l = 147573952589676412928D ;
        System.out.println(new poweroftwo().isPowerOfTwo(1073741825));
    }
}
