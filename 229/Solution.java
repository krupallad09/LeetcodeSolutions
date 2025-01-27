import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1 = 0, cnt2 = 0;
        int n = nums.length;
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            if(cnt1 == 0 && ele2 != nums[i]) {
                cnt1 = 1;
                ele1 = nums[i];
            } else if(cnt2 == 0 && ele1 != nums[i]) {
                cnt2 = 1;
                ele2 = nums[i];
            }

            else if(ele1 == nums[i]) {
                cnt1++;
            } else if(ele2 == nums[i]) {
                cnt2++;
            }
            else {
                cnt1--;
                cnt2--;

            }
        }

        List<Integer> ls = new ArrayList<>();
        cnt1 = 0; 
        cnt2 = 0;
        for(int i = 0; i < n; i++) {
            if(ele1 == nums[i]) cnt1++;
            if(ele2 == nums[i]) cnt2++;
        }

        int mini = (int)(n/3) + 1;
        if(cnt1 >= mini) ls.add(ele1);
        if(cnt2 >= mini) ls.add(ele2);

        return ls;
    }
}