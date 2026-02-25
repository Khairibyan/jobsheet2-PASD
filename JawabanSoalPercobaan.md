- PERCOBAAN 1 -

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

- PERCOBAAN 2 -

1. Mahasiswa mhs1 = new Mahasiswa();
Baris tersebut membuat sebuah object baru dari class Mahasiswa yang berada di dalam MahasiswaMain15. Nama object yang dihasilkan dari proses instansiasi tersebut adalah mhs1.

2. digunakan format: namaObject.namaAtribut, contohnya mhs1.nama, mhs1.nim, mhs1.kelas, dan mhs1.ipk.
Untuk mengakses method, digunakan format: namaObject.namaMethod(), contohnya mhs1.tampilkanInformasi(), mhs1.ubahKelas("SI 2K"), dan mhs1.updateIpk(3.60).
Dengan cara ini, program dapat membaca, mengubah data, serta menjalankan fungsi yang dimiliki oleh object tersebut.

3. Hasil output berbeda karena sebelum pemanggilan method tampilkanInformasi() yang kedua, telah dilakukan perubahan terhadap data pada object mhs1.
Perubahan tersebut terjadi melalui pemanggilan method ubahKelas() yang mengubah nilai kelas dan method updateIpk() yang mengubah nilai IPK.

- PERCOBAAN 3 -

1. Mahasiswa(String nama, String nim, double ipk, String kelas) 
Konstruktor tersebut memiliki empat parameter, yaitu nama, nim, ipk, dan kelas, yang digunakan untuk langsung mengisi nilai atribut saat object dibuat.Mahasiswa(String nama, String nim, double ipk, String kelas) 
Konstruktor tersebut memiliki empat parameter, yaitu nama, nim, ipk, dan kelas, yang digunakan untuk langsung mengisi nilai atribut saat object dibuat.

2. melakukan proses instansiasi object baru bernama mhs2 menggunakan konstruktor berparameter.
Saat baris tersebut dijalankan, object langsung dibuat sekaligus mengisi atribut nama, nim, ipk, dan kelas sesuai dengan nilai yang diberikan pada parameter.
Artinya, tidak perlu lagi mengisi atribut satu per satu seperti pada mhs1 karena nilainya sudah diatur melalui konstruktor.

3. Jika konstruktor default berikut dihapus:
Mahasiswa() { }
Maka program akan mengalami error saat compile pada baris:
Mahasiswa mhs1 = new Mahasiswa();

Error tersebut terjadi karena saat konstruktor berparameter sudah dibuat, Java tidak lagi menyediakan konstruktor default secara otomatis.
Akibatnya, ketika program mencoba membuat object tanpa parameter, compiler tidak menemukan konstruktor yang sesuai, sehingga terjadi kesalahan.

4. Method dalam class Mahasiswa tidak harus diakses secara berurutan.
Method dapat dipanggil sesuai kebutuhan program. Urutan pemanggilan method hanya mempengaruhi hasil output jika method tersebut mengubah nilai atribut.

Selama object sudah berhasil dibuat, setiap method dapat dipanggil kapan saja sesuai logika program.

5. DONE