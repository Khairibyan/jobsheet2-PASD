public class MahasiswaMain15 {

    static class Mahasiswa {
        String nama;
        String nim;
        String kelas;
        double ipk;

        void tampilkanInformasi() {
            System.out.println("Nama: " + nama);
            System.out.println("NIM: " + nim);
            System.out.println("Kelas: " + kelas);
            System.out.println("IPK: " + ipk);
            System.out.println();
        }

        void ubahKelas(String kelasBaru) {
            kelas = kelasBaru;
        }

        void updateIpk(double ipkBaru) {
            ipk = ipkBaru;
        }

        Mahasiswa() {
        }

        Mahasiswa(String nama, String nim, double ipk, String kelas) {
            this.nama = nama;
            this.nim = nim;
            this.ipk = ipk;
            this.kelas = kelas;
        }
    }

    public static void main(String[] args) {

        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();

        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);

        mhs1.tampilkanInformasi();

        Mahasiswa mhs2 = new Mahasiswa(
                "Anis Fahrotun Nisa",
                "254107060124",
                3.25,
                "TI 1F"
        );
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa mhsFarhan = new Mahasiswa(
                "Muhammad Ali Farhan",
                "2241720171",
                3.85,
                "SI 2K"
        );
        mhsFarhan.tampilkanInformasi();
    }
}