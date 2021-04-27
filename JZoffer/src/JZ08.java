/**
 * @author jinlu
 * @create 2021-04-21 20:31
 */
public class JZ08 {
    public int jumpFloorII(int target) {
        if (target==0||target==1) return 1;
        else if(target==2) return 2;
        else {
            return 2*jumpFloorII(target-1);
        }
    }
}
