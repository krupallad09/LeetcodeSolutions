import java.util.Scanner;

public class Solution {
    public static int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maximumSum = Integer.MIN_VALUE;
        for(int num : nums) {
            currentSum += num;
            maximumSum = Math.max(maximumSum, currentSum);
            if(currentSum < 0) currentSum = 0;
        }
        return maximumSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = maxSubArray(arr);
    }
}