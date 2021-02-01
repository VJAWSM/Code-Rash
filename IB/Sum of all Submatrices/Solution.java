public class Solution {
    public int solve(ArrayList<ArrayList<Integer>> A) {
        int m = A.size();
        int n = A.get(0).size();
        
        int sum = 0;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                sum+= A.get(i).get(j)*(i+1)*(j+1)*(m-i)*(n-j);
            }
        }
        
        return sum;
    }
}
//O(n) time, O(1) space
