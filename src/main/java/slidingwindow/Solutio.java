package slidingwindow;

import java.util.ArrayList;

public class Solutio {
    public static void solve(int[] A, int B) {



int prev = 1-A[0];
int b = (2 *B)+1 ;
ArrayList<Integer> list = new ArrayList<Integer>();

int i = 0 ; int j = 0  ;
while(j < A.length){


if(A[j] != prev ){
    prev  = A[j++];
}else{
    i =  j;
    prev = 1-A[i];
}

while((j-i+1) >= b && j < A.length-1 ){
list.add((i+j)/2);
if(A[i] != A[j+1]){
i++;
j++;



}else{
    i = j ;
}




}

}



System.out.print(list);

    }



    public static void main(String[] args) {
solve(new int[]{0, 0, 0, 1, 1, 0, 1},0);
    }






}
