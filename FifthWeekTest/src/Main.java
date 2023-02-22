public class Main {
    public static void main(String[] args) {

        // Tanah Pak Dangklek ada 4, yaitu persegi, persegi panjang, segitiga dan ligkaran


        // Tanah persegi dengan sisi 5cm
        Persegi tanah1 = new Persegi();
        tanah1.LuasTanahPersegi(5);


        // Tanah persegi panjang dengan lebar 5cm dan panjang 10cm
        PersegiPanjang tanah2 = new PersegiPanjang();
        tanah2.LuasTanahPersegiPanjang(10, 5);


        // Tanah segitiga dengan sisi kiri 8cm, sisi kanan 9cm, sisi alas 10cm
        Segitiga tanah3 = new Segitiga();
        tanah3.LuasSegitiga(8,9,10);


        // Tanah lingkaran dengan jari jari 7cm
        Lingkaran tanah4 = new Lingkaran();
        tanah4.LuasLingkaran(7);
    }
}