package ewallet;

public class Akun {
    private String nama;
    private double saldo;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        if (nama == null || nama.isEmpty()) {
            throw new IllegalArgumentException("Nama tidak boleh kosong!");
        }
        this.nama = nama;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("Saldo tidak boleh negatif!");
        }
        this.saldo = saldo;
    }
}