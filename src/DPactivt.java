import java.util.ArrayList;

/**
 * Created by zhang on 2017/10/28.
 */
public class DPactivt {

    //贪心算法的递归解
    public static ArrayList<Integer> greedyActivitySelection(int[] s, int[] f, int i, int n, ArrayList<Integer> activities){
              //初始调用时 i = 0, 所以a(1)是必选的(注意:活动编号已经按结束时间排序)
             int m = i + 1;                //s[m] < f[i] 意味着活动 a(m) 与 a(i)冲突了
             while(m <= n && s[m] < f[i]) {
                 m++;//选择下一个活动
             }
             if(m <= n){
                 activities.add(m);
                 greedyActivitySelection(s, f, m, n, activities);
              }
                  return activities;
   }



               //贪心算法的非递归解, assume f[] has been sorted and actId 0/n+1 is virtually added
           public static ArrayList<Integer> greedyActivitySelection2(int[] s, int[] f, int n, ArrayList<Integer> acitivities){
        //所有真正的活动(不包括 活动0和 活动n+1)中,结束时间最早的那个活动一定是最大兼容活动集合中的 活动.
             int m = 1;
             acitivities.add(m);
              for(int actId = 2; actId <= n; actId++){
                  if(s[actId] >= f[m])//actId的开始时间在 m 号活动之后.--actId 与 m 没有冲突
                 {          m = actId;               acitivities.add(m);
                   }
                        }       return acitivities;
               }
}
