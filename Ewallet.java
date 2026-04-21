package PJBL;

public class Ewallet implements Pembayaran {

    private int saldo;

    public Ewallet(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean bayar(int jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("E-Wallet berhasil bayar: " + jumlah);
            System.out.println("Sisa saldo: " + saldo);
            return true;
        } else {
            System.out.println("Saldo tidak cukup!");
            return false;
        }
    }
}