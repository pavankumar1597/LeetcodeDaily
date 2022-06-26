package recursion;

public class Recursion {

    public static void main(String[] args) {


        //printinorder(5);
        //printrevorder(5);
     //   System.out.println(factorails(5));
//        System.out.println(sumofnumner(1342));
        System.out.println(reverseANumber(12345,0));


    }

    private static  int reverseANumber(int i,int sum) {

        if(i < 9 ) return (sum)+i ;
        return  reverseANumber(i/10,(sum+i%10)*10);


    }

    private static int sumofnumner(int i) {

        if(i < 9 ) return i ;
        return  i%10 * sumofnumner(i/10);

    }

    private static int factorails(int i) {

        if(i==1) return 1;
        return i * factorails(i-1);

    }

    private static void printinorder(int i) {
        if(i == 0) return ;
        System.out.println(i);

        printinorder(i-1);

    }

    private static void printrevorder(int i) {
        if(i == 0) return ;
        printinorder(i-1);
        System.out.println(i);

    }

}
