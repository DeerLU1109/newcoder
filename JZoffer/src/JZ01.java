/**
 * @author jinlu
 * @create 2021-04-21 15:54
 */
public class JZ01 {

        public boolean Find(int target, int [][] array) {
            int i=array.length-1,j=0;
            while (i>=0&&j<array[0].length){
                if (array[i][j]==target) return true;
                else if (array[i][j]<target){
                    j++;
                }
                else {
                    i--;
                }
            }
            return false;
        }


}
/*
* public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }
    }*/