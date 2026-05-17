package PJBL;

public class Reseller extends Pembeli {
    int hargaJual;

    Reseller(String nama, int hargaJual) {
        super(nama);
        this.hargaJual = hargaJual;
    }

    @Override
    void tampil() {
        System.out.println("Reseller: " + nama);
        System.out.println("Harga jual: " + hargaJual);
    }
}
