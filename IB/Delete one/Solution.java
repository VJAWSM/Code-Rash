public class Solution {
    public int solve(ArrayList<Integer> A) {
        
        int len = A.size();
        int result = 0;
        ArrayList<Integer> prefix = new ArrayList<>();
        ArrayList<Integer> suffix = new ArrayList<>();
        
        prefix.add(A.get(0));
        
        for(int i=1;i<=len;i++){
            prefix.add(cal(prefix.get(i-1), A.get(i-1)));
        }
        
        suffix.add(A.get(len-1));
        
        for(int i=len-2;i>=-1;i--){
            suffix.add(0, cal(suffix.get(0), A.get(i+1)));
        }
        
        result = Math.max(prefix.get(len-1), suffix.get(1));
        
        for(int i=1;i<len-1;i++){
            result = Math.max(result, cal(prefix.get(i),suffix.get(i+1)));
        }
        
        return result;
    }
    
    public int cal(int a, int b){
        int result=0,temp=0;
        int max = a>b?a:b;
        int min = a>b?b:a;
        
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
