 class mahasiswamain14 {
     static void main(String[] args) {

        mahasiswa14 mhs1 = new mahasiswa14();

        mhs1.nama  = "Muhammad Ali Farhan";
        mhs1.nim   = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk   = 3.55;

        System.out.println("=== Informasi Pertama ===");
        mhs1.tampilkanInformasi();

        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        System.out.println("=== Informasi Kedua ===");
        mhs1.tampilkanInformasi();
    }
}
    

