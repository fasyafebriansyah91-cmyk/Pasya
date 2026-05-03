package pertemuan8;
import java.util.Scanner;
public class soal1 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int nilai;
        char ulang;

        do{
            System.out.print("Input nilai mahasiswa : ");
            nilai = input.nextInt();

            System.out.println("Nilai yang diinput: " + nilai );

            System.out.print("Input lagi (y/t) : ");
            ulang = input.next().charAt(0);


        } while (ulang == 'y' || ulang == 'Y');
        System.out.println("Program selesai.");
    }
}
