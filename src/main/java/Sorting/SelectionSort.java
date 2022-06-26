package Sorting;

class SelectionSort {
  public static int[] selectionSort(int[] array) {
    // Write your code here.
    if(array.length ==0 ) return  new int[] {};
    for(int i = 0; i < array.length;i++){
      int minindex = i  ;
        for(int j = i+1; j < array.length;j++){
  if(array[minindex] > array[j]){
    minindex = j ; 
      }   
        }
      int temp = array[i];
      array[i] = array[minindex];
      array[minindex] = temp ;  
      }
    return array ;
  }


  public static void main(String[] args) {
    selectionSort(new int[]{8,5,2,9,5,6,3});
  }
}
