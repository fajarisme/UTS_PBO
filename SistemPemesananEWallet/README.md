# 💳 Sistem E-Wallet Sederhana (Java)

## 🚀 Tentang Program

Program ini merupakan aplikasi sederhana berbasis Java yang mensimulasikan penggunaan **E-Wallet**. Dalam program ini, pengguna dapat membuat akun, melakukan top up saldo, melakukan pembayaran, serta melihat data akun yang telah dibuat.

Program dibuat menggunakan konsep **Pemrograman Berbasis Objek (OOP)** agar lebih terstruktur dan mudah dikembangkan.

---

## ⚙️ Fitur Utama

✔️ Membuat akun e-wallet
✔️ Top up saldo
✔️ Melakukan pembayaran
✔️ Sistem cashback untuk akun premium
✔️ Menampilkan data akun
✔️ Error handling (anti input sembarangan)

---

## 🧠 Konsep yang Digunakan

Program ini menerapkan beberapa konsep penting, yaitu:

* **Inheritance** → `PremiumWallet` turunan dari `EWallet`
* **Encapsulation** → penggunaan getter & setter pada class `Akun`
* **Polymorphism** → method `bayar()` berbeda pada akun biasa & premium
* **Percabangan** → menentukan menu dan proses transaksi
* **Perulangan** → menampilkan data akun

---

## 🔄 Cara Kerja Program

1. User membuat akun (biasa atau premium)
2. User melakukan top up saldo
3. User bisa melakukan pembayaran
4. Saldo akan berkurang saat transaksi
5. Khusus akun premium mendapat cashback
6. Semua data bisa ditampilkan kembali

---

## 📸 Tampilan Program

Tambahkan screenshot kamu di folder `images/`

```md
![Menu](images/menu.png)
![Transaksi](images/transaksi.png)
```

---

## 💡 Keunggulan Program

* Mudah digunakan (berbasis menu)
* Struktur kode rapi (OOP)
* Bisa menyimpan banyak data
* Ada fitur tambahan (cashback premium)

---

## ⚠️ Catatan

Pastikan semua file berada dalam package `ewallet` agar program dapat berjalan dengan baik.

---

## 👨‍💻 Pembuat

Nama  : Muhammad Fajar Dafita
NIM   : 2409106030
Kelas : A'24

---

## 🎯 Kesimpulan

Program ini berhasil dibuat dengan menerapkan konsep OOP dan dapat digunakan untuk simulasi sederhana penggunaan e-wallet. Program masih dapat dikembangkan lebih lanjut agar menjadi lebih kompleks dan menarik.

---