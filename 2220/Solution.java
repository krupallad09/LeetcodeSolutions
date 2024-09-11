public class Solution {
    public int minBitFlips(int start, int goal) {
        int ans = start ^ goal;
        int count = 0;
        while(ans != 0) {
            count += ans & 1;
            ans >>=1;
        }
        return count;
    }

    public static void main(String arg[]) {
        Scanner sc =  new Scanner(System.in);
        int start = sc.nextInt();
        int goal = sc.nextInt();
        int ans = minBitFlips(start, goal);
        System.out.println(ans);
    }
}