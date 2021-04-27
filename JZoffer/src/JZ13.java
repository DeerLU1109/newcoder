

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author jinlu
 * @create 2021-04-22 11:06
 */
public class JZ13 {
    public int[] reOrderArray (int[] array) {
        Queue<Integer> q1=new LinkedList<Integer>();
        Queue<Integer> q2=new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==0){
                q1.add(array[i]);
            }
            else {
                q2.add(array[i]);
            }
        }
        int j=0;
        while (!q1.isEmpty()){
                array[j]=q1.poll();
                j++;
        }
        while (!q2.isEmpty()){
            array[j]=q2.poll();
            j++;
        }
        return array;
    }
}
