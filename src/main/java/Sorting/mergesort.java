package Sorting;

import java.util.*;

class mergesort {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(mergeSort(new int[]{7}))) ;
    }
static int[] globalArray ;
  public static int[] mergeSort(int[] array) {
    globalArray = new int[array.length];
    return sort(array);
  }


  static int[] sort(int[] array){

    
  int s = 0 ;
  int e = array.length-1;      

if(s >= e) return array ;
  int m = (e+s) / 2;
  int[] array1 = sort( Arrays.copyOfRange(array, s,m+1));
  int[] array2 =  sort( Arrays.copyOfRange(array, m+1,e+1));

    return merger(array1,array2);

    
    
  }




  static int[] merger(int[] arr1, int[] arr2){
int i = 0 ; 
    int j = 0 ; int k = 0 ; 
         int[]  mergerarray = new int[arr1.length+arr2.length];

      while(j < arr1.length && k < arr2.length)
      {
        if( arr1[j] <= arr2[k] ){
          mergerarray[i++] = arr1[j++];
        }else {
          mergerarray[i++] = arr2[k++];
        }
        
    }

        if(j >= arr1.length){
          while( k < arr2.length)
                mergerarray[i++] = arr2[k++];
        }else {
            while( j < arr1.length)
                mergerarray[i++] = arr1[j++];
        }

      System.out.println("mergearray - > " + Arrays.toString(mergerarray));
    return mergerarray;
    
  }
  
}
