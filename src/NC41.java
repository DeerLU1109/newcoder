import java.util.HashMap;
import java.util.Map;

/**
 * @author jinlu
 * @create 2021-04-19 9:43
 */
public class NC41 {//给定一个数组arr，返回arr的最长无的重复子串的长度(无重复指的是所有数字都不相同)
    public int maxLength (int[] arr) {
        int max=0;
        int left=0;
        if (arr.length==0) return 0;
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])){
                left=Math.max(left,map.get(arr[i])+1);
            }
            map.put(arr[i],i);
            max=Math.max(max,i-left+1);
        }
        return  max;
    }
}
