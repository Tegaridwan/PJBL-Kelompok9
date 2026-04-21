package PJBL;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== SISTEM PEMBAYARAN ===");

        int totalPembayaran = 10000;

        System.out.println("\n=== PEMBAYARAN ===");

        Pembayaran ewallet = new Ewallet(500);
        boolean statusEwallet = ewallet.bayar(totalPembayaran);

        Pembayaran transfer = new TransferBank(100000);
        boolean statusTransfer = transfer.bayar(totalPembayaran);

        System.out.println("E-Wallet status  : " + (statusEwallet ? "BERHASIL" : "GAGAL"));
        System.out.println("Transfer status  : " + (statusTransfer ? "BERHASIL" : "GAGAL"));

        System.out.println("\n------------------------------");

        System.out.println("=== DATA PEMBELI ===");

        Pembeli pembeli = new Pembeli("Budi");
        Reseller reseller = new Reseller("Siti", 150000);

        pembeli.tampil();
        reseller.tampil();

        System.out.println("\n=== DATA PENJUAL ===");

        Penjual tokoBaju = new Penjual("Toko Baju");
        Penjual tokoGrosir = new Grosir("Toko Grosir");

        System.out.println("\n=== TRANSAKSI ULASAN ===");

        Ulasan ulasan1 = new Ulasan(pembeli.nama, "Pelayanan sangat bagus!", "2024-06-01");
        Ulasan ulasan2 = new Ulasan(reseller.nama, "Ok", "2024-06-02");

        Printer printer = new ConsolePrinter();
        UlasanService service = new UlasanService(printer);

        System.out.println("\n=== ULASAN 1 ===");
        tokoBaju.terimaUlasan(ulasan1.isi);
        service.kirimUlasan(ulasan1);

        System.out.println("\n=== ULASAN 2 ===");
        tokoGrosir.terimaUlasan(ulasan2.isi);
        service.kirimUlasan(ulasan2);
    }
}