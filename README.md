# App.java

dalam `App.java` terdapat

```java
   Menu.showMenu();
```

yang berfungsi untuk menampilkan menu utama

# com

terdapat beberapa package yaitu: config dan controller

- Folder `com.config` berisi kelas `DbConnect` yang mengatur koneksi ke database.
- Folder `com.controller` berisi kelas `DBController` yang berfungsi sebagai pengontrol data barang di database.
- Folder `com.layout` berisi berbagai kelas yang mengatur tampilan dan interaksi dengan pengguna.
- Folder `com.models` berisi kelas `Produk` yang mewakili model data barang.

## com.config
bertujuan untuk mengatur koneksi ke database MySQL menggunakan JDBC (Java Database Connectivity).

   1. Method `connection()` dalam kelas `DbConnect` merupakan sebuah metode yang bertanggung jawab untuk membuat koneksi ke database. Fungsi utamanya adalah untuk menginisialisasi objek connect dari kelas `Connection` menggunakan `DriverManager`

   2. Method `connection()` ini memungkinkan kelas lain untuk menggunakan koneksi yang telah terbentuk ke database dengan cara memanggil `DbConnect.connection().`

## com.controllers
berfungsi sebagai pengendali operasi database terkait tabel tb_barang

   1. Method `getDatabase()`: Metode ini mendapatkan data dari tabel `tb_barang` dalam database. Metode ini memanggil metode `connection()` dari kelas `DbConnect` untuk membuat koneksi ke database.

   2. Method `insertData()`: Metode ini digunakan untuk menyisipkan data baru ke dalam tabel `tb_barang`.

   3. Method `editData()`: Metode ini digunakan untuk mengedit data dalam tabel `tb_barang` berdasarkan ID.

   4. Method `deleteData()`: Metode ini digunakan untuk menghapus data dalam tabel `tb_barang` berdasarkan ID.

## com.layout

Menu: Berperan sebagai menu utama aplikasi. Fungsi `showMenu()` digunakan untuk menampilkan pilihan menu kepada pengguna dan mengarahkannya ke opsi yang dipilih.

ReadData: Digunakan untuk membaca dan menampilkan data barang dari basis data kepada pengguna. Method `getDatabase()` digunakan untuk mengambil data dari basis data dan menampilkannya di layar.

InsertData: Berfungsi untuk menambahkan data barang baru ke dalam basis data. Method `insertData()` meminta pengguna untuk memasukkan rincian barang baru seperti nama, harga, dan jumlah, kemudian data tersebut akan disimpan dalam basis data.

EditData: Digunakan untuk mengubah jumlah barang yang ada dalam basis data. Method `editData()` meminta pengguna untuk memasukkan ID barang yang ingin diubah dan jumlah baru, lalu data akan diperbarui dalam basis data.

DeleteData: Menghapus data barang dari basis data. Method `deleteData()` meminta pengguna untuk memasukkan ID barang yang ingin dihapus, kemudian data tersebut akan dihapus dari basis data.

## com.models
Metode dalam kelas `Produk` bertujuan untuk mendefinisikan dan mengatur atribut-atribut produk serta menyediakan akses ke nilai-nilai atribut tersebut.

1. `getId()`: Metode ini digunakan untuk mengembalikan nilai atribut `id` dari objek `Produk`.

2. `getNama()`: Metode ini digunakan untuk mengembalikan nilai atribut `nama` dari objek `Produk`.

3. `getHarga()`: Metode ini digunakan untuk mengembalikan nilai atribut `harga` dari objek `Produk`.

4. `getJumlah()`: Metode ini digunakan untuk mengembalikan nilai atribut `jumlah` dari objek `Produk`.

5. `toString()`: Metode ini digunakan untuk mengembalikan representasi string dari objek `Produk`. Metode ini akan menghasilkan string yang berisi nilai-nilai dari semua atribut `id`, `nama`, `harga`, dan `jumlah` dalam format yang ditentukan.

# Menjalankan Aplikasi
```
untuk menjalankan, pastikan telah menjalankan server di MySQL
1.  Compile dan Run class `App.java`
2.  Dalam menu terdapat 4 opsi, yaitu membaca barang, menambahkan barang, mengubah data barang dan menghapus data
3.  Opsi 0 untuk keluar dari aplikasi.
```