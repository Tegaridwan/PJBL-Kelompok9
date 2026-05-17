package PJBLinterface;

public class Main {
    public static void main(String[] args) {

        System.out.println();
        garis('-', 50);
        tengah("[ SECTION 1 ] SISTEM PEMBAYARAN", 50);
        garis('-', 50);

        int totalPembayaran = 10000;
        System.out.println("  Total Tagihan  : Rp" + totalPembayaran);
        System.out.println();

        System.out.println("  >> Metode: E-Wallet (Saldo: Rp500)");
        Pembayaran ewallet = new Ewallet(500);
        boolean statusEwallet = ewallet.bayar(totalPembayaran);

        System.out.println();
        System.out.println("  >> Metode: Transfer Bank (Saldo: Rp-1000)");
        Pembayaran transfer = new TransferBank(-1000);
        boolean statusTransfer = transfer.bayar(totalPembayaran);

        System.out.println();
        garis('.', 50);
        System.out.println("  REKAP PEMBAYARAN:");
        System.out.println("  E-Wallet           : " + badge(statusEwallet));
        System.out.println("  Transfer Bank      : " + badge(statusTransfer));
        garis('.', 50);

        System.out.println();
        garis('-', 50);
        tengah("[ SECTION 2 ] DATA PEMBELI", 50);
        garis('-', 50);

        Pembeli pembeli   = new Pembeli("Budi");
        Reseller reseller = new Reseller("Siti", 150000);

        System.out.println("  >> Pembeli Biasa:");
        System.out.print("  "); pembeli.tampil();
        System.out.println();
        System.out.println("  >> Reseller:");
        System.out.print("  "); reseller.tampil();

        System.out.println();
        garis('-', 50);
        tengah("[ SECTION 3 ] DATA PENJUAL", 50);
        garis('-', 50);

        Penjual tokoBaju   = new Penjual("Toko Baju");
        Penjual tokoGrosir = new Grosir("Toko Grosir Baju");

        System.out.println("  >> Penjual Biasa:");
        System.out.print("  "); tokoBaju.tampil();
        System.out.println();
        System.out.println("  >> Grosir:");
        System.out.print("  "); tokoGrosir.tampil();

        System.out.println();
        garis('-', 50);
        tengah("[ SECTION 4 ] TRANSAKSI ULASAN", 50);
        garis('-', 50);

        Ulasan ulasan1 = new Ulasan(pembeli.nama,  "Pelayanan sangat bagus!", "2024-06-01");
        Ulasan ulasan2 = new Ulasan(reseller.nama, null, "2024-06-02"); // <-- BUG: isi null

        Printer printer       = new ConsolePrinter();
        UlasanService service = new UlasanService(printer);

        System.out.println();
        System.out.println("  ---- Ulasan #1 ----");
        tokoBaju.terimaUlasan(ulasan1.isi);
        service.kirimUlasan(ulasan1);

        System.out.println();
        System.out.println("  ---- Ulasan #2 ----");
        tokoGrosir.terimaUlasan(ulasan2.isi); // <-- CRASH: ulasan2.isi = null
        service.kirimUlasan(ulasan2);

        System.out.println();
        garis('=', 50);
        tengah("Selesai", 50);
        garis('=', 50);
    }

    static void garis(char c, int n) {
        StringBuilder sb = new StringBuilder("  ");
        for (int i = 0; i < n; i++) sb.append(c);
        System.out.println(sb);
    }

    static void tengah(String teks, int lebar) {
        int spasi = (lebar - teks.length()) / 2;
        StringBuilder sb = new StringBuilder("  ");
        for (int i = 0; i < spasi; i++) sb.append(' ');
        sb.append(teks);
        System.out.println(sb);
    }

    static String badge(boolean status) {
        return status ? "[BERHASIL]" : "[GAGAL]   ";
    }
}