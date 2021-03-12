public class Solution {
    public int solve(String A) {
        int [] ar = new int[26];
        Arrays.fill(ar,0);
        for(int i=0; i<A.length();i++){
            ar[(int)A.charAt(i)-97]++;
        }
        int mine=24, maxe=0,mino=25,maxo=1, el=0, ol=0;
        for(int i=0;i<26;i++){
            if(i%2==0){
                if(ar[i]>0){
                    if(i<mine)mine=i;
                    if(i>maxe)maxe=i;
                    el++;
                }
            }else{
                if(ar[i]>0){
                    if(i<mino)mino=i;
                    if(i>maxo)maxo=i;
                    ol++;
                }
            }
        }
        if(el==0||ol==0)return 0;
        //System.out.println(mine+" "+maxe+" "+mino+" "+maxo+" "+el+" "+ol);
        if(mine==maxo+1||mine==maxo-1){
            if(mino==maxe+1||mino==maxe-1){
                return 0;
            }
        }
        
        return 1;
    }
}
