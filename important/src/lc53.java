/**
 * @author jinlu
 * @create 2021-04-26 15:36
 */
public class lc53 {
    public int maxSubArray(int[] nums) {
        int res=nums[0];
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            if (sum>0){
                sum+=nums[i];
            }
            else {
                sum=nums[i];
            }
            res=Math.max(res,sum);
        }
        return res;
    }
}
