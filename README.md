# Program Penampil Jadwal Kuliah

Ini adalah proyek pembelajaran yang saya kerjakan sebagai bagian dari mata kuliah **Pemrograman Berbasis Objek (PBO)**. Proyek ini dibuat untuk mempraktikkan konsep-konsep dasar PBO seperti **inheritance**, **abstract class**, dan **polymorphism** dalam bahasa pemrograman Java.

## Deskripsi Proyek

Aplikasi konsol sederhana ini berfungsi untuk menampilkan jadwal perkuliahan berdasarkan hari yang dipilih oleh pengguna. Data jadwal perkuliahan disimpan dan dikelola di dalam kelas `DB.java`.

## Fitur Utama

* Menampilkan menu hari (Senin - Jumat) untuk dipilih.
* Menampilkan jadwal perkuliahan lengkap (jam, kode, nama mata kuliah, SKS, dan dosen) untuk hari yang dipilih.
* Menangani input pilihan pengguna untuk menampilkan jadwal atau keluar dari program.

## Struktur Kelas

Proyek ini dirancang dengan konsep PBO, berikut adalah gambaran singkat setiap kelas:

* `Main.java`: Titik masuk utama (entry point) dari aplikasi.
* `App.java`: Kelas utama yang mengendalikan alur program dan interaksi dengan pengguna, termasuk menampilkan menu dan memproses input.
* `DB.java`: Berfungsi sebagai "database" lokal yang menyimpan data jadwal perkuliahan dalam objek-objek.
* `Entity.java`: Kelas abstrak yang berfungsi sebagai superclass untuk entitas-entitas seperti `Matkul` dan `Dosen`.
* `Matkul.java`: Merepresentasikan objek Mata Kuliah, mewarisi dari `Entity`.
* `Dosen.java`: Merepresentasikan objek Dosen, mewarisi dari `Entity`.
* `Jadwal.java`: Kelas abstrak yang menjadi superclass untuk semua jenis jadwal.
* `Perkuliahan.java`: Merepresentasikan jadwal perkuliahan, mewarisi dari `Jadwal`.
* `Util.java`: Kelas utilitas yang berisi metode-metode seperti `clearScreen` dan `sleep` untuk meningkatkan pengalaman pengguna.
* `Hari.java`: Merepresentasikan objek Hari.

## Cara Menjalankan

1.  Pastikan Anda telah menginstal Java Development Kit (JDK) di komputer Anda.
2.  Buka terminal atau command prompt.
3.  Pindah ke direktori tempat file-file Java ini disimpan.
4.  Kompilasi semua file `.java` dengan perintah:
    ```sh
    javac *.java
    ```
5.  Jalankan aplikasi dengan perintah:
    ```sh
    java Main
    ```

## Lisensi

Proyek ini dilisensikan di bawah Lisensi MIT.