import java.util.*;
import java.util.stream.Collectors;

public class PraktekFirstWeek {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("masukan jumlah barang : ");
        int length = scan.nextInt();

        List<String> barang = new ArrayList<>();

        for (int i = 1; i <= length; i++){
            System.out.print("masukan nama barang ke-" + i + " : ");
            String object;
            barang.add(object = scan.next());
        }
        System.out.println();
        System.out.println("barang yang sudah dilist");
        System.out.println(barang);
        List<String> sorting = barang.stream().sorted().collect(Collectors.toList());
        sorting.sort(Comparator.naturalOrder());

        System.out.print("barang yang di nomor : ");
        int search;
        sorting.indexOf(search = scan.nextInt());

        System.out.println("rack nomor " + " : ");


    }
}