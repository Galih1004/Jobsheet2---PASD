public class MataKuliah14 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah14() {
    }
    public MataKuliah14(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK     = kodeMK;
        this.nama       = nama;
        this.sks        = sks;
        this.jumlahJam  = jumlahJam;
    }

    void tampilInformasi() {
        System.out.println("Kode MK    : " + kodeMK);
        System.out.println("Nama       : " + nama);
        System.out.println("SKS        : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS berhasil diubah menjadi: " + sks);
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jam bertambah. Total jam sekarang: " + jumlahJam);
    }

    void kurangiJam(int jam) {
        if (jumlahJam < jam) {
            System.out.println("Pengurangan tidak dapat dilakukan. Jumlah jam tidak mencukupi.");
        } else {
            jumlahJam -= jam;
            System.out.println("Jam berkurang. Total jam sekarang: " + jumlahJam);
        }
    }
}
