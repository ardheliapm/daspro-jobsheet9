import java.util.Scanner;
/**
 * TugasJobsheeet9
 */
public class TugasJobsheeet9 {

    /**
     * 
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Banyak Nilai : ");
        int banyakElemen = sc.nextInt();

          int array [] = new int[banyakElemen];

        //int array [] = new int[banyakElemen];

        for (int i = 0; i < banyakElemen; i++) {
            System.out.println("Masukkan Nilai ke-" + (i+1) + " : ");
             array[i] = sc.nextInt();
        }
        
        //int array [] = new int[banyakElemen];
        int nilaiTinggi = array[0];
        int nilaiRendah = array[0];
        int total = array [ 0];
       

       
for (int i = 1; i < banyakElemen ; i++) {
    if (array[i] > nilaiTinggi) {
        nilaiTinggi = array[i];
        
    }if (array[i] < nilaiRendah) {
        nilaiRendah = array[i];
    }

total = total + array[i];

}
double rata2 =(double) total / banyakElemen;
System.out.println("Nilai Tertinggi adalah : " + nilaiTinggi);
System.out.println("Nilai Terendah adalah : " + nilaiRendah);
System.out.println("Rata - rata adalah : " + rata2);
    }
}