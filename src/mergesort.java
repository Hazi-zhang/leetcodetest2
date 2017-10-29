/**
 * Created by zhang on 2017/10/26.
 */
public class mergesort {
    //拆分
    public static void sort(int[] arra , int start , int end){
        if (start < end) {
            int middle = (start + end )/2;
            sort(arra , start , middle);
            sort(arra , middle + 1 , end);
            merge(arra , start , middle , end);
        }
    }
    //合并
    public static void merge(int[] temp , int low , int center , int high){
        int[] tmpArr = new int[temp.length];
        int mid = center + 1;
        int third  = low;
        int t = low;
        while (low <= center && mid <= high){
            if (temp[low] >= temp[mid]){
                tmpArr[third++] = temp[low++];
            }else {
                tmpArr[third++] = temp[mid++];
            }
        }

        while(mid <= high){
            tmpArr[third++] = temp[mid++];
        }
        while (low <= center){
            tmpArr[third++] = temp[low++];
        }
        while (t <= high){
            temp[t] = tmpArr[t++];
        }
    }
    //包装
    public void  mergeSort(int[] arras){
        sort(arras , 0 , arras.length - 1);
    }

}
