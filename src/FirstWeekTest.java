import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FirstWeekTest {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        File file = new File("calculations.txt");
        FileWriter writer = new FileWriter(file, true);

        while (true){
            System.out.print("Masukan nilai pertama: ");
            double angka1 = scanner.nextDouble();
            System.out.print("Masukan nilai kedua: ");
            double angka2 = scanner.nextDouble();
            System.out.print("Masukan operator (+, -, *, /, %): ");
            String operator = scanner.next();

            double hasil;
            switch (operator) {
                case "+":
                    hasil = angka1 + angka2;
                    break;
                case "-":
                    hasil = angka1 - angka2;
                    break;
                case "*":
                    hasil = angka1 * angka2;
                    break;
                case "/":
                    hasil = angka1 / angka2;
                    break;
                case "%":
                    hasil = angka1 % angka2;
                    break;
                default:
                    System.out.println("Invalid operator.");
                    continue;
            }

            String perhitungan = angka1 + " " + operator + " " + angka2 + " = " + hasil;
            System.out.println(perhitungan);
            writer.write(perhitungan + "\n");
            writer.close();

            System.out.println("Ingin melanjutkan kalkulator? (Y/N) : ");
            char pilihan = scanner.next().charAt(0);
            if(pilihan == 'N' || pilihan == 'n') {
                break;
            }

        }
    }
}