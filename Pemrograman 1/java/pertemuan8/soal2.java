package pertemuan8;
import java.util.Scanner;
public class soal2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int nilai, total = 0;
        char ulang;

        do{
            System.out.print("Input nilai Mahasiswa : ");
            nilai = input.nextInt();

            total += nilai;

            System.out.print("Input lagi? (y/t) : ");
            ulang = input.next().charAt(0);

        } while (ulang == 'y' || ulang =='Y');

        System.out.println("Total nilai = " + total);
    }
}
