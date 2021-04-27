import java.util.*;

/**
 * @author jinlu
 * @create 2021-04-27 15:02
 */
public class NC54 {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        Arrays.sort(num);
        for (int k = 0; k < num.length - 2; k++) {
            if (num[k]>0) break;
            if (k>0&&num[k]==num[k-1]) continue;
            int i=k+1,j=num.length-1;
            while (i<j){
                int sum=num[k]+num[i]+num[j];
                if (sum<0){
                    while (i<j&&num[i]==num[++i]);
                }
                else if (sum>0){
                    while (i<j&&num[j]==num[--j]);
                }
                else {
                    res.add(new ArrayList<Integer>(Arrays.asList(num[k],num[i],num[j])));
                    while (i<j&&num[i]==num[++i]);
                    while (i<j&&num[j]==num[--j]);
                }
            }
        }
        return res;
    }
}
