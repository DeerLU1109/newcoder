/**
 * @author jinlu
 * @create 2021-04-16 14:50
 */
public class NC88 {
    //快排
    /**
     *
     * @author Coding6
     *	快速排序递归
     */

    public int findKth(int[] a, int n, int K) {
        sort(a,0,n-1);
        int res=a[a.length-K];
        return res;
    }

         public void sort(int[] a,int left,int right){
            int pivot;

            if(left<right){
                pivot=QuickSort(a,left,right);
                sort(a,left,pivot-1);
                sort(a,pivot+1,right);
            }

         }

        public int QuickSort(int []a,int left,int right){
            int pivot=a[left];
            while (left<right){
                while ((left<right)&&pivot<=a[right]){
                    right--;
                }
                a[left]=a[right];
                while ((left<right)&&pivot>=a[left]){
                    left++;
                }
                a[right]=a[left];
            }
            a[left]=pivot;
            return left;
        }





/*
    public int[] smallestK(int[] arr, int k) {
        for (int i = arr.length/2-1; i >=0; i--) {
            adjust(arr,i,arr.length);
        }
        for (int j = arr.length-1; j >0 ; j--) {
            swap(arr,0,j);
            adjust(arr,0,j);
        }
        int[] res=new int[k];
        for (int i = arr.length-1; i >k; i--) {
            res[i-arr.length+1]=arr[i];
        }
        return res;
    }
     public void adjust(int []a,int i,int length){
        int temp=a[i];
         for (int k = 2*i+1; k <length; k=2*i+1) {
             if (k+1<length &&a[k]<a[k+1]){
                 k++;
             }
             if (a[k]>temp){
                 a[i]=a[k];
                 i=k;
             }
             else break;

         }
         a[i]=temp;
     }

     public void swap(int []a,int i,int j){
        int tmp=a[i];
        a[i]=a[j];
        a[j]=tmp;
     }*/
}
