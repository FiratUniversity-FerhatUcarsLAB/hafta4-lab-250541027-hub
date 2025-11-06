/*
 * Ad Soyad: [ADINIZI BURAYA YAZIN]
 * Ogrenci No: [OGRENCI NUMARANIZI BURAYA YAZIN]
 * Tarih: [TARIHI BURAYA YAZIN]
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
*/

import java.util.Scanner ;
public class OgrenciBilgi {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("=== OGRENCI BILGI SISTEMI ===");
        
        // KULLANICIDAN ALINACAK BİLGİLER 
        // AD-SOYAD
        System.out.print("Adinizi Giriniz=");
        String ad = input.nextLine();
        System.out.print("Soyadinizi Giriniz=");
        String soyad = input.nextLine();
        // OGRENCİ NUMARASI
        System.out.print("Ogrenci Numaraniz=");
        int ogrenciNo = input.nextInt();
        // YAS
        System.out.print("Yasinizi girin=");
        int yas = input.nextInt();
        //GPA
        System.out.print("GPA (0.00-4.00): ");
        double gpa = input.nextDouble();
        // DURUM
        String durum= (gpa >=2) ? "Basarili Ogrenci" : "Basarisiz Ogrenci";

        // ÇIKTILAR 
        System.out.println("=== Ogrenci Bilgi Sistemi===");
        System.out.printf("Ad Soyad : %s %s\n",ad,soyad);
        System.out.printf("Ogrenci No: %d\n", ogrenciNo);
        System.out.printf("Yas: %d\n", yas );
        System.out.printf(" GPA: %.2f\n", gpa);
        System.out.printf("Durum: %s\n",durum);
        input.close();
    }

}
