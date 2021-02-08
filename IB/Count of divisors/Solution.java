public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int len=A.size();
        int max = A.get(0);
        ArrayList<Integer> result = new ArrayList<>();
        
        
        for(int i=1;i<len;i++){
            max = Math.max(max, A.get(i));
        }
        
        int [] ar = new int[max+1];
        Arrays.fill(ar, 1);
        for(int i=2; i<max+1;i++){
            for(int j=i; j<max+1; j+=i){
                ar[j]++;
            }
        }
        for(Integer i:A){
            result.add(ar[i]);
        }
        return result;
    }
}
