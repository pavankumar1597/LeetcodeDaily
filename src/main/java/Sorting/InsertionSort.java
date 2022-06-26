package Sorting;

class InsertionSort {
  public static int[] insertionSort(int[] array) {
    // Write your code here.



if(array.length == 0){
    return new int[] {};

  
}

for(int i= 1; i < array.length ; i++){
 
for(int j = i-1 ; j >= 0  ; j--){

  if(array[j]  > array[j+1]){
    int temp = array[j] ;
    array[j] = array[j+1];
    array[j+1] = temp ; 
    }else  break ;
}
}
    return array;
  }


    public static void main(String[] args) {

        insertionSort(new int[]{8,5,2,9,5,6,3});

    }
}
