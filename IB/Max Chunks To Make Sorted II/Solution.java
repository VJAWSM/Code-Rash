public class Solution {
    public int solve(ArrayList<Integer> A) {
        
        int len = A.size();
        int [] min = new int[len];
        int nooc = 0;
        int [] max = new int[len];
        
        int mx=A.get(0);
        max[0] = mx;
        for(int i=1;i<len;i++){
            if(A.get(i)>mx){
                max[i] = A.get(i);
                mx=max[i];
            }else{
                max[i] = mx;
            }
        }
        
        int mn = A.get(len-1);
        min[len-1] = mn;
        for(int i=len-2;i>-1;i--){
            if(A.get(i)<mn){
                min[i]=A.get(i);
                mn = min[i];
            }else{
                min[i]= mn;
            }
        }
        
        for(int i=1;i<len;i++){
            if(min[i]>=max[i-1]){
                nooc++;
            }
        }
        
        return ++nooc;
    }
}

