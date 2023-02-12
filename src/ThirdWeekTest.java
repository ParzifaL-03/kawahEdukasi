import java.util.Scanner;

public class ThirdWeekTest {
    public static void main(String[] args) {
        //soal no.1 bagian a
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();
        System.out.println("Selamat datang di bootcamp Kawah Edukasi, " + nama + ".");

        System.out.println("\n========================================================\n");

        //soal no.1 bagian b
        short shortData1 = 100;
        short shortData2 = 200;
        double doubleData1 = 3.14;
        double doubleData2 = 2.71;
        char charData1 = 'A';
        char charData2 = 'B';
        boolean boolData1 = true;
        boolean boolData2 = false;
        PrintData(shortData1);
        PrintData(shortData2);
        PrintData(doubleData1);
        PrintData(doubleData2);
        PrintData(charData1);
        PrintData(charData2);
        PrintData(boolData1);
        PrintData(boolData2);

        System.out.println("\n========================================================\n");

        //soal no.1 bagian c
        String str1 = "Saya senang";
        String str2 = "belajar";
        String str3 = "Java Language";
        StringBuilder builder = new StringBuilder();

        builder.append(str1).append(" ").append(str2).append(" ").append(str3);
        System.out.println(builder.toString());


    }
    private static void PrintData(short data){
        System.out.println("tipe data ini adalah short dengan value = " + data);
    }
    private static void PrintData(double data){
        System.out.println("tipe data ini adalah double dengan value = " + data);
    }
    private static void PrintData(char data){
        System.out.println("tipe data ini adalah char dengan value = " + data);
    }
    private static void PrintData(boolean data){
        System.out.println("tipe data ini adalah boolean dengan value = " + data);
    }
}
