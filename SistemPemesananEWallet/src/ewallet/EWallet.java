package ewallet;

public class EWallet {
    protected String nama;
    protected double saldo;

    public EWallet(String nama, double saldo) {
        this.nama = nama;
        this.saldo = saldo;
    }

    public void topUp(double jumlah) {
        saldo += jumlah;
    }

    public boolean bayar(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            return true;
        }
        return false;
    }

    public void tampil() {
        System.out.println("Nama: " + nama);
        System.out.println("Saldo: " + saldo);
    }
}