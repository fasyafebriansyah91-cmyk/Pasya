import java.util.Scanner;
public class Latihan1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nilai Mahasiswa : ");
        System.out.println("=====================");
        System.out.println("Masukan nilai presensi : ");
        float presensi = input.nextFloat();

        System.out.print("Input Nilai Tugas = ");
        float tugas = input.nextFloat();

        System.out.print("Input Nilai UTS = ");
        float UTS = input.nextFloat();

        System.out.print("Input Nilai UAS = ");
        float UAS = input.nextFloat();

        float totalPresensi = presensi / 21 * 10;
        float totalTugas = tugas / 21 * 100;
        float totalUTS = UTS * 30 / 100;
        float totalUAS = UAS * 40 / 100;

        double total = totalPresensi + totalTugas + totalUTS + totalUAS;
        System.out.println("==================");
        System.out.printf("total : %.2f ", total);
    }
}
