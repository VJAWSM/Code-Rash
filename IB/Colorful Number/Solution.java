public class Solution {
    HashMap<Integer, Integer> map = new HashMap<>();
    public int colorful(int A) {
        int [] ar = new int[(int)Math.log10(A)+1];
        int x = A, i=0;
        while(x!=0&&i<ar.length){
            ar[i] = x%10;
            if(map.containsKey(ar[i]))return 0;
            map.put(ar[i],1);
            x=x/10;
            i++;
        }
        //System.out.println(map.toString());
        for(int wsize=2; wsize<=ar.length;wsize++){
            int val=ar[0];
            for(i=1;i<ar.length;i++){
                if(i<wsize){
                    val*=ar[i];
                }else{
                    val/=ar[i-wsize];
                    val*=ar[i];
                }
                if(map.containsKey(val)){
                    return 0;
                }
            }
            //System.out.println(wsize+" "+val);
        }
        
        
        return 1;
        
    }
}
