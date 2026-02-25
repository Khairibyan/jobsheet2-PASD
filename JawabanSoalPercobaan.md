PERCOBAAN 1

1. Atribut (Properties/Fields)
Atribut merupakan data atau variabel yang dimiliki oleh sebuah class atau object yang digunakan untuk menyimpan keadaan (state). Atribut merepresentasikan informasi yang dimiliki oleh object tersebut.
Method (Behavior)
Method merupakan fungsi atau prosedur yang mendefinisikan perilaku (behavior) dari sebuah class atau object. Method digunakan untuk memproses data atau menjalankan aksi terhadap atribut yang dimiliki.

2. nama (String) menyimpan nama mahasiswa
nim (String) menyimpan nomor induk mahasiswa
kelas (String) menyimpan kelas mahasiswa
ipk (double) menyimpan nilai IPK mahasiswa

3. tampilkanInformasi() menampilkan data mahasiswa ke layar
ubahKelas(String kelasBaru) mengubah nilai atribut kelas
updateIPK(double ipkBaru) memperbarui nilai IPK
nilaiKinerja() mengembalikan kategori kinerja berdasarkan IPK

4. DONE

5. Method nilaiKinerja() mengecek nilai IPK yang tersimpan pada atribut ipk.
Kemudian dilakukan pengecekan bertingkat menggunakan if-else untuk menentukan kategori kinerja.
Kategori ditentukan berdasarkan rentang nilai IPK:
IPK ≥ 3.5 "Kinerja sangat baik"
IPK ≥ 3.0 "Kinerja baik"
IPK ≥ 2.0 "Kinerja cukup"
Selain itu "Kinerja kurang"

