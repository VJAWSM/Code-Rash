public class Solution {
    public int findMinXor(ArrayList<Integer> A) {
        
        int len = A.size();
        
        Collections.sort(A);
        int minxor =Integer.MAX_VALUE, temp=0;
        for(int i=0;i<len-1;i++){
            temp= A.get(i)^A.get(i+1);
            if(temp<minxor){
                minxor = temp;
            }
        }
        
        return minxor;
    }
}
