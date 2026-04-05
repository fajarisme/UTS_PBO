package ewallet;

public class PremiumWallet extends EWallet {

    public PremiumWallet(String nama, double saldo) {
        super(nama, saldo);
    }

    @Override
    public boolean bayar(double jumlah) {
        double cashback = jumlah * 0.1;
        if (saldo >= jumlah) {
            saldo -= jumlah;
            saldo += cashback;
            return true;
        }
        return false;
    }
}