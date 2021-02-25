public class Solution {
    public String longestCommonPrefix(ArrayList<String> A) {
        String ans = "";
        int n=A.size();
        int k=Integer.MAX_VALUE;
        for(String s:A){
            if(s.length()<k)k=s.length();
        }
        
        int len = k;
        for(int i=0;i<k;i++){
            char c = A.get(0).charAt(i);
            for(int j=1;j<n;j++){
                if(A.get(j).charAt(i)!=c){
                    len = i;
                    i=k;
                    break;
                }
            }
        }
        
        
        return A.get(0).substring(0, len);
        
    }
}
