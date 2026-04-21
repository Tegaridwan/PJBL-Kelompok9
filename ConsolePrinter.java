package PJBL;

public class ConsolePrinter implements Printer {
    public void print(Ulasan u) {
        System.out.println("=== ULASAN ===");
        System.out.println("Nama   : " + u.nama);
        System.out.println("Isi    : " + u.isi);
    }
} {
    
}
