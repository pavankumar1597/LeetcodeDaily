package Sorting;

public class BubbleSort {

    public static void main(String[] args) {

        bubbleSort(new int[]{8,5,2,9,5,6,3});

    }


    public static int[] bubbleSort(int[] array) {
        // Write your code here.
        for(int i= 0  ; i  <array.length ; i++) {
            for(int j= 0  ; j  < array.length - i -1 ; j++) {
                if(array[j] > array[j+1]){

                    int temp = array[j] ;
                    array[j] = array[j+1] ;
                    array[j+1] = temp ;
                }
            }
        }
        return array;
    }

}





