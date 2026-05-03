import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan umur Anda: ");
        int umur = scanner.nextInt();

        System.out.println("Halo, " + nama + "!");
        System.out.println("Umur Anda: " + umur + " tahun");

        scanner.close();
    }
}