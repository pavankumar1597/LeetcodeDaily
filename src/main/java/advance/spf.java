package advance;

import java.util.Arrays;
import java.util.HashSet;

public class spf {
    public int solve(int[] A) {
        int max = Integer.MIN_VALUE;
        for(int a : A ){
            max = Math.max(max,a);
        }
        int[] spf = getSpf(max);
        System.out.println(Arrays.toString(spf));

        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < A.length ;i++){
            int ele = A[i];

            while (ele > 1){

                int i1 = spf[ele];
                if(i1 == 0){
                    i1 = ele ;
                }
                while (ele % i1 == 0) {
                    ele /= i1;
                }
                set.add(i1);


            }

        }
        System.out.println(set);
        return  set.size();

    }


   int[] getSpf(int n ){
        int[] spf = new int[n+1];

        spf[0] = 1;
        spf[1] = 1 ;

        for(int i = 2 ; i*i <= n ; i++){
            if(spf[i]==0){
                for(int j = i*i ; j <= n  ; j=i+j){
                    if(spf[j] == 0) spf[j] = i;
                }
            }
        }
return  spf ;

    }


    public static void main(String[] args) {
        new spf().solve(new int[] {2, 3, 4, 5, 6, 7, 8, 9, 10});
    }
}