package PJBL;

public class ConsolePrinter implements Printer {
    public void print(Ulasan u) {
        System.out.println("Nama         : " + u.nama);
        System.out.println("Isi Ulasan   : " + u.isi);
        System.out.println("Tanggal      : " + u.tanggal);
    }
}
