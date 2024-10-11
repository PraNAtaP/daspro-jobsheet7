import java.util.Scanner;

public class TiketBioskop19 {
    public static void main(String[] args) {
        Scanner bruh = new Scanner(System.in);

        int jmlTiket;
        double jmlJual;
        int harga = 50000;
        int totalJualTiket = 0;
        double totalHariIni = 0.0;
        double diskon = 0.0;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang ingin dibeli (input 9999 untuk cancel): ");
            jmlTiket = bruh.nextInt();

            if (jmlTiket == 9999) {
                System.out.println("Cancel Pembelian. Terima Kasih");
                break;
            }
            if (jmlTiket <= 0) {
                System.out.println("Jumlah tiket tidak valid. Silakan masukkan kembali.");
                continue; 
            }
            if (jmlTiket > 10) {
                diskon = 0.15;
            } else if (jmlTiket > 4) {
                diskon = 0.10;
            }

            jmlJual = jmlTiket * harga * (1 - diskon);
            totalJualTiket += jmlTiket;
            totalHariIni += jmlJual;

            System.out.println("Diskon: " + (diskon * 100) + "%");
            System.out.println("Total penjualan untuk transaksi ini: Rp " + jmlJual);

            System.out.println("Total tiket terjual hari ini: " + totalJualTiket);
            System.out.println("Total penjualan hari ini: Rp " + totalHariIni);
        }

        

    }
}
