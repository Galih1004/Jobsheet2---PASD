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
