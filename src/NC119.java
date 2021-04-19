import java.util.ArrayList;
import java.util.List;

/**
 * @author jinlu
 * @create 2021-04-15 20:27
 */
public class NC119 {
    //最大的K个元素
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res=new ArrayList<>();
        HeapSort(input);
        for (int i = input.length-k; i < input.length; i++) {
            res.add(input[i]);
        }
        return res;
    }


    //堆排序
    public void HeapSort(int a[]){
    //创建堆
        for (int i = a.length/2-1; i>=0; i--) {
            adjust(a,i,a.length);
        }

        //将堆顶元素与最后一个节点交换并调整堆
        for (int j = a.length-1; j >0 ; j--) {
            swap(a,0,j);
            adjust(a,0,j);

        }
    }



    //调整堆
    public void  adjust(int a[],int i,int length){
        int tmp=a[i];
        for (int k = 2*i+1; k <length; k=2*k+1) {
            if (k+1<length && a[k]<a[k+1]){
                k++;
            }
            if (a[k]>tmp){
                a[i]=a[k];
                i=k;
            }
            else break;
        }
        a[i]=tmp;
    }

    public void swap(int[] a,int i,int j ){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;

    }
}
