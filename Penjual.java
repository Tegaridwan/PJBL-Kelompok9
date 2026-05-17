    package PJBLinterface;

    public class Penjual {
        String namaToko;

        Penjual(String namaToko) {
            this.namaToko = namaToko;
        }

        void terimaUlasan(String isi) {
            System.out.println(namaToko + " menerima: " + isi);
        }

        void tampil() {
            System.out.println("Penjual: " + namaToko);
        }
    }