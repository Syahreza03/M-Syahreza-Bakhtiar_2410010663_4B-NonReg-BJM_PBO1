package pbo;

//Inheritance
public class BarangTransaksi extends Barang {
    //Overriding
    public BarangTransaksi(String kode, String nama, int stok, double harga) {
        super(kode, nama, stok, harga);
}
 @Override
    public String displayInfo() {
        return "[INFO BARANG] " + super.displayInfo();
    }
    
     // Polymorphism Overloading
    public String displayInfo(String lokasi) {
        return displayInfo() + " | Lokasi Gudang: " + lokasi;
    }

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