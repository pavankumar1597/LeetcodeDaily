class Solution {
    public int[][] merge(int[][] intervals) {
    
    
    
      Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]) );
    ArrayList<int[]>  list = new ArrayList<>();
    int[] curr = intervals[0];
    list.add(curr );
    for(int[] next : intervals){
      int nis   =  next[0];
      int cie   =  curr[1];
      int nie   =  next[1];
      if(cie >= nis ){
          curr[1] = Math.max(curr[1],nie);
      }else{
          curr =  next ;
          list.add(curr );
        
      }
    }
    return list.toArray(new int[list.size()][]);
    }
    
}