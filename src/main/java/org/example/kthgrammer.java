package org.example;

class kthgrammer {
    public  static int kthGrammar(int n, int k) {
        int[] ala = getPrev(n);
       return ala[k-1];
    }





    static int[] getPrev(int n ){
        
        if(n == 1) return new int[]{0} ;  
        
         int[] prev = getPrev(n-1);
         int[] newArr = new int[prev.length*2];
        
        int i = 0 ; 
        for(int j : prev){
            
            if(j ==0) {
               newArr[i++] = 0;
            newArr[i++] =    1;
            }else{
                  newArr[i++] = 1;
            newArr[i++] = 0;
            }
         
        }
        
        
        return newArr ;
        
        
        
        
        
    }

    public static void main(String[] args) {
        System.out.println(kthGrammar(2,2));
    }
}