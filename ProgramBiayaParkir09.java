import java.util.Scanner;
public class ProgramBiayaParkir09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, total = 0;

        do {
            System.out.println("---------- PROGRAM PEMBAYARAN PARKIR ----------");
            System.out.println("Masukkan jenis kendaraan");
            System.out.println("(1 = Mobil, 2 = Motor, 0 = Keluar)");
            System.out.print("Pilih jenis kendaraan anda: ");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = sc.nextInt();
                if (durasi > 5) {
                    total += 12500;
                } else {
                    if (jenis == 1) {
                        total += durasi * 3000;
                    } else {
                        total += durasi * 2000;
                    }
                }
                System.out.println("Total pendapatan parkir saat ini: Rp " + total); 
            } else if (jenis == 0) {
                System.out.println("Menghitung total akhir...");
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (jenis != 0);

        System.out.println("---------- REKAPITULASI AKHIR PEMBAYARAN ----------");
        System.out.println("Total akhir pendapatan parkir: Rp " + total);
        sc.close();
    }
}
