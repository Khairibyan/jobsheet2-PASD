public class DosenMain15 {
    public static void main(String[] args) {

        Dosen15 dosen1 = new Dosen15();
        dosen1.idDosen = "D001";
        dosen1.nama = "Budi Santoso";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2010;
        dosen1.bidangKeahlian = "Kecerdasan Buatan";

        System.out.println("===== Informasi Dosen 1 =====");
        dosen1.tampilInformasi();

        dosen1.setStatusAktif(false);
        dosen1.hitungMasaKerja(2026);
        dosen1.ubahKeahlian("Machine Learning");

        System.out.println("\nInformasi setelah diperbarui:");
        dosen1.tampilInformasi();

        Dosen15 dosen2 = new Dosen15("D002", "Siti Rahayu", true, 2015, "Jaringan Komputer");

        System.out.println("\n===== Informasi Dosen 2 =====");
        dosen2.tampilInformasi();

        dosen2.setStatusAktif(true);
        dosen2.hitungMasaKerja(2026);
        dosen2.ubahKeahlian("Keamanan Siber");

        System.out.println("\nInformasi setelah diperbarui:");
        dosen2.tampilInformasi();
    }
}