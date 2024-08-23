import java.util.Scanner;

class BitwiseComplement {
    public static int findComplement(int num) {
        if(num == 0) return 1;
        int bitLength = Integer.toBinaryString(num).length();   
        int mask = (1 << bitLength) - 1;
        return num ^ mask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = findComplement(num);
        System.out.println(result);        
    }
}