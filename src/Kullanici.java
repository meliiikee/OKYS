public class Kullanici {

    private int kullaniciNo;
    private String ad;
    private String soyad;

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

    public void bilgiYazdir() {
        System.out.println("Kullanici #" + kullaniciNo + ": " + ad + " " + soyad);
    }
}
