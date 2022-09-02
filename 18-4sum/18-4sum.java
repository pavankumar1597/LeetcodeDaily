class Solution {
    
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        Arrays.sort(nums);
      return  ksum(nums,4,target,0);
        
    }
    
    
    
    
     ArrayList<List<Integer>> ksum(int[] arr , int k ,long target ,int s){
        
     ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();

        if(k == 2){
            int i = s ;
            int j = arr.length-1 ;
            while(i < j){
                
                
                if(target < (arr[j]+arr[i]) ){
                    j-- ;
                }else if( target > (arr[j]+arr[i])){
                    i++;
                }else{
                    
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);

                    res.add(temp);
                          // list.remove(list.size()-1);
                          // list.remove(list.size()-1);

                    
                    while(i < j && arr[i] == arr[i+1]) i++;
                    while(j >= i && arr[j] == arr[j-1]) j--;
                    i++;
                    j--;
                    
                }
            }
            
        }else if (k > 2){
            
            for(int i = s ; i < arr.length-k+1 ; i++ ){
                
                if( i > s && arr[i] == arr[i-1]  ){
                    continue;
                }
            
            ArrayList<List<Integer>> t =   ksum(arr,k-1,target-arr[i],i+1);
                
                
                for( List<Integer> t1 : t){
                    t1.add(0,arr[i]);
                }
                res.addAll(t);

                    

            }
        
        }
         
         return res ; 
        
        
    } 
}