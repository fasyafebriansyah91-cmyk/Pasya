
import java.util.Scanner;

public class Latihan1 {
    static String decimalkeBiner(int n ) {
        if (n == 0) return "0";
        String hasil = "";
        while (n > 0) {
            hasil = (n % 2) + hasil;
            n = n /2;
        }
        return hasil;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan decimal: ");
        int n = sc.nextInt();
        System.out.println("Hasil Biner: " + decimalkeBiner(n));
        sc.close();
    }
}
