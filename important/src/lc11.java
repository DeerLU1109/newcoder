/**
 * @author jinlu
 * @create 2021-04-27 14:35
 */
public class lc11 {
    public int maxArea(int[] height){
        int res=0;
        int i=0,j=height.length-1;
        while (i<j){
            res=height[i]>height[j]?
                    Math.max(res,(j-i)*height[j--]):
                    Math.max(res,(j-i)*height[i++]);
        }
        return res;
    }
}
