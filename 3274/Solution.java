import java.util.Scanner;


public class Solution {
    public static boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        return isBlack(coordinate1) == isBlack(coordinate2);
    }

    private static boolean isBlack(String coordinate) {
        char column  = coordinate.charAt(0);
        char row = coordinate.charAt(1);
        return (column - 'a' + row - '1') % 2 == 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        boolean res = checkTwoChessboards(str1, str2);
        System.out.println(res);
    }
}
