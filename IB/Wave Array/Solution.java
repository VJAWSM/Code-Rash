public class Solution {
    public ArrayList<Integer> wave(ArrayList<Integer> A) {
        
        int len = A.size();
        int temp;
        Collections.sort(A);
        for(int i=0;i<len;i+=2){
            if(i==len-1)break;
            temp = A.get(i);
            A.set(i, A.get(i+1));
            A.set(i+1, temp);
        }
        
        
        return A;
        
    }
}
