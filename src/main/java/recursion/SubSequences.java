package recursion;

import java.util.ArrayList;

public class SubSequences {

    ArrayList<Integer> glist  = new ArrayList<>();
    static int summer = 5;

    public static void main(String[] args) {
        getit(new int[]{4,3,2,1});
    }

    private static void getit(int[] ints) {

        ArrayList<Integer> list  = new ArrayList<>();
        System.out.println(recurseIt( 0,ints,ints.length,list,0));
        System.out.println(list);
    }



    static int recurseIt(int i, int[] ints, int n, ArrayList<Integer> list,int sum ){

        if(i == n ) {
            if (sum == summer) return 1;
            return 0 ;

        }

        list.add(ints[i]);

        int flag1 = recurseIt(i+1,ints,n,list,sum+ints[i]);

        list.remove(list.size() - 1);

       int flag2 = recurseIt(i+1,ints,n,list,sum);

        return  flag2+flag1 ;
    }
}

