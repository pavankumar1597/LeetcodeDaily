package Sorting;


import java.util.Arrays;

class QuickSortable {


    public static void main(String[] args) {

        System.out.println(Arrays.toString(quickSort(new int[]{1,2,3,4,5,6}))) ;
    }
  public static int[] quickSort(int[] array) {
    // Write your code here.

    quicksort(array,0,array.length-1);
    return array;
  }

  

 static void  quicksort(int[] array ,int i , int j ){
  if(i>=j) return ;
  int povot = partion(array,i,j);
  quicksort(array,i,povot-1 );
  quicksort(array,povot+1,j);
}

 static int partion(int[] array ,int i , int j ){

    int p = i;
    i = i+1;

   while(i<=j){
     
  while( i<=j && array[i] <= array[p]){
    i++;
  }
   
  while(i<=j && array[j] >= array[p]){
    j--;
  }  


if(i <= j ){
    System.out.println(""+Arrays.toString(array)) ;

    int temp =  array[i];
array[i] =  array[j];
  array[j]  = temp ;
  i++ ; 
  j--;


}
   }



if(array[p] >= array[j]){
    System.out.println("    before "+Arrays.toString(array));

    int temp  = array[p];
   array[p] = array[j];
  array[j] = temp;
    System.out.println(j+"      "+p);

    p = j ;
  }

   
   return p;

}

  

  
}
