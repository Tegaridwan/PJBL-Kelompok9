package PJBLinterface;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class UlasanService {
    private Printer printer;

    UlasanService(Printer printer) {
        if (printer == null) {
            throw new IllegalArgumentException("Printer tidak boleh null.");
        }
        this.printer = printer;
    }

    boolean kirimUlasan(Ulasan u) {
        try {
            if (u == null) {
                throw new IllegalArgumentException("Ulasan tidak boleh null.");
            }
            if (u.nama == null || u.nama.trim().isEmpty()) {
                throw new IllegalArgumentException("Nama pengirim tidak boleh kosong.");
            }
            if (u.isi == null || u.isi.trim().isEmpty()) {
                throw new IllegalArgumentException("Isi ulasan tidak boleh kosong.");
            }
            if (u.tanggal == null || u.tanggal.trim().isEmpty()) {
                throw new IllegalArgumentException("Tanggal tidak boleh kosong.");
            }
            if (u.isi.trim().length() < 10) {
                throw new IllegalArgumentException(
                    "Isi ulasan terlalu pendek (min 10 karakter). Diterima: \"" + u.isi + "\""
                );
            }

            printer.print(u);
            tulisRecordUlasan(u);
            System.out.println("Ulasan berhasil dikirim!");
            return true;

        } catch (IllegalArgumentException e) {
            System.out.println("[VALIDASI GAGAL] " + e.getMessage());
            return false;

        } catch (NullPointerException e) {
            System.out.println("[ERROR] Data null tidak terduga: " + e.getMessage());
            return false;

        } finally {
            System.out.println("Proses kirimUlasan selesai.");
        }
    }

    private void tulisRecordUlasan(Ulasan u) {
        try (PrintWriter out = new PrintWriter(new FileWriter("recordUlasan.txt", true))) {
            out.println("Nama: " + u.nama);
            out.println("Tanggal: " + u.tanggal);
            out.println("Isi: " + u.isi);
            out.println("---");
        } catch (IOException e) {
            System.out.println("[ERROR] Gagal menyimpan record ulasan: " + e.getMessage());
        }
    }
}