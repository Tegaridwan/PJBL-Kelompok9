package PJBL;

public class Pembeli {
    String nama;

    Pembeli(String nama) {
        this.nama = nama;
    }

    void tampil() {
        System.out.println("Pembeli: " + nama);
    }
}