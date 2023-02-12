import java.util.Scanner;

public class ThirdWeekTest2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n========================================================\n");

        //soal no.2 bagian a
        //menghitung luas lingkaran
        System.out.print("Masukkan jari-jari lingkaran: ");
        Double jariJari = input.nextDouble();
        Double luasLingkaran = Math.PI * (jariJari * jariJari);
        System.out.printf("Luas lingkaran dengan jari-jari %s adalah %.2f", jariJari, luasLingkaran);

        System.out.println("\n========================================================\n");

        //menghitung volume balok
        System.out.print("Masukkan panjang balok: ");
        int panjang = input.nextInt();
        System.out.print("Masukkan lebar balok: ");
        int lebar = input.nextInt();
        System.out.print("Masukkan tinggi balok: ");
        int tinggi = input.nextInt();
        int volumeBalok = panjang * lebar * tinggi;
        System.out.printf("Volume balok dengan panjang : %d lebar : %d dan tinggi : %d adalah : %d", panjang, lebar, tinggi, volumeBalok);
    }
}
