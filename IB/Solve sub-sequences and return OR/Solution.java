public class Solution {
    public int solve(ArrayList<Integer> A) {
        
        int length = A.size();
        if(length<2){
            return 1;
        }
        
        int cal = gcd(A.get(0), A.get(1));
        for(int i=2;i<length;i++){
            cal = gcd(cal, A.get(i));
        }
        
        if(cal==1){
            return 1;
        }
        return 0;
        
    }
    
    private int gcd(int a, int b){
        int temp=0;
        int max = a>b?a:b;
        int min = a>b?b:a;
        
        while(true){
            temp = min;
            min = max%min;
            max=temp;
            if(min==0){
                return max;
            }
        }
    }
}
