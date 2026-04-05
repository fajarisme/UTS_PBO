package ewallet;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<EWallet> data = new ArrayList<>();

        while (true) {
            try {
                System.out.println("\n=== SISTEM E-WALLET ===");
                System.out.println("1. Buat Akun");
                System.out.println("2. Top Up");
                System.out.println("3. Bayar");
                System.out.println("4. Lihat Data");
                System.out.println("5. Keluar");
                System.out.print("Pilih: ");

                int pilih = input.nextInt();
                input.nextLine();

                switch (pilih) {
                    case 1:
                        System.out.print("Nama: ");
                        String nama = input.nextLine();

                        System.out.print("Jenis (Biasa/Premium): ");
                        String jenis = input.nextLine();

                        EWallet akun;

                        if (jenis.equalsIgnoreCase("premium")) {
                            akun = new PremiumWallet(nama, 0);
                        } else {
                            akun = new EWallet(nama, 0);
                        }

                        data.add(akun);
                        System.out.println("Akun berhasil dibuat!");
                        break;

                    case 2:
                        System.out.print("Pilih nomor akun: ");
                        int i = input.nextInt();

                        System.out.print("Jumlah top up: ");
                        double top = input.nextDouble();

                        data.get(i).topUp(top);
                        System.out.println("Top up berhasil!");
                        break;

                    case 3:
                        System.out.print("Pilih nomor akun: ");
                        int j = input.nextInt();

                        System.out.print("Jumlah bayar: ");
                        double bayar = input.nextDouble();

                        if (data.get(j).bayar(bayar)) {
                            System.out.println("Pembayaran berhasil!");
                        } else {
                            System.out.println("Saldo tidak cukup!");
                        }
                        break;

                    case 4:
                        int no = 0;
                        for (EWallet e : data) {
                            System.out.println("\nAkun ke-" + no++);
                            e.tampil();
                        }
                        break;

                    case 5:
                        System.out.println("Terima kasih!");
                        return;

                    default:
                        System.out.println("Menu tidak ada!");
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                input.nextLine();
            }
        }
    }
}