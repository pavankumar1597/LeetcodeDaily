import java.util.Arrays;

public class findminimumdifference {



    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        // Write your code here.
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int min = Integer.MAX_VALUE ;
        int a = 0;
        int b = 0;

        int j = 0 ;
        for(int i = 0 ;i < arrayOne.length; i++){

            while(j < arrayTwo.length ){
                int absVal = Math.abs(arrayOne[i]- arrayTwo[j]);
                if(absVal < min){
                    min = absVal;
                    a = arrayOne[i];
                    b = arrayTwo[j];
                }

                if(arrayOne[i] > arrayTwo[j]){
                    j++;

                }else{
                    break;
                }

            }
        }


        System.out.println(Arrays.toString(new int[] {b,a}));
        return new int[] {b,a};
    }


    public static void main(String[] args) {
        smallestDifference(

        new int []{26, 134, 135, 15, 17}, new int[]{1, 5, 10, 20, 3});

    }
}



