public class DosenMain14 {

    public static void main(String[] args) {

        Dosen14 dosen1 = new Dosen14();
        dosen1.idDosen        = "D001";
        dosen1.nama           = "Dr. Ahmad Fauzi";
        dosen1.statusAktif    = true;
        dosen1.tahunBergabung = 2005;
        dosen1.bidangKeahlian = "Kecerdasan Buatan";

        System.out.println("=== Data dosen1 (Awal) ===");
        dosen1.tampilInformasi();
        System.out.println("Masa Kerja : " + dosen1.hitungMasaKerja(2026) + " tahun");

        dosen1.setStatusAktif(false);
        dosen1.ubahKeahlian("Algoritma dan Struktur Data");

        System.out.println("=== Data dosen1 (Setelah diubah) ===");
        dosen1.tampilInformasi();

        System.out.println();

        Dosen14 dosen2 = new Dosen14("D002", "Siti Rahayu, M.Kom", false, 2015, "Basis Data");
        System.out.println("=== Data dosen2 (Awal) ===");
        dosen2.tampilInformasi();
        System.out.println("Masa Kerja : " + dosen2.hitungMasaKerja(2026) + " tahun");

        dosen2.setStatusAktif(true);
        dosen2.ubahKeahlian("Basis Data dan Sistem Informasi");

        System.out.println("=== Data dosen2 (Setelah diubah) ===");
        dosen2.tampilInformasi();
    }
}
