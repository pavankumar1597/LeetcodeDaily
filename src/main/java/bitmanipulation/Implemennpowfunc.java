package bitmanipulation;

public class  Implemennpowfunc {
    public static int pow(int A, int B, int C) {
        if(A==0) return 0 ;
        if(B==0) return 1;

            long ans = pow(A,B/2,C) ;
            if(B%2 == 0 ){
                return  (int)((C+(ans%C*ans%C))%C);
            }else{
                return  (int)((C+(ans%C*ans%C*A%C))%C);
            }




            /*
              long ans = pow(A,B/2,C) ;
            if(B%2 == 0 ){
                return  (int)(( C + (  ans % C *  ans % C  ) ) %C);
            }else{
                return  (int)((C+( ans%C* ans%C *A%C ))%C);
            }*/

//
//                  if(B % 2 == 0) {    //If B is even, powers can be broken in equal parts
//            return (int)(((x % C * x % C) + C) % C);
//        } else {
//            return (int)(((x % C * x % C * A % C) + C) % C);
//        }


    }

    public static void main(String[] args) {
        System.out.println(pow(71045970,41535484,64735492));
    }
}
