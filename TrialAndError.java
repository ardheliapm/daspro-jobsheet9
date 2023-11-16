import java.util.Scanner;

public class TrialAndError {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah elemen array
        System.out.print("Masukkan jumlah elemen array: ");
        int jumlahElemen = scanner.nextInt();

        // Inisialisasi array
        int[] array = new int[jumlahElemen];

        // Input nilai-nilai array
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Masukkan nilai elemen ke-" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Hitung nilai tertinggi, nilai terendah, dan nilai rata-rata
        int nilaiTertinggi = array[0];
        int nilaiTerendah = array[0];
        int total = array[0];

        for (int i = 1; i < jumlahElemen; i++) {
            if (array[i] > nilaiTertinggi) {
                nilaiTertinggi = array[i];
            }

            if (array[i] < nilaiTerendah) {
                nilaiTerendah = array[i];
            }

            total += array[i];
        }

        // Hitung nilai rata-rata
        double rataRata = (double) total / jumlahElemen;

        // Output hasil
        System.out.println("\nHasil:");
        System.out.println("Nilai Tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai Terendah: " + nilaiTerendah);
        System.out.println("Nilai Rata-rata: " + rataRata);

        scanner.close();
    }
}
