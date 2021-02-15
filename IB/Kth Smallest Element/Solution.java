public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int kthsmallest(final List<Integer> A, int B) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(Integer i:A){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        
        int n=A.size();
        int min = Integer.MAX_VALUE;
        int res=Integer.MIN_VALUE;
        while(B>0){
            for(Integer i:A){
                if(i<min&& i>res){
                    min=i;
                }
            }
            res=min;
            min=Integer.MAX_VALUE;
            B-=map.get(res);
        }
        
        
        return res;
        
        
    }
    
}
