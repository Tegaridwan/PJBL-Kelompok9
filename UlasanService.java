package PJBL;

public class UlasanService {
    private Printer printer;

    UlasanService(Printer printer) {
        this.printer = printer;
    }

    boolean kirimUlasan(Ulasan u) {
        if (u.isi.length() < 10) {
            System.out.println("Gagal mengirim ulasan (terlalu pendek)");
            return false;
        }

        printer.print(u);
        System.out.println("Ulasan berhasil dikirim!");
        return true;
    }
}