package PJBLinterface;

public class Ewallet implements Pembayaran {
    private int saldo;

    public Ewallet(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean bayar(int jumlah) {
        try {
            if (saldo < 0) {
                System.out.println("  [INFO] Saldo E-Wallet tidak valid (negatif): Rp" + saldo);
                System.out.println("  [INFO] Pembayaran dibatalkan.");
                return false;
            }
            if (jumlah <= 0) {
                System.out.println("  [INFO] Jumlah bayar tidak valid: Rp" + jumlah);
                System.out.println("  [INFO] Pembayaran dibatalkan.");
                return false;
            }
            if (saldo >= jumlah) {
                saldo -= jumlah;
                System.out.println("  E-Wallet berhasil bayar: Rp" + jumlah);
                System.out.println("  Sisa saldo: Rp" + saldo);
                return true;
            } else {
                System.out.println("  [GAGAL] Saldo E-Wallet tidak cukup! Saldo: Rp" + saldo + ", Butuh: Rp" + jumlah);
                return false;
            }
        } catch (Exception e) {
            System.out.println("  [ERROR] Terjadi kesalahan pada E-Wallet: " + e.getMessage());
            return false;
        }
    }
}