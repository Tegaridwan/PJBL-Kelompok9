package PJBL;

public class Ewallet extends Pembayaran {

    Ewallet(int saldo) {
        super(saldo);
    }

    @Override
    boolean bayar(int total) {
        if (saldo >= total) {
            saldo -= total;
            System.out.println("Melakukan pembayaran sebesar: " + total + " melalui E-wallet");
            System.out.println("Sisa saldo: " + saldo);
            return true;
        } else {
            System.out.println("Saldo E-wallet tidak mencukupi");
            return false;
        }
    }
    
}
