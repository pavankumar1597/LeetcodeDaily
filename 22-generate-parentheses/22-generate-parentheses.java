class Solution {
    public List<String> generateParenthesis(int n) {
        
        
        
        ArrayList<String> llist = new ArrayList<String>() ;
        recursion("",n,llist,0,0);
        
        return llist ; 

        
        
    }
    
    
    void recursion(String str ,int len ,ArrayList<String> list,int op ,int cl ){
        
        if(str.length() == len*2){
            list.add(str);
            
        }
        
        
        if(op < len ){
           recursion(str+"(",len ,list ,op+1,cl ) ;
        }
        
        if(cl < op ){
            recursion(str+")",len ,list ,op,cl+1 ) ;

        }
        
    }
    
    
    
    
}