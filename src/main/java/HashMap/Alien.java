package HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class Alien {


    public  static  int solve(ArrayList<String> A, String B) {


        HashMap<Character,Integer> map = new HashMap<Character,Integer>();

        for( int i = 0 ; i < B.length() ; i++){
            map.put(B.charAt(i),i);
        }

        int min = Integer.MAX_VALUE ;

        for( String str : A){
            min = Math.min(str.length(),min);
        } int  flag =0 ;

        for(int i = 0 ; i < min ; i++){
            int val = 0 ;

            for(int j = 0 ; j < A.size()-1 ; j++){
                int v1 = map.get(A.get(j).charAt(i))  ;
                int v2 = map.get(A.get(j+1).charAt(i))  ;

                if( v1 < v2){
                    flag = 1 ;
                    break;
                }else if (v1 > v2){
                    return 0;
                }else {
                    flag = 0;
                }
            }

            if(flag == -1 ){
                break ;
            }

        }


        return (flag == -1)?0:1 ;



    }


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello"); list.add("scaler"); list.add("interviewbit");
        solve(list,"adhbcfegskjlponmirqtxwuvzy");
    }

}




