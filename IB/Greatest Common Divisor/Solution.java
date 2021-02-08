public class Solution {
    public int gcd(int A, int B) {
        
        int result=0, temp=0;
        int max = A>B?A:B;
        int min = A>B?B:A;
        
        if(min==0){
            return max;
        }
        
        while(true){
            temp = min;
            min = max%min;
            max = temp;
            if(min==0){
                result = max;
                break;
            }
        }
        
        return result;
        
    }
}
