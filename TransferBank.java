package PJBLinterface;

public class TransferBank implements Pembayaran {
    private int saldo;

    public TransferBank(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean bayar(int total) {
        try {
            if (saldo < 0) {
                System.out.println("  [INFO] Saldo Transfer Bank tidak valid (negatif): Rp" + saldo);
                System.out.println("  [INFO] Pembayaran dibatalkan.");
                return false;
            }
            if (total <= 0) {
                System.out.println("  [INFO] Jumlah transfer tidak valid: Rp" + total);
                System.out.println("  [INFO] Pembayaran dibatalkan.");
                return false;
            }
            if (saldo >= total) {
                saldo -= total;
                System.out.println("  Transfer Bank berhasil: Rp" + total);
                System.out.println("  Sisa saldo: Rp" + saldo);
                return true;
            } else {
                System.out.println("  [GAGAL] Saldo Bank tidak cukup! Saldo: Rp" + saldo + ", Butuh: Rp" + total);
                return false;
            }
        } catch (Exception e) {
            System.out.println("  [ERROR] Terjadi kesalahan pada Transfer Bank: " + e.getMessage());
            return false;
        }
    }
}