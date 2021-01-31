public class Solution {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        
        int len = A.size();
        int carry = 1;
        int temp = 0;
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i=len-1;i>-1||carry>0;i--){
            if(i<0){
                result.add(0,carry);
                carry=carry/10;
            }else{
               temp = A.get(i)+carry;
                result.add(0,temp%10);
                carry = temp/10;
            }
            
        }
        
        for(int i=0; i<result.size() && result.get(i)==0;){
            result.remove(0);
        }
        
        return result;
        
    }
}
//O(n) time O(1) space