class Solution {
    public String multiply(String num1, String num2) {
        
        
        ArrayList<Integer> list = new ArrayList<>();
        
        StringBuilder sb  = new StringBuilder();
        num1 = reverse(num1);
        num2 = reverse(num2);
        int n1l = num1.length();
        int n2l= num2.length();
        int[] ans=new int[n1l+n2l+1];

        int carry = 0 ; 
       
        
        for(int i = 0 ; i < n1l  ;i++){
            int ith = num1.charAt(i)-'0' ;
            for(int j= 0 ; j < n2l  ;j++){
                    
                int mult  = ith * (num2.charAt(j)-'0')  ; 
                int sum = mult + carry  + ans[i+j];
                int lastnum = sum % 10;
                carry = sum / 10;                
                ans[i+j] = lastnum;  ;
            }
            
            
            ans[n2l+i]= carry;
            carry = 0 ;
        }
        
        
    boolean check0 = true ; 
        for(int i = ans.length-1 ; i>=0 ;i-- ){
            if(check0 && ans[i] == 0)  {
                continue ;
             }
                else  { 
                    sb.append(ans[i]);
            check0 = false ; 
                }
            
        }
    
        
        return sb.toString().isEmpty()?"0":sb.toString() ;
    }
    
    
    
      String reverse(String num){
        String res="";
        for(char ch : num.toCharArray())
            res=ch+res;
        return res;
    }
    
    
}