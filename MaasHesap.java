/*
 * Ad Soyad: Emine Zehra Duyar
 * Ogrenci No: 250541027
 * Tarih: 02.11.2025
 * Aciklama: GOREV 3: MAAS HESAPLAMA SISTEMI
 *Bu program çalışandan brüt maaş , mesai saati ve ücreti isteyerek gelirler ve kesintilerle birlikte net maaşı hesaplar 
 */

import java.util.Scanner;

public class MaasHesap {
    public static void main(String[] args) {

        // Sabitler
        final double SGK_ORANI = 0.14;
        final double GELIR_VERGISI_ORANI = 0.15;
        final double DAMGA_VERGISI_ORANI = 0.00759;
        final double MESAI_CARPANI = 1.5;
        final double AYLIK_CALISMA_SAATI = 176.0;
        
        Scanner input = new Scanner(System.in);
 
        System.out.print("ADINIZI GIRINIZ: ");
        String adSoyad = input.nextLine();

       
        System.out.print("AYLIK BRUT MAAS(TL): ");
        double brutMaas = input.nextDouble();

        System.out.print("HAFTALIK CALISMA SAATI: ");
        int haftalikCalismaSaati = input.nextInt();

        System.out.print("TOPLAM MESAI SAATI: ");
        int mesaiSaati = input.nextInt();


      // Gelirler 
        double mesaiUcreti = (brutMaas / AYLIK_CALISMA_SAATI) * mesaiSaati * MESAI_CARPANI;
        double toplamGelir = brutMaas + mesaiUcreti;

        // Kesintiler
        double sgkKesintisi = toplamGelir * SGK_ORANI;
        double gelirVergisi = toplamGelir * GELIR_VERGISI_ORANI;
        double damgaVergisi = toplamGelir * DAMGA_VERGISI_ORANI;
        double toplamKesinti = sgkKesintisi + gelirVergisi + damgaVergisi;

        double netMaas = toplamGelir - toplamKesinti;

        // Çıktılar
      
        System.out.println("========================================");
        System.out.println("           MAAS BORDROSU");
        System.out.println("========================================");

        
        System.out.printf("Calişan Adi: %s\n", adSoyad);

    
        System.out.println("\nGELIRLER:");
        
        System.out.printf("%-25s : %15.2f TL\n", "Brut Maas", brutMaas);
        System.out.printf("%-25s : %15.2f TL\n", "Mesai Ucreti (" + mesaiSaati + " saat)", mesaiUcreti);
        System.out.println("----------------------------------------");
        System.out.printf("%-25s : %15.2f TL\n", "TOPLAM GELIR", toplamGelir);

    
        System.out.println("\nKESINTILER:");

        String sgkFormat = String.format("SGK Kesintisi (%.1f%%)", SGK_ORANI * 100);
        String gelirVFormat = String.format("Gelir Vergisi (%.1f%%)", GELIR_VERGISI_ORANI * 100);
        String damgaVFormat = String.format("Damga Vergisi (%.1f%%)", DAMGA_VERGISI_ORANI * 100);

        System.out.printf("%-25s : %15.2f TL\n", sgkFormat, sgkKesintisi);
        System.out.printf("%-25s : %15.2f TL\n", gelirVFormat, gelirVergisi);
        System.out.printf("%-25s : %15.2f TL\n", damgaVFormat, damgaVergisi);
        System.out.println("----------------------------------------");
        System.out.printf("%-25s : %15.2f TL\n", "TOPLAM KESINTI", toplamKesinti);

        
        System.out.println("\n========================================");
        System.out.printf("%-25s : %15.2f TL\n", "NET MAAS", netMaas);
        System.out.println("========================================");

        input.close();
    }
}
