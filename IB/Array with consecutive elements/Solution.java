public class Solution {
    public int solve(ArrayList<Integer> A) {
    
    int n = A.size();
    HashSet<Integer> S = new HashSet<Integer>(); 
    for (int i = 0; i < n; i++) 
        S.add(A.get(i)); 
  
    ////////System.out.println(S.toString());
    int ans = 0;
    int i=0;
    for (; i < n; i++)  
    {   int num = 0;
        while(S.contains(A.get(i)-num)){
            num++;
        }
        int start = A.get(i)-num+1;
        int temp = 0;
        //System.out.println(start);
        while(S.contains(start)){
            temp++;
            S.remove(start);
            start++;
            n--;
        }
        ans = Math.max(ans, temp);
    }
    if(n!=0) return 0;
    return 1; 
        
    }
}
