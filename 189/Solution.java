import java.util.Scanner;

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        reverseNum(nums, 0, n - 1);
        reverseNum(nums,0, k - 1);
        reverseNum(nums,k, n - 1);
    }

    public void reverseNum(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }      
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        rotate(arr, k);
    }
}