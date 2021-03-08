public class Solution {
    public String solve(int A) {
        
        String x = "1", y="2";
        
        int length = (int)Math.ceil(Math.log(A + 2)/Math.log(2)) - 1;  
        
        int rank = A - (1 << length) + 1;  
      
        StringBuilder left = new StringBuilder();  
      
        for (int i = length -1 ; i >= 0; i--) 
        { 
            int mask = (1 << i);
            int bit = mask & rank;
            if (bit > 0) 
            {
                left.append(y);
            }
            else
            {
                left.append(x);
            }
        }  
          
        StringBuilder sb = new StringBuilder(left.toString());  
        sb.reverse();  
          
        left.append(sb.toString());
        return left.toString();  
        
    }
}
