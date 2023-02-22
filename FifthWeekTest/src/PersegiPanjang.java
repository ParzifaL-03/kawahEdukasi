public class PersegiPanjang {
    int lebar;
    int panjang;

    public PersegiPanjang(int lebar, int panjang) {
        this.lebar = lebar;
        this.panjang = panjang;
    }
    public PersegiPanjang() {
    }

    int LuasTanahPersegiPanjang(int Panjang, int Lebar){
        int hasil;
        hasil = Panjang * Lebar;
        System.out.printf("\nluas tanah persegi panjang tersebut adalah : %d\n", hasil);
        return hasil;
    }
}
