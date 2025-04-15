class Solution {
    public int minOperations(int[] nums, int k) {
        Set<Integer> st = new HashSet<>();
        int min = Integer.MAX_VALUE;
        for(int num : nums) {
            min = Math.min(min, num);
            st.add(num);
        }

        if(min < k) return -1;
        return min == k ? st.size() - 1 : st.size();
    }
}