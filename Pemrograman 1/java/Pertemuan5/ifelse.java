package Pertemuan5;
import java.util.Scanner;

public class ifelse {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = sc.nextInt();

        if (nilai > 85) {
            System.out.println("Grade A - Sangat Baik");
        } else if (nilai > 70) {
            System.out.println("Grade B - Baik");
        } else if (nilai > 55) {
            System.out.println("Grade C - Cukup");
        } else {
            System.out.println("Grade D - Tidak lulus");
        }
        sc.close();

    }
}
