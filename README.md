Menjawab Percobaan 1
1. Sebutkan dua karakteristik class atau object! 
- Atribut (state): merupakan data atau informasi yang dimiliki oleh
  sebuah object. Pada class Mahasiswa, atributnya adalah nama, nim,
  kelas, dan ipk.
 
- Method (behavior): merupakan aksi atau perilaku yang dapat dilakukan
  oleh sebuah object. Pada class Mahasiswa, methodnya adalah
  tampilkanInformasi(), ubahKelas(), updateIpk(), dan nilaiKinerja().

2. Ada berapa atribut yang dimiliki oleh class Mahasiswa? Sebutkan!
    Class Mahasiswa memiliki 4 atribut, yaitu:
     - nama  (String)
     - nim   (String)
     - kelas (String)
     - ipk   (double)

3. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan!
    Class Mahasiswa memiliki 4 method, yaitu:
     - tampilkanInformasi() : menampilkan seluruh informasi mahasiswa
     - ubahKelas()          : mengubah nilai atribut kelas
     - updateIpk()          : mengubah nilai atribut ipk
     - nilaiKinerja()       : mengembalikan String hasil evaluasi IPK

4. Modifikasi method updateIpk() dengan validasi rentang 0.0 - 4.0
    sudah (ada di dalam kode program).

5. Jelaskan cara kerja method nilaiKinerja()!
     Method nilaiKinerja() bekerja dengan cara mengevaluasi nilai atribut
     ipk menggunakan percabangan if-else if-else, Method ini mengembalikan (return) nilai bertipe String berupa keterangan kinerja mahasiswa berdasarkan IPK yang dimiliki.

Menjawab Percobaan 2
1. Tunjukkan baris kode untuk proses instansiasi! Apa nama objectnya?
     Baris instansiasi:
     Mahasiswa mhs1 = new Mahasiswa();
     "mhs 1" menunjukan object.

2. Bagaimana cara mengakses atribut dan method dari suatu objek?  
     Menggunakan tanda titik (.) setelah nama object, yaitu:
     - Mengakses atribut : namaObject.namaAtribut
       Contoh            : mhs1.nama = "Muhammad Ali Farhan";
     - Mengakses method  : namaObject.namaMethod()
       Contoh            : mhs1.tampilkanInformasi();

3. Mengapa hasil output pemanggilan method tampilkanInformasi() pertama dan kedua berbeda?
     Karena di antara pemanggilan pertama dan kedua, terdapat dua
     perubahan pada atribut object mhs1, yaitu:
     - mhs1.ubahKelas("SI 2K")  -> mengubah kelas dari "SI 2J" ke "SI 2K"
     - mhs1.updateIpk(3.60)     -> mengubah ipk dari 3.55 ke 3.60

Menjawab Percobaan 3
1. Tunjukkan baris kode konstruktor berparameter pada class Mahasiswa!
     public Mahasiswa(String nm, String nim, double ipk, String kls) {
         nama     = nm;
         this.nim = nim;
         this.ipk = ipk;
         kelas    = kls;
     }
 
     Konstruktor berparameter ditandai dengan adanya parameter di dalam
     tanda kurung setelah nama class.
 
 2. Apa yang dilakukan pada baris berikut?
    Mahasiswa mhs2 = new Mahasiswa("Annisa Nabila","2141720160", 3.25,"TI 2L");
 
     Baris tersebut melakukan instansiasi object baru bernama mhs2 dari
     class Mahasiswa menggunakan konstruktor berparameter. Artinya, saat
     object mhs2 dibuat, atribut nama, nim, ipk, dan kelas langsung diisi
     dengan nilai yang diberikan sebagai argumen, tanpa perlu mengisi
     atribut satu per satu seperti pada konstruktor default.

 3. Hapus konstruktor default, bagaimana hasilnya? Jelaskan!
 
     Hasilnya adalah program akan ERROR saat compile pada baris:
       Mahasiswa mhs1 = new Mahasiswa();
 
     Karena baris tersebut memanggil konstruktor default (tanpa parameter).
     Ketika konstruktor default dihapus dan hanya tersisa konstruktor
     berparameter, Java tidak lagi menyediakan konstruktor default secara
     otomatis. Sehingga pemanggilan new Mahasiswa() tidak valid dan
     menyebabkan compile error.
 
     Catatan: Java hanya menyediakan konstruktor default otomatis apabila
     di dalam class TIDAK ada konstruktor sama sekali.


4. Apakah method di dalam class Mahasiswa harus diakses secara berurutan?
 
     Tidak harus. Method di dalam class Mahasiswa dapat diakses dalam
     urutan apapun sesuai kebutuhan program.

 5. Buat object baru dengan nama mhs<NamaMahasiswa>!
     Sudah mhs3
