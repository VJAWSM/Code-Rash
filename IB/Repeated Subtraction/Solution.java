public class Solution {
    public int getFinal(int A, int B) {
        
        int result = 0, temp=0;
        int max = A>B?A:B;
        int min = A>B?B:A;
        
        while(true){
            if(min==0){
                result = max;
                break;
            }else if(max%min==0){
                result = 2*min;
                break;
            }else{
                temp = min;
                min = max%min;
                max = temp;
            }
        }
        return result;
    }
}
