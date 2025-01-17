import java.util.Arrays;

package 349;



class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i  = 0;
        int j = 0;
        int index = 0;

        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] ans = new int[Math.min(nums1.length, nums2.length)];
        while(i < n1 && j < n2) {
            if(nums1[i] < nums2[j]) {
                i++;
            } else if(nums1[i] > nums2[j]){
                j++;
            } else {
                ans[index++] = nums1[i];
                i++;
                j++;

                while (i < nums1.length && nums1[i] == nums1[i - 1]) {
                    i++;
                }
                while (j < nums2.length && nums2[j] == nums2[j - 1]) {
                    j++;
                }
            }
        }

        return Arrays.copyOf(ans, index);
    }
}