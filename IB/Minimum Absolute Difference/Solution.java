public class Solution {
    public int solve(ArrayList<Integer> A) {
        
        mergesort(A, 0, A.size()-1);
        int n = A.size();
        int min = Integer.MAX_VALUE;
        int temp = 0;
        for(int i=1;i<n;i++){
            temp = Math.abs(A.get(i)-A.get(i-1));
            if(temp<min)min=temp;
        }
        
        return min;
    }
    
    private void mergesort(ArrayList<Integer> a, int start, int end){
        if(start==end)return;
        int mid = start +(end-start)/2;
        mergesort(a, start, mid);
        mergesort(a,mid+1, end);
        merge(a, start, mid, end);
    }
    
    private void merge (ArrayList<Integer> a, int start, int mid, int end){
        ArrayList<Integer> ans = new ArrayList<>();
        int i=start,j=mid+1, n=a.size();
        
        while(i<=mid&&j<=end){
            if(a.get(i)<=a.get(j)){
                ans.add(a.get(i));
                i++;
            }else{
                ans.add(a.get(j));
                j++;
            }
        }
        
        while(i<=mid){
            ans.add(a.get(i));
            i++;
        }
        
        while(j<=end){
            ans.add(a.get(j));
            j++;
        }
        
        for(i=start, j=0;i<=end;i++,j++){
            a.set(i, ans.get(j));
        }
    }
}
