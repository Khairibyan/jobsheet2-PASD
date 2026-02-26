public class MataKuliahMain15 {
     public static void main(String[] args) {

        MataKuliah15 mk1 = new MataKuliah15();
        mk1.kodeMK = "TI101";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 4;

        System.out.println("===== Informasi Mata Kuliah 1 =====");
        mk1.tampilInformasi();

        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(1);
        mk1.kurangiJam(10);

        System.out.println("\nInformasi setelah diperbarui:");
        mk1.tampilInformasi();

        MataKuliah15 mk2 = new MataKuliah15("TI202", "Pemrograman Berorientasi Objek", 3, 3);

        System.out.println("\n===== Informasi Mata Kuliah 2 =====");
        mk2.tampilInformasi();

        mk2.ubahSKS(2);
        mk2.tambahJam(1);
        mk2.kurangiJam(2);

        System.out.println("\nInformasi setelah diperbarui:");
        mk2.tampilInformasi();
    }
}

