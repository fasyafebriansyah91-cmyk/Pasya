import java.util.Scanner;

public class tugas2 {
    static String decimalkeHex(int n){
        if (n == 0) return "0";
        String hex = "0123456789ABCDEF";
        String hasil = "";
        while (n > 0) {
            hasil = hex.charAt(n % 16) + hasil;
            n = n / 16;
        }
        return hasil;

        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Input Decimal: ");
            int n = sc.nextInt();
            System.out.println("Hasil Hexadecimal: " + decimalkeHex(n));
            sc.close();

        }
    
}
