package pertemuan8;
import java.util.Scanner;
public class soal3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int nilai, total = 0, jumlahData = 0;
        double rataRata;
        char ulang;

        do{
            System.out.print("Input nilai mahasiswa: ");
            nilai = input.nextInt();

            total += nilai;
            jumlahData++;

            System.out.print("Input lagi? (y/t) : " );
            ulang = input.next().charAt(0);

        } while (ulang == 'y' || ulang == 'Y');

        rataRata = (double) total / jumlahData;
        System.out.print("Total nilai = " + total);
        System.out.print("Rata rata = " + rataRata);
    }
}
