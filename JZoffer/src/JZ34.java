import java.util.*;

/**
 * @author jinlu
 * @create 2021-04-22 15:40
 */
public class JZ34 {
    public int FirstNotRepeatingChar(String str) {
        if (str.length()==0) return -1;
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),1);
            }
            else{
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }


        }

        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i))==1) return i;

        }
        return -1;
    }
}
