import java.util.Scanner;
public class ProgramBioskop09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaTiketNormal = 50000, totalTerjualPerHari = 0, jumlahBeliTiket;
        double totalHargaPerHari = 0.0;
        String namaPelanggan;

        do {
            System.out.println();
            System.out.println("========== PROGRAM KASIR BIOSKOP ==========");
            System.out.print("Masukkan nama pelanggan: ");
            namaPelanggan = sc.nextLine();
            System.out.print("Masukkan jumlah tiket (ketik '0' untuk keluar): ");
            jumlahBeliTiket = sc.nextInt();

            if (jumlahBeliTiket == 0) {
                System.out.println("Menutup program kasir...");
                break;
            }
            if (jumlahBeliTiket < 0) {
                System.out.println("Input tidak valid! Jumlah tiket tidak bisa negatif.");
                continue;
            }

            double hargaAwal = hargaTiketNormal * jumlahBeliTiket;
            double diskon = 0.0;

            if (jumlahBeliTiket > 10) {
                diskon = 0.15; 
            } else if (jumlahBeliTiket > 4) {
                diskon = 0.10; 
            } 

            System.out.println("---------- Rincian Transaksi ----------");
            System.out.println("Nama Pelanggan: " + namaPelanggan);
            System.out.println("Jumlah tiket yang dibeli: " + jumlahBeliTiket);
            System.out.println("Harga Awal Sebelum Diskon: Rp " + hargaAwal);

            if (diskon > 0) {
                System.out.println("Mendapat Diskon: " + (diskon * 100) + " % ");
            } 

            double hargaAkhir = hargaAwal - (hargaAwal * diskon);
            System.out.println("Total Bayar Tiket Setelah Perhitungan Diskon: Rp " + hargaAkhir);
            totalTerjualPerHari += jumlahBeliTiket;
            totalHargaPerHari += hargaAkhir;
            sc.nextLine();
        } while (true);

        System.out.println("\n========== REKAPITULASI PENJUALAN HARIAN ==========");
        System.out.println("Total Tiket Terjual Hari Ini: " + totalTerjualPerHari + " tiket");
        System.out.println("Total Pendapatan Penjualan Tiket Hari Ini: Rp " + totalHargaPerHari);
        System.out.println("Rekapitulasi hari ini selesai.");
        sc.close();    
    }
}
