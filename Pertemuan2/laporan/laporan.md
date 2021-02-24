# Jawaban latihan praktikum jobsheet 02

## sub bab 2.2.
   3. Tidak bisa karena tidak ada psvm (public static void main)

## sub bab 2.2.3 
1.	– Memiliki suatu data atau atribut 
– Bisa melakukan method atau suatu tingkah laku 
2.	Class 
3.	Ada 4 atribut, yaitu namaBarang, jenisBarang, stok, hargaBarang yang terletak pada baris ke 13 dan 14
4.	Ada 4 method, yaitu void tampilBarang, void tambahStok, void kurangiStok dan int hitungHargaTotal
-	Method tampilBarang pada baris 16 sampai 21
-	Method tambahStok pada baris 23 sampai 25
-	Method kurangiStok pada baris 27 sampai 29
-	Method hitungHargaTotal pada 31 sampai 33
5.	Modifikasinya :
void kurangiStok(int n) {
if (stok>0 && stok>n) {
            stok -= n;
}else 
            System.out.println("Stok Habis");
}
<img src="./ss/2.2.3_Jawaban_No_5.png">
6.	Karena atribut stok sendiri bernilai int sehingga parameternya juga menggunakan int.
7.	Karena method ini menampilkan nilai berupa nominal uang sehingga hasil yang diharapkan tidak memiliki nilai pecahan.
8.	Karena method tersebut terinstansiasi int pada parameternya saat kita mengisikan sendiri stok yang ingin ditambah sehingga menggunakan void pada method tambahStok().

## sub bab 2.3.3
1.	Baris ke 15, nama objeknya bl
2.	
    *  Membuat kelas objeknya dulu dari kelas Barang dan diberikan nama bl.
    *  Kemudian bisa diakses semua atribut dan method dari class Barang. Cara mengaksesnya pada baris ke 16-21
## sub bab 2.4.2
1. Deklasi konstruktor pada class Barang dilakukan pada baris 25
2.	Memberikan nilai atribut pada class Barang.
3. <img src="./ss/2.4.2_Jawaban_No_3.png">



## tugas 
1. sOutput Praktikum No 1
    * <img src="./ss/OutputNo1_Pertemuan2.png">
2. Output Praktikum  No 2
    * <img src="./ss/OutputNo2_Pertemuan2.png">
3. Output Praktikum No 3
    * <img src="./ss/OutputNo3_Pertemuan2.png">
4. Output Praktikum No 4
    * <img src="./ss/OutputNo4_Pertemuan2.png">
Terimakasih