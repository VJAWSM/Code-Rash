public class Solution {
    public int solve(ArrayList<Integer> A) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int diff = Integer.MAX_VALUE, n=A.size();
        for(int i=0; i<n;i++){
            if(map.containsKey(A.get(i))){
                diff = Math.min(diff, i-map.get(A.get(i)));
            }
            map.put(A.get(i),i);
        }
        if(diff==Integer.MAX_VALUE){
            diff=-1;
        }
        
        return diff;
        
    }
}
