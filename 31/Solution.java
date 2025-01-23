class Solution {
    public void nextPermutation(int[] nums) {
        int idx = -1;
        int idx2 = -1;
        int n = nums.length;
        for(int i = n - 2; i >= 0; i--) {
            if(nums[i] < nums[i+1]) {
                idx = i;
                break;
            }
        }

        if(idx == -1) {
            reverse(nums, 0);
        } else {
            for(int i = nums.length - 1; i>= 0; i--) {
                if(nums[i] > nums[idx]) {
                    idx2 = i;
                    break;
                }
            }

            swap(nums, idx, idx2);
            reverse(nums, idx + 1);
        }
    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    void reverse(int[] nums, int start) {
        int i = start;
        int j = nums.length - 1;
        while(i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}