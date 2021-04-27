/**
 * @author jinlu
 * @create 2021-04-22 9:55
 */
public class JZ10 {
    public int rectCover(int target) {
        if (target<=0) return 0;
        if (target==1) return 1;
        if (target==2) return 2;
        else return rectCover(target-1)+rectCover(target-2);
    }
}
