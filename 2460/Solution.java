class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        int nz = 0;
        for(int i = 0; i < n - 1; i++) {
            if(nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }

        for(int i  = 0; i < n; i++) {
            if(nums[i] != 0) {
                nums[nz] = nums[i];
                nz++;
            }
        }

        for(int i  =nz ; i < n; i++) {
            nums[i] = 0;
        }
        return nums;
    }
}