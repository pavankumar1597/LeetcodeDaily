class Solution {
    public List<List<String>> groupAnagrams(String[] words) {
   // Write your code here.
    List<List<String>> list  = new ArrayList<>();
  
    Map<String, ArrayList<String>> mpl =  new HashMap<>();
 
    for( int i = 0 ;  i < words.length; i++){
      String sorteds = sortStirng(words[i]);
      if(mpl.containsKey(sorteds)){
      ArrayList<String> sl  = new ArrayList<>();
        sl.addAll(mpl.get(sorteds));
        sl.add(words[i]);
        mpl.put(sorteds,sl);
      }else{
        ArrayList<String> newlist  =new ArrayList<String>();
        newlist.add(words[i]);
        mpl.put(sorteds,newlist);
      }      
    }

 for(ArrayList<String> lis : mpl.values()){
  list.add(lis);
}

    
    return list;
  }



   String sortStirng(String s){
    char[] arra  = s.toCharArray();
    Arrays.sort(arra);
  return   String.valueOf(arra);
  
  
  }
}