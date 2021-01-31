public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int trap(final List<Integer> A) {
        int result=0;
        
        int rightMax = Integer.MIN_VALUE;
        for(Integer i:A){
            if(i>rightMax){
                rightMax = i;
            }
        }
        rightMax = A.indexOf(rightMax);
        
        int leftMax = Integer.MIN_VALUE;
        for(int i=0; i<rightMax;i++){
            if(A.get(i)>leftMax){
                leftMax=A.get(i);
            }else if(leftMax>A.get(i)){
                result+=leftMax-A.get(i);
            }
        }
        leftMax = Integer.MIN_VALUE;
        for(int i=A.size()-1; i>rightMax;i--){
            if(A.get(i)>leftMax){
                leftMax=A.get(i);
            }else if(A.get(i)<leftMax){
                result+=leftMax-A.get(i);
            }
        }
        return result;
    }
}
//O(n) time O(1) space