import java.util.Scanner;

class rDuplicates {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for(int i = 1; i < nums.length; i++) {
            if(j == 1 || nums[i] != nums[j - 2]) {
                nums[j++] = nums[i];
            }
        }
        return j;

    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");

        int[] nums = new int[input.length];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        rDuplicates obj = new rDuplicates();
        System.out.println(obj.removeDuplicates(nums));

    }
}
