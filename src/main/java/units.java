public class units {
    public static void main(String[] args) {
        int u = 200 ;
        if(u <= 50){
            System.out.println(u * 1);
        }else if (u >= 51 && u <= 150) {
            System.out.println((50 * 1) + (u-50) *2 );

        }else if (u >= 150 && u <= 250){
            System.out.println((50 * 1) + 100 *2 + (u-150) *3 );
        }else {
            System.out.println((50 * 1) + 100 *2 + 100 *3+( u-250)*5);
        }

    }
}
