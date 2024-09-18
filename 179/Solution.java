import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static String largestNumber(int[] nums) {
        String[] numStringArray = new String[nums.length];

        for(int i = 0; i < nums.length; i++) {
            numStringArray[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(numStringArray, (a, b) -> (b + a).compareTo(a + b));

        StringBuilder res = new StringBuilder();
        for(int i = 0; i < numStringArray.length; i++) {
            res.append(numStringArray[i]);
        }

        return res.charAt(0) == '0' ? "0" : res.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        String res = sc.nextLine();
        res = largestNumber(nums);
        System.out.println(res);
        sc.close();
    }
}
