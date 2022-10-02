package recursion;
// The isBadVersion API is defined in the parent class VersionControl.


public class Solution  {
    public static int firstBadVersion(int n) {

        int s = 1 ;
        int e  = n ;
        while(s < e){
            int  m = s + ( (e- s) / 2);
            if(isBadVersion(m)){
                e = m ;
            }else{
                s = m+1;
            }
        }

        return s ;



        
        
        
    }
     static boolean isBadVersion(int version){
        return (version ==2 ) ;
    }


    public static void main(String[] args) {
        System.out.println(firstBadVersion(10));
    }
}