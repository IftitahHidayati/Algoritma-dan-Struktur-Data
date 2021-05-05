# LAPORAN TUGAS JOBSHEET 12
# Iftitah Hidayati /1H/14/2041720006
## Pertanyaan 12.2.3
1.	Pada single linked list hanya memiliki satu pointer saja yaitu next, sedangkan pada double linked list memiliki dua pointer yaitu next dan previous, dimana pointer merujuk pada node berikutnya dan pointer previous merujuk pada node sebelumnya.
2.	Pointer next digunakan untuk menunjuk node setelahnya dan pointer previous menunjuk node sebelumnya.
3.	Untuk mengeset atau sebagai nilai awal/defautl bahwa nilai dari head = null karena belom ada data awal dan size = 0 karena belum ada panjang/kapasitas kumpulan node yang diisi.
4.	Karena pada addFirst atau penambahan data pertama itu tidak ada pointer prev atau pointer sebelumnya karena node itu sendiri merupakan node pertama,yang mana hanya memilki pointer next.
5.	Mengenalkan pointer previous pada node baru
6.	Mengenalkan node baru pada pointer tail.
#
## Pertanyaan 12.3.3
1.	Pada baris pertama digunakan untuk mengubah posisi head dan node setelahnya. Kemudian baris kedua digunakan untuk menghapus head sebelumnya dengan memberikan nilai null.
2.	Terdapat 2 kondisi. Kondisi yang pertama mengecek apakah setelah head bernilai null jika benar maka head langsung dihapus. Kondisi kedua dilakukan looping dengan cara mengecek apakah dua node setelah current bernilai null. Kemudian setelah keluar looping node current.next diberikan nilai null.
3.	Baris pertama digunakan untuk pembuatan node temp untuk menyimpan lokasi node setelah head. Baris kedua digunakan mengahapus hubungan nodehead dengan node temp dengan cara langsung menghubungkan head.next kepada node telah temp. Baris ketiga menghapus hubungan node setelah temp dengan temp dengan cara langsung menghubungkan node setalah temp dengan node head.
4.	Baris pertama digunakan mengahapus hubungan current dengan node sebelumnya dengan cara langsung menghubungkan node sebelum current kepada node setelah current. Baris kedua menghapus hubungan node setelah current dengan current dengan cara langsung menghubungkan node setelah current dengan node sebelum current.
#
## Pertanyaan 12.4.3
1.	Digunakan untuk mengetahui total node yang ada didalam list.
2.	Caranya dengan mengubah head menjadi head.next sehingga, nanti head akan berada pada index ke-1 dan index ke-0 akan dikosongkan.
3.	Double linked lists perlu mengetahui node sebelum dan sesudahnya, sedangkan single linked lists hanya mengetahui node setelahnya saja.
4.	Kode program isEmpty() yang A mengecek menggunakan  jumlah node yang ada dilinked list. Kode program isEmpty() yang B melakukan pengecekan berdasarkan nilai pada headnya.
#
# Praktikum Jobsheet 12 (Algoritma & Struktur Data)
## Gambar berikut memuat kodingan class objek, class main dan output
#
1. * Class Node
    <img src="./ss/1.Node.png">
    * Class Double Linked Lists
    <img src="./ss/1.DLL1.png">
    <img src="./ss/1.DLL2.png">
    <img src="./ss/1.DLL3.png">
    <img src="./ss/1.DLL4.png">
    <img src="./ss/1.DLL5.png">
    <img src="./ss/1.DLL6.png">
    <img src="./ss/1.DLL7.png">
    * Class Main
    <img src="./ss/1.Main1.png">
    <img src="./ss/1.Main2.png">
    <img src="./ss/1.Main3.png">
    * Output No 1
    <img src="./ss/O1.1.png">
    <img src="./ss/O1.2.png">
    <img src="./ss/O1.3.png">
    <img src="./ss/O1.4.png">
    <img src="./ss/O1.5.png">
    <img src="./ss/O1.6.png">
    <img src="./ss/O1.7.png">
    <img src="./ss/O1.8.png">
    <img src="./ss/O1.9.png">
    <img src="./ss/O1.10.png">
#
2. * Class Node
    <img src="./ss/2.Node.png">
    * Class Double Linked Lists
    <img src="./ss/2.DLL1.png">
    <img src="./ss/2.DLL2.png">
    <img src="./ss/2.DLL3.png">
    * Class Main
    <img src="./ss/2.Main1.png">
    <img src="./ss/2.Main2.png">
    * Output No 2
    <img src="./ss/O2.1.png">
    <img src="./ss/O2.2.png">
    <img src="./ss/O2.3.png">
    <img src="./ss/O2.4.png">
    <img src="./ss/O2.5.png">
#
3. * Class Node
    <img src="./ss/3.Node.png">
    * Class Node
    <img src="./ss/3.QNode1.png">
    <img src="./ss/3.QNode2.png">
    * Class Double Linked Lists
    <img src="./ss/3.DLL1.png">
    <img src="./ss/3.DLL2.png">
    * Class Main
    <img src="./ss/3.Main1.png">
    <img src="./ss/3.Main2.png">
    * Output No 3
    * 
    <img src="./ss/O3.1.png">
    <img src="./ss/O3.2.png">
    <img src="./ss/O3.3.png">
    <img src="./ss/O3.4.png">
#
4. * Class Node
    <img src="./ss/4.Node.png">
    * Class Mahasiswa
    <img src="./ss/4.Mahasiswa.png">
    * Class Double Linked Lists
    <img src="./ss/4.DLL1.png">
    <img src="./ss/4.DLL2.png">
    <img src="./ss/4.DLL3.png">
    <img src="./ss/4.DLL4.png">
    <img src="./ss/4.DLL5.png">
    <img src="./ss/4.DLL6.png">
    <img src="./ss/4.DLL7.png">
    <img src="./ss/4.DLL8.png">
    * Class Main
    <img src="./ss/4.Main1.png">
    <img src="./ss/4.Main2.png">
    <img src="./ss/4.Main3.png">
    <img src="./ss/4.Main4.png">
    <img src="./ss/4.Main5.png">
    * Output No 1
    <img src="./ss/O4.1.png">
    <img src="./ss/O4.2.png">
    <img src="./ss/O4.3.png">
    <img src="./ss/O4.4.png">
    <img src="./ss/O4.5.png">
    <img src="./ss/O4.6.png">
    <img src="./ss/O4.7.png">
    <img src="./ss/O4.8.png">
    <img src="./ss/O4.9.png">
    <img src="./ss/O4.10.png">
#