/**
 * @author jinlu
 * @create 2021-04-19 16:11
 */
public class NC36 {
    public int findMedianinTwoSortedAray (int[] arr1, int[] arr2) {//上中位数
        if (arr1.length==1) return Math.min(arr1[0],arr2[0]);
        int n=arr1.length;
        int l1=0,l2=0,r1=n-1,r2=n-1;
        while(l1<r1){
            int mid1 = l1 + ((r1 - l1) >> 1);
            int mid2 = l2 + ((r2 - l2) >> 1);
            int flag=(r1-l1+1)&1;
            if (arr1[mid1]==arr2[mid2])  return arr1[mid1];
            else if (arr1[mid1]<arr2[mid2]){
                if (flag==1){
                    l1=mid1;
                    r2=mid2;
                }
                else {
                    l1=mid1+1;
                    r2=mid2;
                }
            }
            else{
                if (flag==1){
                    r1=mid1;
                    l2=mid2;
                }
                else {
                    r1=mid1;
                    l2=mid2+1;
                }
            }
        }
        return Math.min(arr1[l1],arr2[l2]);

    }
    public static void main(String[] args) {
        int a[]=new int[]{1,3};
        int b[]=new int[]{2};
        NC36 o=new NC36();
        double mid=o.findMedianSortedArrays(a,b);
        System.out.println(mid);
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {//中位数
        double mid=0.0;
        int i=0,j=0,k=0;
        int [] merge=new int[nums1.length+nums2.length];
        int index=merge.length/2;
        if (nums1.length==0&&nums2.length!=0) merge=nums2;
        else if (nums2.length==0&&nums1.length!=0) merge=nums1;
        else if (nums2.length==0&&nums1.length==0) return 0.0;
        else {
            while(i<merge.length) {
                while(j<nums1.length&&k<nums2.length){
                    if (nums1[j]<=nums2[k]){
                        merge[i]=nums1[j];
                        j++;
                    }
                    else{
                        merge[i]=nums2[k];
                        k++;
                    }
                    i++;
                }
                if (j==nums1.length){
                    while (k<nums2.length){
                        merge[i]=nums2[k];
                        k++;
                        i++;
                    }

                }
                if(k==nums2.length){
                    while (j<nums1.length){
                        merge[i]=nums1[j];
                        j++;
                        i++;
                    }
                }

            }
        }


        if (merge.length%2==0){
            mid=(merge[index]+merge[index-1])/2.0;

        }
        else{
            mid=merge[index];
        }
       return mid;
    }
}
