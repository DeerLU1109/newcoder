/**
 * @author jinlu
 * @create 2021-04-27 14:58
 */
public class NC128 {
    public long maxWater (int[] arr) {
        // write code here
        long res=0l;
        int i=0,j=arr.length-1;
        int lmax=arr[0],rmax=arr[arr.length-1];
        while(i<=j){
            if(lmax<rmax){
                lmax=Math.max(lmax,arr[i]);
                res+=lmax-arr[i];
                i++;
            }
            else{
                rmax=Math.max(rmax,arr[j]);
                res+=rmax-arr[j];
                j--;
            }
        }
        return res;
    }
}
