package PJBL;

public class Penjual {
    String namaToko;

    Penjual(String namaToko) {
        this.namaToko = namaToko;
    }

    void terimaUlasan(String isi) {
        System.out.println(namaToko + " menerima: " + isi);
    }
}