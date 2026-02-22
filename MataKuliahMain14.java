public class MataKuliahMain14 {

    public static void main(String[] args) {

        MataKuliah14 mk1 = new MataKuliah14();
        mk1.kodeMK    = "TI2301";
        mk1.nama      = "Algoritma dan Struktur Data";
        mk1.sks       = 3;
        mk1.jumlahJam = 4;

        System.out.println("=== Data mk1 (Awal) ===");
        mk1.tampilInformasi();

        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(1);

        System.out.println("=== Data mk1 (Setelah diubah) ===");
        mk1.tampilInformasi();

        System.out.println();

        MataKuliah14 mk2 = new MataKuliah14("TI2302", "Pemrograman Berorientasi Objek", 3, 3);

        System.out.println("=== Data mk2 (Awal) ===");
        mk2.tampilInformasi();

        mk2.ubahSKS(2);
        mk2.tambahJam(3);
        mk2.kurangiJam(10); // uji gagal - jam tidak mencukupi
        mk2.kurangiJam(2);  // uji berhasil

        System.out.println("=== Data mk2 (Setelah diubah) ===");
        mk2.tampilInformasi();
    }
}
