/**
 * @author jinlu
 * @create 2021-04-22 10:37
 */
public class JZ11 {
    public int NumberOf1(int n) {
        int res=0;
        while (n!=0){
            res++;
            res=res&(res-1);
        }
        return res;
    }
}
