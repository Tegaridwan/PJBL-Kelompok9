package PJBL;

public class TransferBank implements Pembayaran {

    private int saldo;

    public TransferBank(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean bayar(int total) {
        if (saldo >= total) {
            saldo -= total;
            System.out.println("Transfer Bank berhasil: " + total);
            System.out.println("Sisa saldo: " + saldo);
            return true;
        } else {
            System.out.println("Saldo tidak cukup!");
            return false;
        }
    }
}