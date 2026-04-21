package PJBL;

abstract class Pembayaran {
    int saldo;

    Pembayaran(int saldo) {
        this.saldo = saldo;
    }

    abstract boolean bayar(int total);
}