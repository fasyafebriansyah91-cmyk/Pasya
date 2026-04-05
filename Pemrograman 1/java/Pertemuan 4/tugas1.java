import java.util.Scanner;
public class tugas1{

    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Makan : ");
        float makan = input.nextFloat();

        System.out.print("Transportasi : ");
        float transportasi = input.nextFloat();

        System.out.print("Shopping : ");
        float Shopping = input.nextFloat();

        float pengeluaran = makan + transportasi + Shopping;

        double total_makan = ((double)makan / pengeluaran) * 100;
        double total_transportasi = ((double)transportasi / pengeluaran) * 100;
        double total_shopping = ((double) Shopping / pengeluaran) * 100;
        System.out.printf("Pengeluaran makan : %.2f%%\n", total_makan);
        System.out.printf("Pengeluaran transportasi : %.2f%%\n", total_transportasi);
        System.out.printf("Pengeluaran transportasi : %.2f%%\n", total_shopping);

    }
}
