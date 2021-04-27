import java.util.HashMap;

/**
 * @author jinlu
 * @create 2021-04-21 20:52
 */
public class JZ50 {
    public int duplicate (int[] numbers) {
        // write code here
        HashMap<Integer,Integer> map=new HashMap<>();
        if (numbers.length==0) return -1;
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(numbers[i])){
                map.put(numbers[i],map.get(numbers[i])+1);
            }
            else {
                map.put(numbers[i],1);
            }
            if (map.get(numbers[i])>1){
                return numbers[i];
            }
        }
        return -1;
    }
}
