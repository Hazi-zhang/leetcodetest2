import java.util.Arrays;

/**
 * Created by zhang on 2017/10/25.
 */
public class find {
    public int findKthLargest(int[] nums , int k){
        final int L = nums.length;
        Arrays.sort(nums);
        int flag = 1;
        for(int i = L - 2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                flag ++;
                if(flag == k){
                    return nums[i];
                }
            }
        }
        return nums[L - flag];
    }
}
