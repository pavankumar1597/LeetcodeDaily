class Solution {
    public ArrayList<String> letterCombinations(String A) {
        
        HashMap<String,String> map = new HashMap<>();
        map.put("0","0");
        map.put("1","1");
        map.put("2","abc");
        map.put("3","def");
        map.put("4","ghi");
        map.put("5","jkl");
        map.put("6","mno");
        map.put("7","pqrs");
        map.put("8","tuv");
        map.put("9","wxyz");
        ArrayList<String> list = new ArrayList<String>();
        solve(A,map,0,list,"");
        return list;
    }

    void solve(String A,HashMap<String,String> map,int index,ArrayList<String> list,String ans){
       
          if(A.isEmpty()){
           return;
          }
        if(index == A.length()){
            list.add(ans);
       return ; 
        }

        String alpa = A.charAt(index)+"";
        String[] chars = map.get(alpa).split("");
        for(int i = 0 ; i < chars.length ; i++){
            solve(A,map,index+1,list,ans+chars[i]);

        }

}
}
    
