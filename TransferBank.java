package PJBL;

public class TransferBank extends Pembayaran {
    TransferBank(int saldo) {
        super(saldo);
    }

    @Override
    boolean bayar(int total) {
        if (saldo >= total) {
            saldo -= total;
            System.out.println("Melakukan pembayaran sebesar: " + total + " melalui Transfer Bank");
            System.out.println("Sisa saldo: " + saldo);
            return true;
        } else {
            System.out.println("Saldo Transfer Bank tidak mencukupi");
            return false;
        }
    }

}