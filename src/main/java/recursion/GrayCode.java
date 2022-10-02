package recursion;

import java.util.ArrayList;

public class GrayCode {

	public static ArrayList<Integer> grayCode(int a) {
        if(a ==1){
            new ArrayList<Integer>(){{
   add(0);
   add(1);
}};
        };
        ArrayList<Integer> resp =  grayCode(a-1);
        for(int i = resp.size()-1 ; i >= 0 ; i--){
          resp.add(resp.get(i)+(1<<(a-1)));
        }
        return resp ;
	}


    public static void main(String[] args) {
        System.out.println(grayCode(2));
    }
}
