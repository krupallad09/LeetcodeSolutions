import java.util.Scanner;

class Solution {
    public static int generateKey(int num1, int num2, int num3) {
        String str1 = String.format("%04d", num1);
        String str2 = String.format("%04d", num2);
        String str3 = String.format("%04d", num3);

        StringBuilder key = new StringBuilder();

        for(int i = 0; i < 4; i++) {
            int minDigit = Math.min(Math.min(str1.charAt(i) - '0', str2.charAt(i) - '0'), str3.charAt(i) - '0');
            key.append(minDigit);
        }

        while(key.length() > 1 && key.charAt(0) == '0') {
            key.deleteCharAt(0);
        }

        return Integer.parseInt(key.toString());
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int result = generateKey(num1, num2, num3);
        System.out.println(result);
    }
}