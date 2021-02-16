public class Solution {
    public String solve(String A) {
        
        Long num = Long.valueOf(A);
        Long noofdigits = (long)(Math.log(num+1)/Math.log(2))-1;
        Long base=2L;
        Long result = num-1;
        //System.out.println(result);
        
        for(long i=noofdigits;i>1;i--){
            base = (long)Math.pow(num, 1.0/i);
            //System.out.println(base+" "+i);
            if(cal(base,i)==num){
                return base.toString();
            }
        }
        
        return String.valueOf(result);
        
    }
    
    private long cal(long base, long noofdigits){
        
        long sum=0;
        sum = (long)(Math.pow(base, (noofdigits+1))-1)/(base-1);
        
        return sum;
        
    }
}
