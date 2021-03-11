public class Solution {
    public int maxArea(ArrayList<Integer> A) {
        
        int n=A.size();
        int i=0,j=n-1;
        int max = Integer.MIN_VALUE;
        while(i<=j){
                max = max>Math.min(A.get(i), A.get(j))*(j-i)?max:Math.min(A.get(i), A.get(j))*(j-i);
                if(A.get(i)<A.get(j)){
                    i++;
                }else{
                    j--;
                }
        }
        return max;
    }
}
