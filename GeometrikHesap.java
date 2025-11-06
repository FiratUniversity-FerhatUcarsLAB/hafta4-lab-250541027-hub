/*
 * Ad Soyad: Emine Zehra Duyar
 * Ogrenci No: 250541027
 * Tarih: 26.10.2025
 * Aciklama: GOREV 2: Geometrik Hesaplayıcı
 */
import java.util.Scanner;
    public class GeometrikHesaplayici {
    public static void main(String[]args){

    // PI sayısını  "final" ile sabit olarak tanımladım
    final double PI = 3.14159;

    Scanner input = new Scanner(System.in);

    System.out.println("=== GEOMETRIK HESAPLAYICI===");

    System.out.print("Yaricapi Girin (cm):  ");
    double r = input.nextDouble();

    System.out.println("SONUCLAR    ");
    System.out.println("--------------");

    // Daire için gerekli bilgiler
    double daireAlan= PI*r*r;
    double daireCevre = 2*PI*r;
    double daireCap= 2*r;

    // Küre için gerekli bilgiler, r² için Math.pow fonksiyonunu kullandım
    double kureHacim= (4.0/3.0)*PI*Math.pow(r,3);
    double kureYuzeyAlani= 4*PI*Math.pow(r,2);
    
    // Çıktılar// 
    System.out.printf("Dairenin Alanı          : %.2f cm²\n",daireAlan);
    System.out.printf("Dairenin Cevresi        : %.2f cm \n", daireCevre);
    System.out.printf("Dairenin Capi           : %.2f cm \n", daireCap);
    System.out.printf("Kürenin Hacmi           : %.2f cm³\n", kureHacim);
    System.out.printf("Kürenin Yüzey Alani     : %.2f cm \n", kureYuzeyAlani);

    input.close();
    }

}

