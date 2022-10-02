package org.example;

import java.util.ArrayList;

public class specialindex {
    public void solve(ArrayList<Integer> A) {

        System.out.println(evenPrefixSum(A));
        System.out.println(oddPrefixSum(A));









    }
      ArrayList<Integer> evenPrefixSum(ArrayList<Integer> E){

            ArrayList<Integer> EP =  new ArrayList<Integer>();
            EP.add(E.get(0));
            for(int i=1 ; i < E.size(); i++){
                if(i%2 != 0){
                    EP.add(EP.get(i-1));
                }else{
                    EP.add(EP.get(i-1)+E.get(i));
                }
            }
return EP;
        }
 ArrayList<Integer> oddPrefixSum(ArrayList<Integer> E){


        ArrayList<Integer> EP =  new ArrayList<Integer>();
            EP.add(E.get(0));
            EP.add(E.get(1));
            for(int i=2 ; i < E.size(); i++){
                if(i%2 == 0){
                    EP.add(EP.get(i-1));
                }else{
                    EP.add(EP.get(i-1)+E.get(i));
                }
            }
            return EP;
        }

    public static void main(String[] args) {
        int[] ints = new int[]{1,2,3,4,5,6,7};


        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);

        new specialindex().solve(integers) ;
    }
     
}
