/**
 * Created by zhang on 2017/10/25.
 */
public class quicksort {
    public static void swap(int[] arra , int a , int b){
            int temp = arra[a];
            arra[a] = arra[b] ;
            arra[b] = temp;
    }
    //排序好后,对pivot所在的中间位置进行返回
    public static void  subSort(int[] nums , int start , int end){
        if(start < end){
            int pivot = nums[start];
            int i = start + 1;
            int j = end ;
            while(true){
                while(i < end && nums[i++] <= pivot);
                while (j > start && nums[j--] >= pivot);
                if (i < j){
                   swap(nums , i , j);
                }else{
                    break;
                }
            }
            swap(nums , start , j);
            subSort(nums  , start , j - 1);
            subSort(nums , j + 1 , end);
        }
    }
    public void qucikSort(int[] arra){
        subSort(arra , 0 , arra.length - 1);
    }
}
