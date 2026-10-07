import java.util.ArrayList;
import java.util.List;

public class Kullanici {

    private int kullaniciNo;
    private String ad;
    private String soyad;
    private List<OduncKaydi> oduncKayitlari = new ArrayList<>();

    public Kullanici(int kullaniciNo, String ad, String soyad) {
        this.kullaniciNo = kullaniciNo;
        this.ad = ad;
        this.soyad = soyad;
    }

    public int getKullaniciNo() {
        return kullaniciNo;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public List<OduncKaydi> getOduncKayitlari() {
        return oduncKayitlari;
    }

    public void oduncKaydiEkle(OduncKaydi kayit) {
        oduncKayitlari.add(kayit);
    }

    public void bilgiYazdir() {
        System.out.println("Kullanici #" + kullaniciNo + ": " + ad + " " + soyad
                + " (" + oduncKayitlari.size() + " odunc kaydi)");
    }
}
