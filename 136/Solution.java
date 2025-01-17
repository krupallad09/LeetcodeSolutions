import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        singleNumber(arr);
    }

    public static int singleNumber(int[] nums) {
        int xor = 0;
        for(int i = 0; i < nums.length; i++) {
            xor = xor ^ nums[i];
        }
        return xor;
    }
}
