import java.util.Arrays;

/**
 * Created by zhang on 2017/10/25.
 */
public class main {

    public static void main(String[] args){
         int[] haha = new int[]{2,2,3,4,5,6,4,5,6,4,1,2,1,7,7,7,8,8,3,2,6,6};
       // int[] haha = new int[]{1,4};
       // int[] haha = new int[]{1,2,4,5,2,1,6,9,8,2};
       // quicksort qic = new quicksort();
      //  qic.subSort(haha , 0 , haha.length - 1);
     //   qic.qucikSort(haha);
        mergesort mer = new mergesort();
        mer.mergeSort(haha);
        for (int p : haha){
            System.out.print(p);
        }
        System.out.print(Arrays.toString(haha));
    }
}
