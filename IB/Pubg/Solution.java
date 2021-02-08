public class Solution {
    public int solve(ArrayList<Integer> A) {
        
        int len = A.size();
        if(len<2){
            return A.get(0);
        }
        
        int result = gcd(A.get(0), A.get(1));
        
        for(int i=2;i<len;i++){
            result = gcd(result, A.get(i));
        }
        
        return result;
        
        
    }
    
    private int gcd(int a, int b){
        int temp = 0;
        int max = a>b?a:b;
        int min = a>b?b:a;
        while(true){
            temp = min;
            min = max%min;
            max = temp;
            if(min==0){
                return max;
            }
        }
    }
}
