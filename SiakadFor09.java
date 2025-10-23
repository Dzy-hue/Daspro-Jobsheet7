import java.util.Scanner;
public class SiakadFor09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;
        int mahasiswaLulus = 0, mahasiswaTidakLulus = 0;
        System.out.println("========================== DATA NILAI MAHASISWA ==================================");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }

            if (nilai >= 60) {
                mahasiswaLulus++;
            } else {
                mahasiswaTidakLulus++;
            }
        }
        System.out.println("============================= NILAI DAN KELULUSAN ===================================");
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa yang lulus: " + mahasiswaLulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus: " + mahasiswaTidakLulus);
        sc.close();
    }
}