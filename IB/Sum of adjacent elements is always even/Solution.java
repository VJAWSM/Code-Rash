public class Solution {
    public int solve(ArrayList<Integer> A) {
        
        int os=0, es=0;
        for(Integer i:A){
            if(i%2==0)es++;
            else os++;
        }        
        
        return es>os?os:es;
        
    }
}
