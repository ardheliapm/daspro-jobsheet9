import java.util.Scanner;

/**
 * ArrayRataNilai05
 */
public class ArrayRataNilai05 {

    public static void main(String[] args) {
 
        Scanner sc = new Scanner (System.in);

System.out.print("Masukkan Jumlah Mahasiswa :");
int jmlMhs = sc.nextInt();
        
    
        int [] nilaiMhs = new int [jmlMhs];
        double totalLulus = 0;
        double totalTidakLulus = 0;
        int mhsLulus = 0;
        int mhsTdkLulus = 0;
        int rataMhsLulus; 
        int rataMhsTdkLulus;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs [i] = sc.nextInt();
             if (nilaiMhs [i] >= 70) {
                mhsLulus++;
                totalLulus += nilaiMhs[i];
             } else {
                totalTidakLulus += nilaiMhs[i];
                mhsTdkLulus++;

             }
        }

      rataMhsLulus = (int) (totalLulus / mhsLulus);
      rataMhsTdkLulus = (int) (totalTidakLulus / mhsTdkLulus);

        
        //rata2 = total/nilaiMhs.length;
        //System.out.println("Rata-rata nilai = " + rata2);
        System.out.println("Banyaknya Mahasiswa Lulus Sebanyak = " + mhsLulus );
        System.out.println("Banyaknya Mahasiswa Tidak Lulus Sebanyak = " + mhsTdkLulus);
        System.out.println("Rata-rata nilai lulus = " + rataMhsLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataMhsTdkLulus);

   
        
 }
}