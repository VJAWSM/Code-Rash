public class Solution {
    public int solve(ArrayList<ArrayList<Integer>> A, int B) {
        
        int col = A.get(0).size();
        int row = A.size();
        
        
        for(int i=0, j=col-1; i<row && j>-1;){
            if(B==A.get(i).get(j)){
                return (i+1)*1009+j+1;
            }else if(B>A.get(i).get(j)){
                i++;
            }else{
                j--;
            }
        }
        return -1;
        
    }
}
//O(r+c) time O(1) space