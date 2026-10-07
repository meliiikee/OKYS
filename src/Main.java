import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Kitap kitap1 = new Kitap("978-0-06-231500-7", "Simyaci", "Paulo Coelho", 1988);
        Kitap kitap2 = new Kitap("978-975-07-0418-1", "Suc ve Ceza", "Dostoyevski", 1866);

        KitapKopyasi kopya1 = new KitapKopyasi("K-001");
        KitapKopyasi kopya2 = new KitapKopyasi("K-002");
        KitapKopyasi kopya3 = new KitapKopyasi("K-003");

        Kullanici ayse = new Kullanici(1, "Ayse", "Yilmaz");
        Kullanici mehmet = new Kullanici(2, "Mehmet", "Kaya");

        OduncKaydi kayit1 = new OduncKaydi(ayse.getKullaniciNo(), kopya1.getBarkod(), LocalDate.now());
        kopya1.setOduncte(true);

        System.out.println("===== KITAPLAR =====");
        kitap1.bilgiYazdir();
        kitap2.bilgiYazdir();

        System.out.println("\n===== KOPYALAR =====");
        kopya1.bilgiYazdir();
        kopya2.bilgiYazdir();
        kopya3.bilgiYazdir();

        System.out.println("\n===== KULLANICILAR =====");
        ayse.bilgiYazdir();
        mehmet.bilgiYazdir();

        System.out.println("\n===== ODUNC KAYITLARI =====");
        kayit1.bilgiYazdir();

        System.out.println("\n>> Ayse kitabi iade etti.");
        kayit1.iadeEt();
        kopya1.setOduncte(false);
        kayit1.bilgiYazdir();
        kopya1.bilgiYazdir();
    }
}
