import java.util.Scanner;

class Mahasiswa {
    String nama;
    int umur;

    void tampilkanData() {
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
    }
}
public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();

        mhs1.nama = "Budi";
        mhs1.umur = 20;

        mhs1.tampilkanData();
    }
}
