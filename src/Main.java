import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Kitap simyaci = new Kitap("978-0-06-231500-7", "Simyaci", "Paulo Coelho", 1988);
        Kitap sucVeCeza = new Kitap("978-975-07-0418-1", "Suc ve Ceza", "Dostoyevski", 1866);

        KitapKopyasi k1 = new KitapKopyasi("K-001", simyaci);
        KitapKopyasi k2 = new KitapKopyasi("K-002", simyaci);
        KitapKopyasi k3 = new KitapKopyasi("K-003", sucVeCeza);

        Kullanici ayse = new Kullanici(1, "Ayse", "Yilmaz");
        Kullanici mehmet = new Kullanici(2, "Mehmet", "Kaya");

        OduncKaydi kayit1 = new OduncKaydi(ayse, k1, LocalDate.now());
        OduncKaydi kayit2 = new OduncKaydi(ayse, k3, LocalDate.now());
        OduncKaydi kayit3 = new OduncKaydi(mehmet, k2, LocalDate.now());

        System.out.println("===== KITAPLAR VE KOPYALARI =====");
        simyaci.bilgiYazdir();
        sucVeCeza.bilgiYazdir();

        System.out.println("\n===== KULLANICILAR =====");
        ayse.bilgiYazdir();
        mehmet.bilgiYazdir();

        System.out.println("\n===== AYSE'NIN ODUNC KAYITLARI =====");
        for (OduncKaydi kayit : ayse.getOduncKayitlari()) {
            kayit.bilgiYazdir();
        }

        System.out.println("\nkayit3'teki kitabin yazari: " + kayit3.getKopya().getKitap().getYazar());

        System.out.println("\n>> Mehmet, Ayse'deki K-001'i almaya calisiyor...");
        try {
            new OduncKaydi(mehmet, k1, LocalDate.now());
        } catch (IllegalStateException hata) {
            System.out.println("HATA: " + hata.getMessage());
        }

        System.out.println("\n>> Ayse, Simyaci'yi (K-001) iade etti.");
        kayit1.iadeEt();
        kayit1.bilgiYazdir();
        simyaci.bilgiYazdir();
    }
}
