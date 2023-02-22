public class Segitiga {
    double sisiKiri;
    double sisiKanan;
    double sisiAlas;

    public Segitiga(double sisiKiri, double sisiKanan, double sisiAlas) {
        this.sisiKiri = sisiKiri;
        this.sisiKanan = sisiKanan;
        this.sisiAlas = sisiAlas;
    }

    public Segitiga() {
    }

    double LuasSegitiga (double sisiKiri, double sisiKanan, double sisiAlas){
        double luas = (sisiKiri + sisiKanan + sisiAlas) / 2;
        double hasil = Math.sqrt(luas * (luas - sisiKiri) * (luas - sisiKanan) * (luas - sisiAlas));
        System.out.printf("\nluas tanah segitiga tersebut adalah : %f\n", hasil);
        return hasil;
    }
}
