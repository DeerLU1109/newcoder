/**
 * @author jinlu
 * @create 2021-04-22 10:54
 */
public class JZ12 {
    public double Power(double base, int exponent) {
        double res= 1.0;
        if (exponent>0){
            for (int i = 0; i < exponent; i++) {
                res=res*base;
            }
        }
        else {
            base=1/base;
            exponent=0-exponent;
            for (int i = 0; i < exponent; i++) {
                res=res*base;
            }
        }
        return res;
    }
}
