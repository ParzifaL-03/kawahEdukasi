public class Persegi {
    int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }
    public Persegi() {
    }

    int LuasTanahPersegi (int sisi){
        int hasil;
        hasil = sisi * sisi;
        System.out.printf("\nluas tanah persegi tersebut adalah : %d\n", hasil);
        return hasil;
    }

}
