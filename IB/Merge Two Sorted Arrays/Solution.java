public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> solve(final List<Integer> A, final List<Integer> B) {
        
        int len1 = A.size();
        int len2 = B.size();
        ArrayList<Integer> res = new ArrayList<>();
        int i=0, j=0;
        for(i=0, j=0;i<len1&&j<len2;){
            if(A.get(i)<B.get(j)){
                res.add(A.get(i));
                i++;
            }else{
                res.add(B.get(j));
                j++;
            }
        }
        
        while(i<len1){
            res.add(A.get(i));
            i++;
        }
        
        while(j<len2){
            res.add(B.get(j));
            j++;
        }
        
        return res;
    }
}
