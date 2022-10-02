package bitmanipulation;

public class Reversebit {


    public static int reverseBits(int n) {


        int result = 0;

        System.out.println(Integer.toBinaryString(n));

        for (int i = 0; i < 32; i++) {
            int bit = ((n >> i) & 1);
            System.out.println(Integer.toBinaryString(bit));

            result = result | (bit << (31 - i));


        }
        return result;
    }


    public static void main(String[] args) {

//        reverseBits(22);
        System.out.println(5|1);

    }

    }
