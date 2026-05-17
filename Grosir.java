package PJBLinterface;

public class Grosir extends Penjual {

    Grosir(String namaToko) {
        super(namaToko);
    }

    @Override
    void terimaUlasan(String isi) {
        System.out.println(namaToko + " (Grosir) menerima: " + isi);
    }

    @Override
    void tampil() {
        System.out.println("Grosir: " + namaToko);
    }
}
