class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        
        
        
List<Integer> array = Arrays.stream(nums).boxed().collect(Collectors.toList());
        
       // Write your code here.

       List<List<Integer>>  arrays = new ArrayList<List<Integer>>();

ArrayList<Integer> list =  new  ArrayList<Integer>();
    if(array.size() == 0) return arrays ;
    perm(0,array,list,arrays);
    return arrays ;
  }




  
  static void perm(int index,List<Integer> ogi ,List<Integer> list  ,List<List<Integer>>  arrays){
  if(index == ogi.size())
  {
    arrays.add(new ArrayList<>(list));
    return ; 
  }




for(int i = 0 ; i < ogi.size() ; i++){

  if(list.contains(ogi.get(i))){
    continue ;
  }else{
    list.add(ogi.get(i));
    perm(index+1,ogi,list,arrays) ;
    list.remove(list.size()-1);
    
  }
}
  

    
  }
}