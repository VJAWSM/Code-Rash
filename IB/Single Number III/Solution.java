public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> result = new ArrayList<>();
        int len = A.size();
        int xor=0, n1=0, n2=0;
        
        for(int i=0;i<len;i++){
            xor^=A.get(i);
        }
        int mask = xor&(-1*xor);
        for(int i=0;i<len;i++){
            if((mask&A.get(i))==0){
                n1^=A.get(i);
            }else{
                n2^=A.get(i);
            }
        }
        
        result.add(n1>n2?n2:n1);
        result.add(n1>n2?n1:n2);
        return result;
    }
}
