import java.util.Scanner;

class Solution {
    public static int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int i = 0; i < k; i++) {
            int minIndex = 0;
            for(int j = 1; j < nums.length; j++) {
                if(nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }

            nums[minIndex] *= multiplier;
        }

        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k  = sc.nextInt();
        int multiplier = sc.nextInt();

        int[] result = new int[n];

        result = getFinalState(arr, k, multiplier);

        for(int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}