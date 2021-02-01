public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        long len = (long)A.size();
        long repeat = 0L, missing = 0L, sum1 = 0L, sumsq1 =0L, sum2 =0L, diff = 0L, diffsq =0L;
        long sum = len%2==0?((len/2)*(len+1)):(len*((len+1)/2));
        long sumsq=sum%3==0?((sum/3)*((2*len)+1)):(sum*(((2*len)+1)/3));
        ArrayList<Integer> result = new ArrayList<>();
        
        for(Integer i :A){
            sum1+=i;
            sumsq1+=((long)i*(long)i);
        }
        
        diff = sum-sum1;
        diffsq = sumsq-sumsq1;
        sum2 = diffsq/diff;
        
        repeat = (sum2-diff)/2;
        missing = (sum2+diff)/2;
        
        result.add((int)repeat);
        result.add((int)missing);
        
        return result;
    }
}
//O(n) time, O(1) space with immutable array