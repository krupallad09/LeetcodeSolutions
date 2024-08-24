import java.util.Scanner;

public class sortColors {
    public static void sortColors(int[] nums) {
        int count0 = 0, count1 = 0, count2 = 0;
        for(int i = 0 ; i < nums.length; i++) {
            if(nums[i] == 0) 
                count0++;
            else if(nums[i] == 1)
                count1++;
            else
                count2++;
        }

        for(int i = 0; i < count0; i++) {
            nums[i] = 0;
        }

        for(int i = count0; i < count0 + count1; i++) {
            nums[i] = 1;
        }

        for(int i = count0 + count1; i < nums.length; i++) {
            nums[i] = 2;
        }
    } 
    
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        sortColors(nums);

        for(int num : nums) {
            System.out.println(num + " ");
        }
    }
}
