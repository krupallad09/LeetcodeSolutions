import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class ArrayDivider {
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> mpp = new HashMap<>();
        for(int num : nums) {
            mpp.put(num, mpp.getOrDefault(num, 0) + 1);
        }

        for(int count : mpp.values()) {
            if(count % 2 != 0) {
                return false;
            }
        }

        return true;
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

        ArrayDivider obj = new ArrayDivider();
        System.out.println(obj.divideArray(nums));

        sc.close();
    }
}