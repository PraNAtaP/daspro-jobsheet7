import java.util.Scanner;

public class KarcisParkir19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalBiaya = 0;
        int tipeKendaraan, waktu, biaya;
        
        while (true) {
            do {
                System.out.print("Masukkan jenis kendaraan (1 untuk mobil, 2 untuk motor, 0 untuk cancel): ");
                tipeKendaraan = scanner.nextInt();
                if (tipeKendaraan < 0 || tipeKendaraan > 2) {
                    System.out.println("Kendaraan apaan tuh ngabsss???");
                }
            } while (tipeKendaraan < 0 || tipeKendaraan > 2);
            
            if (tipeKendaraan == 0) {
                System.out.println("Gabayarr");
                break;
            }
            
            System.out.print("Masukkan durasi parkir (jam): ");
            waktu = scanner.nextInt();
            
            if (waktu > 5) {
                biaya = 12500;
            } else {
                if (tipeKendaraan == 1) {
                    biaya = waktu * 3000;
                } else {
                    biaya = waktu * 2000;
                }
            }
            
            totalBiaya += biaya;
            System.out.println("Biaya parkir: Rp " + biaya);
            System.out.println("Total biaya parkir: Rp " + totalBiaya);
        }
    }
}