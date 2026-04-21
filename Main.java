package PJBL;

import LatihanPBO.Penjual;

public public class Main {
    public static void main(String[] args) {

        Pembeli p1 = new Pembeli("Budi");
        Pembeli p2 = new Reseller("Siti", 150000);

        Penjual penjual1 = new Penjual("Toko Biasa");
        Penjual penjual2 = new Grosir("Toko Grosir");

        Ulasan u1 = new Ulasan(p1.nama, "Pelayanan sangat bagus!", "2024-06-01");
        Ulasan u2 = new Ulasan(p2.nama, "Ok", "2024-06-02");

        Printer printer = new ConsolePrinter();
        UlasanService service = new UlasanService(printer);

        System.out.println("=== PEMBELI ===");
        p1.tampil();
        p2.tampil();

        System.out.println("\n=== TRANSAKSI 1 ===");
        penjual1.terimaUlasan(u1.isi);
        service.kirimUlasan(u1);

        System.out.println("\n=== TRANSAKSI 2 ===");
        penjual2.terimaUlasan(u2.isi);
        service.kirimUlasan(u2);
    }
}
