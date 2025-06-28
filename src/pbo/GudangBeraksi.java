package pbo;

import java.util.Scanner;

public class GudangBeraksi {
    public static void main(String[] args) {
        
        //IO Sederhana
        Scanner input = new Scanner(System.in);
        //Array
        BarangTransaksi[] barangList = new BarangTransaksi[2];

        //Error Handling
        try {
            //perulangan
           for (int i = 0; i < barangList.length; i++) {
            System.out.print("Masukkan Kode Barang: ");
            String kode = input.nextLine();
            System.out.print("Masukkan Nama Barang: ");
            String nama = input.nextLine();

            int stok = 0;
            while (true) {
                System.out.print("Masukkan Stok Awal: ");
                try {
                    stok = Integer.parseInt(input.nextLine());
                    if (stok < 0) {
                        System.out.println("Stok tidak boleh negatif.");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Input stok harus berupa angka.");
                }
            }

            double harga = 0;
            while (true) {
                System.out.print("Masukkan Harga: ");
                try {
                    harga = Double.parseDouble(input.nextLine());
                    if (harga < 0) {
                        System.out.println("Harga tidak boleh negatif.");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Input harga harus berupa angka.");
                }
            }

            barangList[i] = new BarangTransaksi(kode, nama, stok, harga);

            System.out.print("Transaksi (masuk/keluar): ");
            String jenis = input.nextLine();

            int jumlah = 0;
            while (true) {
                System.out.print("Jumlah: ");
                try {
                    jumlah = Integer.parseInt(input.nextLine());
                    if (jumlah <= 0) {
                        System.out.println("Jumlah harus lebih dari 0.");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Input jumlah harus berupa angka.");
                }
            }

            if (jenis.equalsIgnoreCase("masuk")) {
                barangList[i].tambahStok(jumlah);
            } else if (jenis.equalsIgnoreCase("keluar")) {
                barangList[i].kurangiStok(jumlah);
            } else {
                System.out.println("Jenis transaksi tidak dikenali.");
            }

            System.out.println();
        }
    } catch (Exception e) {
        System.out.println("Terjadi kesalahan input: " + e.getMessage());
    }

    System.out.println("\n=== Laporan Stok Barang PT.Qualita Indonesia ===");
    for (BarangTransaksi b : barangList) {
        System.out.println(b.displayInfo("Gudang WH Banjarmasin"));
    }
}
}