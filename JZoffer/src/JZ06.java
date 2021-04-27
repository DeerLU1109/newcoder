/**
 * @author jinlu
 * @create 2021-04-21 19:59
 */

/*
* 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。*/
public class JZ06 {
    public int minNumberInRotateArray(int [] array) {
        if (array.length==0) return 0;
        int i=0,j=array.length-1;

        while (i<j){
            int m=(j+i)/2;
            if (array[m]>array[j]){
                i=m+1;
            }
            else if (array[m]<array[j]){
                j=m;
            }
            else {
                j--;

            }
        }
        return array[i];
    }
}
