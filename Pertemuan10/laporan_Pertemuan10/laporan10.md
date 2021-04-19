# Laporan Jawaban Jobsheet 8 
## Pertanyaan 8.2.3
1.	Atribut front dan rear diinisialisasi dengan nilai – 1 dan bukan 0, karena tidak menunjuk ke data manapun.
2.	Maksud dari potongan kode program tersebut adalah kondisi untuk mengecek apakah posisi REAR berada pada indeks terakhir array. Jika benar, maka posisi REAR selanjutnya adalah di indeks 0.
3.	 kode program yang menunjukkan bahwa 
data baru disimpan pada posisi terakhir di dalam queue
* <img src="./ss/823.3.png">
4.	 baris kode program yang menunjukkan bahwa 
data yang dikeluarkan adalah data pada posisi paling depan di dalam queue
* <img src="./ss/823.4.png">
5.	Kegunaan potongan kode program tersebut adalah untuk melakukan pengecekan apakah posisi FRONT saat ini berada di indeks terakhir array. Jika benar, maka FRONT selanjutnya diletakkan di indeks 0.
6.	Pada method print, proses perulangan variabel i tidak dimulai dari 0 (int i = 0) melainkan int i = front karena perulangan akan melakukan looping semua isi array mulai dari indeks front sampai indeks rear dan front tidak selalu pada indeks ke 0, makanya tidak dituliskan int i = 0 melaikan int i = front, karena belum tentu front itu berada pada indeks 0.
7.	Potongan kode program tersebut untuk melakukan proses dimana i yaitu front ditambah 1 lalu dimodulus dengan max selama bukan 0 maka proses tersebut akan terus dijalankan dengan perulangan.
#
## Pertanyaan 8.3.3
1.	Digunakan untuk instansiasi.
2.	Akan terjadi error, karena konstruktor dari class Penumpang tidak ada yang tidak berparameter
3.	 kode program yang digunakan untuk menampilkan data yang dikeluarkan dari queue
* <img src="./ss/833.3.png">
4.	 modifikasi program dengan menambahkan method baru bernama peekRear pada class 
Queue yang digunakan untuk mengecek antrian yang berada di posisi belakang! Tambahkan pula 
daftar menu 5. Cek Antrian paling belakang pada class QueueMain sehingga method peekRear 
dapat dipanggil.
* <img src="./ss/833.5.1.png">
* <img src="./ss/833.5.2.png">
#
# Praktikum Jobsheet 8 (Algoritma & Struktur Data)
## Gambar berikut memuat kodingan class objek, class main dan output
#
1. * Class Queue
    <img src="./ss/No1.Queue.png">
    * Class Queue Main
    <img src="./ss/No1.MainQueue1.png">
    <img src="./ss/No1.MainQueue2.png">
    * Output Queue
    <img src="./ss/Output1.1.png">
    <img src="./ss/Output1.2.png">
    <img src="./ss/Output1.3.png">
#
2. * Class Mahasiswa
    <img src="./ss/No2.Mahasiswa.png">
    * Class Queue Antrian Mahasiswa
    <img src="./ss/No2.Queue1.png">
    <img src="./ss/No2.Queue2.png">
    <img src="./ss/No2.Queue3.png">
    <img src="./ss/No2.Queue4.png">
    <img src="./ss/No2.Queue5.png">
    <img src="./ss/No2.Queue6.png">
    * Class Main Queue Antrian Mahasiswa
    <img src="./ss/No2.Main1.png">
    <img src="./ss/No2.Main2.png">
    <img src="./ss/No2.Main3.png">
    * Output Queue Antrian Mahasiswa
    <img src="./ss/Output2.1.png">
    <img src="./ss/Output2.2.png">
    <img src="./ss/Output2.3.png">
    <img src="./ss/Output2.4.png">
#