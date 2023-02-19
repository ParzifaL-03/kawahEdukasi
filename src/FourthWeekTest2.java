import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FourthWeekTest2 {

    public static void main(String[] args) {
        // Membuat List namaMakanan dan menentukan value
        // 10 value
        System.out.println("Membuat List 10 nama makanan");
        List<String> namaMakanan = Arrays.asList(
                "Nasi Goreng",
                "Mie Ayam",
                "Sate Kambing",
                "Gado-Gado",
                "Soto Betawi",
                "Bakso",
                "Rendang",
                "Ayam Goreng",
                "Cap Cay",
                "Nasi Padang"
        );
        System.out.println(namaMakanan);

        // Membuat List tahunPialaDunia dan menentukan value
        // 6 value
        System.out.println("\nMembuat List tahun piala dunia");
        List<Integer> tahunPialaDunia = Arrays.asList(
                2002,
                2006,
                2010,
                2014,
                2018,
                2022
        );
        System.out.println(tahunPialaDunia);

        // Membuat List namaProvinsi dan Menentukan value
        // 10 value
        System.out.println("\nMembuat List nama provinsi dan mensorting secara descending");
        List<String> namaProvinsi = Arrays.asList(
                "Jawa Timur",
                "Jawa Barat",
                "Jawa Tengah",
                "Sulawesi Selatan",
                "Sumatera Utara",
                "Papua",
                "Kalimantan Timur",
                "Aceh",
                "Bali",
                "NTB"
        );
        System.out.println(namaProvinsi);

        // Mensorting secara descending pada list namaProvinsi
        // Sebelum disorting
        System.out.println("\nSebelum disorting");
        System.out.println(namaProvinsi);
        // Setelah disorting
        System.out.println("\nSetelah disorting");
        namaProvinsi.sort(Collections.reverseOrder());
        System.out.println(namaProvinsi);

        // Memmbuat List bahasaPemrograman dan menentukan value
        // 12 value
        System.out.println("\nMembuat List bahasa pemrograman dan menghapus 5 value didalamnya");
        List<String> bahasaPemrograman = new ArrayList<>(
                Arrays.asList(
                        "Java",
                        "Python",
                        "C++",
                        "JavaScript",
                        "PHP",
                        "Ruby",
                        "Swift",
                        "Objective-C",
                        "Go",
                        "Kotlin",
                        "Rust",
                        "Scala"
                ));
        System.out.println(bahasaPemrograman);

        // Penghapusan 5 value dalam list bahasaPemrograman
        // Sebelum penghapusan
        System.out.println("\nSebelum value dihapus");
        System.out.println(bahasaPemrograman);

        // Setelah penghapusan
        System.out.println("\nSetelah value dihapus");
        bahasaPemrograman.remove("Python");
        bahasaPemrograman.remove("JavaScript");
        bahasaPemrograman.remove("Swift");
        bahasaPemrograman.remove("Rust");
        bahasaPemrograman.remove("Scala");
        System.out.println(bahasaPemrograman);


    }

}
