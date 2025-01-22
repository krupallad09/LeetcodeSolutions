import java.util.HashMap;
import java.util.Map;


public class Solution {
    public int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> mpp = new HashMap<>();
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        for(int i = 0; i < arr.length; i++) {
            int a  = arr[i];
            int more  = target - a;
            if(mpp.containsKey(more)) {
                ans[0] = mpp.get(more);
                ans[1] = i;
                return ans;
            }

            mpp.put(arr[i], i);
        }
        return ans;
    }
}
