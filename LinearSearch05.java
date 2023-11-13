import java.util.Scanner;

/**
 * LinearSearch05
 */
public class LinearSearch05 {

    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
       //System.out.print("Masukkan jumlah elemen array :");
        //int jmlElemen = sc.nextInt();
 System.out.print("Masukkan jumlah elemen array : " );
          int jmlElemen = sc.nextInt();

        int [] arrayInt = new int[jmlElemen] ;
        int key;
        int angkaDicari, i;

     

        for ( i = 0; i < jmlElemen; i++) {
            System.out.print("Masukkan elemen array ke- " + i + " : ");
            arrayInt [i] = sc.nextInt();
        }
        
        System.out.print("Masukkan Key yang ingin anda cari :");
        angkaDicari = sc.nextInt();

        for ( i = 0; i <arrayInt.length ; i++) {
           if (arrayInt [i] == angkaDicari) {
            System.out.println("Key ada di posisi indeks ke - " + i);
            break;
           
           }else {
            System.out.println("Key Tidak Ditemukan");
            break;
           }
        }
        //if (i == jmlElemen) {
          //  System.out.println("Key tidak ditemukan");
        }
       



            //if (arrayInt[i] == key) {
                //hasil = i;
                //break;
            
        
        //System.out.println("Key ada dalam array pada posisi indeks ke- " + hasil);
    }

