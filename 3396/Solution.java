class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        int[] hash = new int[101];
        for(int num : nums) {
            hash[num]++;
        }        

        int ans = 0;
        int idx = 0;
        while(!unique(hash)) {
            int count = 3;
            while(idx < n && count-- > 0) {
                hash[nums[idx]]--;
                idx++;
            }
            ans++;
        }

        return ans; 
    }

    private boolean unique(int[] hash) {
        for(int i = 0; i <hash.length; i++) {
            if(hash[i] > 1) return false;
        }
        return true;
    }
}