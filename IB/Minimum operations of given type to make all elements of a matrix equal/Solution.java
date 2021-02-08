public class Solution {
    public int solve(ArrayList<ArrayList<Integer>> A, int B) {
        int r = A.size();
        int c = A.get(0).size();
        int mod = ((A.get(0).get(0)%B)+B)%B;
        
        ArrayList <Integer> list = new ArrayList<>();
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int temp = A.get(i).get(j);
                if(((temp%B)+B)%B!=mod){
                    return -1;
                }
                list.add(temp);
            }
        }
        
        Collections.sort(list);
        
        int len = list.size();
        int median, median2=0;
        int min1=0, min2=Integer.MAX_VALUE;
        if(len%2==0){
            median = list.get((len-2)/2);
            median2 = list.get(len/2);
            min2=0;
        }else{
            median = list.get(len/2);
        }
        for(int i=0;i<len;i++){
            min1+=Math.abs(list.get(i)-median)/B;
            if(len%2==0){
                min2+=Math.abs(list.get(i)-median2)/B;
            }
        }
        return min1<min2?min1:min2;
    }
}
