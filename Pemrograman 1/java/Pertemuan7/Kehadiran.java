
import java.util.Scanner;

public class Kehadiran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Kehadiran Mahasiswa: ");
        float Kehadiran = sc.nextFloat();
        float hadir = (Kehadiran * 75) / 100;
        System.out.print("Masukkan Nilai: ");
        int Nilai = sc.nextInt();
        if(Kehadiran >= hadir){
            if (Nilai >= 80) {
                System.out.println("Grade A");
            } else if (Nilai >= 70 ) {
                System.out.println("Grade B");
            } else if (Nilai >= 60) {
                System.out.println("Grade C");
            } else if(Nilai >= 55){
                System.out.println("Grade D");
            } else if(Nilai < 55){
                System.out.println("Grade E");
            }
        } else if(Kehadiran < hadir){
            if (Nilai >= 55){
                System.out.println("Grade D");
            } else if (Nilai < 55){
                System.out.println("Grade E");
            }

            sc.close();
        }
    }
}
