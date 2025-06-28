package pbo;

//Class
public class Barang {
    //Atribut & Encapsulation 
    private String kodeBarang;
    private String namaBarang;
    private int stok;
    private double harga;
    
    //Konstruktor
  public Barang(String kodeBarang, String namaBarang, int stok, double harga) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.stok = stok;
        this.harga = harga;
    }
    
    //Aksessor (Getter)
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
    
    //Mutator (Setter)
    public void setStok(int stok) {
        this.stok = stok;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String displayInfo() {
        return "Kode: " + kodeBarang + " | Nama: " + namaBarang +
               " | Stok: " + stok + " | Harga: Rp" + harga;
    }
}
