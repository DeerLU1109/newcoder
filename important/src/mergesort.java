import java.util.Arrays;

/**
 * @author jinlu
 * @create 2021-04-26 19:24
 */
public class mergesort {
    public static void main(String[] args) {
        mergesort m=new mergesort();
        int[]a=new int[]{1,6,7,2,6,54,4,58};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+",");
        }
        System.out.println("*****************");

        for (int i = 0; i < a.length; i++) {
            System.out.print(m.MergeSort(a)[i]+",");
        }
    }
    public  int[] MergeSort(int[] sortarray){
        if (sortarray.length<2) return sortarray;
        int mid=sortarray.length/2;
        int[] left= Arrays.copyOfRange(sortarray,0,mid);
        int[] right=Arrays.copyOfRange(sortarray,mid,sortarray.length);
        return merge(MergeSort(left),MergeSort(right));
    }

    private int[] merge(int[] left, int[] right) {
        int[] res=new int[left.length+right.length];
        for (int index = 0,i=0,j=0; index <res.length ; index++) {
            if (i>=left.length){
                res[index]=right[j++];
            }
            else if (j>=right.length){
                res[index]=left[i++];
            }
            else if (left[i]<right[j]){
                res[index]=left[i++];
            }
            else {
                res[index]=right[j++];
            }
        }
        return  res;
    }
}
