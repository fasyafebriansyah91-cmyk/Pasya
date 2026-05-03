
import java.util.Scanner;


public class latihan1variabeljava {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        String nama;
        String nim;
        String kelas;
        String asal;

        System.out.println("Data Mahasiswa");
        System.out.print("Input Nama : ");
        nama = scanner.nextLine();

        System.out.print("Input NIM :  ");
        nim = scanner.nextLine();

        System.out.print("Input Kelas : ");
        kelas = scanner.nextLine();

        System.out.print("Input asal : ");
        asal = scanner.nextLine();

        System.out.println();
        System.out.println("== Data Mahasiswa == ");
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Asal : " + asal);




    }
}
