class Solution {
    public int countQuadruplets(int[] nums) {
        int cnt = 0;
        if(nums.length < 4) return 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    for(int h = k + 1; h < nums.length; h++) {
                        if(nums[i] + nums[j] + nums[k] == nums[h]) {
                            cnt++;
                        }
                    }
                }
            }
        } 
        return cnt; 
    }
}