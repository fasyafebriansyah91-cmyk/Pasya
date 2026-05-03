package Pertemuan5;

public class array {
    public static void main(String[]args ) {
        int[] angka = {10,20,30,40,50};

        System.out.println("input array : ");
        for (int i = 0; i< angka.length; i++) {
            System.out.println("elemen ke 1"+ i + " = " + angka[i]);

        }
        int total = 0;
        for (int i = 0; i < angka.length; i++){
            total += angka[i];
        }
        System.out.println("Total nilai = " + total);
    }
}
