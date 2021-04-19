/**
 * @author jinlu
 * @create 2021-04-16 13:52
 */

//二分查找
public class NC105 {
    public int search (int[] nums, int target) {
        // write code here
        int low=0;
        int high=nums.length-1;

        while (low<=high){
            int m=low+(high-low)/2;
            if (nums[m]==target){
                while ((m!=0)&&nums[m-1]==target){
                    m--;
                }
                return m;
            }
            else if (nums[m]>target){
                high=m-1;
            }
            else{
                low=m+1;
            }

        }
        return -1;
    }
}
