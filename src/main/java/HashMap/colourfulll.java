package HashMap;

import java.util.*;

public class colourfulll {
    public int colorful(int A) {
        HashSet<Integer> set = new HashSet<>();
        int prev = -1;
        int n = 10;
        while(A>0){
            int currDigit = A%n;
            A = A/n;
            if(set.isEmpty()){
                set.add(currDigit);
                System.out.println(currDigit);

                prev = currDigit;
                continue;
            }
            if(set.contains(currDigit)) return 0;
            set.add(currDigit);
            System.out.println(currDigit);

            if(set.contains(currDigit*prev)) return 0;
            set.add(currDigit*prev);
            System.out.println(currDigit*prev);
            prev = currDigit ;
        }


        System.out.println(set);

        return 1;
    }

    public static void main(String[] args) {
        new colourfulll().colorful(3245);
    }
}
