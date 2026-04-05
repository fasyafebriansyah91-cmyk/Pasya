import java.util.Scanner;

public class Latihan1 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String nama; int usia;
        String alamat;
        System.out.print("Input nama: ");
        nama = input.nextLine();
        System.out.print("Input usia: ");
        usia = input.nextint();
        input.nextLine();
        System.out.print("Input alamat: ");
        alamat = input.nextLine();
        System.out.println("Nama: " +nama);
        System.out.println("Usia: " +usia);
        System.out.println("Alamat: ");
    }
}
