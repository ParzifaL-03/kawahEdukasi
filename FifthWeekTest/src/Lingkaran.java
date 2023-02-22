public class Lingkaran {
    double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public Lingkaran() {
    }

    double LuasLingkaran(double jariJari){
        double hasil;
        hasil = 3.14f * (jariJari * jariJari);
        System.out.printf("\nluas tanah lingkaran tersebut adalah : %f\n", hasil);
        return  hasil;
    }
}
