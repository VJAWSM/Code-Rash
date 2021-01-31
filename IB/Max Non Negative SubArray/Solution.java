public class Solution {
    public ArrayList<Integer> maxset(ArrayList<Integer> A) {
        
        long maxSum=0;
        long maxLen=0;
        long tsum=0;
        long tlen=0;
        int len=A.size();
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> tresult = new ArrayList<>();
        for(int i=0; i<len;i++){
            if(A.get(i)<0){
                tsum=0;
                tlen=0;
                tresult = new ArrayList<>();
                continue;
            }else{
                tlen++;
                tsum+=A.get(i);
                tresult.add(A.get(i));
                if(tsum>maxSum){
                    maxSum=tsum;
                    maxLen=tlen;
                    result = tresult;
                }else if(tsum == maxSum && tlen>maxLen){
                    maxLen=tlen;
                    result = tresult;
                }
            }
            
        }
        
        return result;
    }
}
// O(n) time O(n) space