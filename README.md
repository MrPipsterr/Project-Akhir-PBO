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

## com.layout

Menu: Berperan sebagai menu utama aplikasi. Fungsi showMenu() digunakan untuk menampilkan pilihan menu kepada pengguna dan mengarahkannya ke opsi yang dipilih.

ReadData: Digunakan untuk membaca dan menampilkan data barang dari basis data kepada pengguna. Metode getDatabase() digunakan untuk mengambil data dari basis data dan menampilkannya di layar.

InsertData: Berfungsi untuk menambahkan data barang baru ke dalam basis data. Metode insertData() meminta pengguna untuk memasukkan rincian barang baru seperti nama, harga, dan jumlah, kemudian data tersebut akan disimpan dalam basis data.

EditData: Digunakan untuk mengubah jumlah barang yang ada dalam basis data. Metode editData() meminta pengguna untuk memasukkan ID barang yang ingin diubah dan jumlah baru, lalu data akan diperbarui dalam basis data.

DeleteData: Menghapus data barang dari basis data. Metode deleteData() meminta pengguna untuk memasukkan ID barang yang ingin dihapus, kemudian data tersebut akan dihapus dari basis data.
