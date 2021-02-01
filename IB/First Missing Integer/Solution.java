public class Solution {
    public int firstMissingPositive(ArrayList<Integer> A) {
        
        int len = A.size();
        
        int cur = 0;
        int curval = 0;
        int temp=0;
        
        while(cur<len){
            
            if(A.get(cur) == cur+1 || A.get(cur)<=0 || A.get(cur)>len){
                cur++;
                continue;
            }
            
            curval = A.get(cur) -1;
            temp = A.get(curval);
            if(temp != curval+1){
                A.set(curval, A.get(cur));
                A.set(cur, temp);
            }else{
                cur++;
            }
            
            
        }
        
        cur=0;
        while(cur<len && A.get(cur)==cur+1){
            cur++;
        }
        
        return cur+1;
    }
}
//O(n) time O(1) space
