import java.util.Scanner;

class Solution {
    public static String stringHash(String s, int k) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < s.length(); i += k) {
            int sum = 0;
            for(int j = i; j < i + k; j++) {
                sum += s.charAt(j) - 'a';
            }
            int hashedChar = sum % 26;
            result.append((char) ('a' + hashedChar));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int k = sc.nextInt();
        String result = stringHash(str, k);
        System.out.println(result);
    }
}