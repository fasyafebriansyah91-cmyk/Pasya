package Pertemuan6;
import java.util.Scanner;

public class Latihanifelse2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Apakah hujan? (true/false): ");
    
        boolean hujan2 = sc.nextBoolean();

        if (hujan2) {
            System.out.println("Pakai jas hujan");
        } else {
            System.out.println("Tidak pakai jas hujan");
        }
    }
}
