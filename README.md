# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi sistem inventory gudang PT. Qualita Indonesia menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan kode Barang, dan memberikan output berupa informasi detail dari kode tersebut seperti jumlah stok, harga, jenis transaksi, dan jumlah keluar.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Barang`, `BarangTransaksi`, dan `GudangBeraksi` adalah contoh dari class.

```bash
public class Barang {
    ...
}

public class BarangTransaksi extends Barang {
    ...
}

public class GudangBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `barangList[i] = new BarangTransaksi(kode, nama, stok, harga);` adalah contoh pembuatan object.

```bash
barangList[i] = new BarangTransaksi(kode, nama, stok, harga);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `namaBarang`, `kodeBarang`, `stok`, dan `harga` adalah contoh atribut.

```bash
String kodeBarang;
String namaBarang;
int stok;
double harga;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Barang` dan `BarangTransaksi`.

```bash
public Mahasiswa(String nama, String npm) {
    this.nama = nama;
    this.npm = npm;
}

public BarangTransaksi(String kode, String nama, int stok, double harga) {
    super(kode, nama, stok, harga);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setStok` dan `setHarga` adalah contoh method mutator.

```bash
public void setStok(int stok) {
    this.stok = stok;
}

public void setHarga(double harga) {
    this.harga = harga;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getKodeBarang`, `getNamaBarang`, `getStok`, dan `getHarga` adalah contoh method accessor.

```bash
public String getKodeBarang() {
    return kodeBarang;
}

public String getNamaBarang() {
    return namaBarang;
}
public int getStok() {
    return stok;
}
public double getHarga() {
    return harga;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `kodeBarang`, `namaBarang`, `stok` dan `harga` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String kodeBarang;
private String namaBarang;
private int stok;
private double harga;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `barangTransaksi` mewarisi `barang` dengan sintaks `extends`.

```bash
public class BarangTransaksi extends Barang {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Mahasiswa` merupakan overloading method `displayInfo` dan `displayInfo` di `MahasiswaDetail` merupakan override dari method `displayInfo` di `Mahasiswa`.

```bash
public String displayInfo(String lokasi) {
    return displayInfo() + " | Lokasi Gudang: " + lokasi;
}

@Override
public String displayInfo() {
    return "[INFO BARANG] " + super.displayInfo();
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method tambah dan kurang stok `getStok` dan `setStok`.

```bash
public void tambahStok(int jumlah) {
    if (jumlah > 0) {
        setStok(getStok() + jumlah);
    } else {
        System.out.println("Jumlah harus lebih dari 0 untuk menambah stok.");
    }
}

public void kurangiStok(int jumlah) {
    if (jumlah > getStok()) {
        System.out.println("Jumlah keluar melebihi stok! Transaksi dibatalkan.");
    } else if (jumlah <= 0) {
        System.out.println("Jumlah harus lebih dari 0 untuk mengurangi stok.");
    } else {
        setStok(getStok() - jumlah);
    }
}
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
 for (int i = 0; i < barangList.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan Kode Barang: ");
String kode = input.nextLine();
System.out.print("Masukkan Nama Barang: ");
String nama = input.nextLine();
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `BarangTransaksi[] barangList = new BarangTransaksi[2];` adalah contoh penggunaan array.

```bash
BarangTransaksi[] barangList = new BarangTransaksi[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (NumberFormatException e) {
  System.out.println("Input stok harus berupa angka.");
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: M. Syahreza Bakhtiar
NPM: 2410010663
