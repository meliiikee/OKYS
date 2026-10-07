import java.time.LocalDate;

public class OduncKaydi {

    private Kullanici kullanici;
    private KitapKopyasi kopya;
    private LocalDate alisTarihi;
    private LocalDate iadeTarihi;

    public OduncKaydi(Kullanici kullanici, KitapKopyasi kopya, LocalDate alisTarihi) {
        if (!kopya.oduncVerilebilirMi()) {
            throw new IllegalStateException(kopya.getBarkod() + " zaten oduncte!");
        }
        this.kullanici = kullanici;
        this.kopya = kopya;
        this.alisTarihi = alisTarihi;
        this.iadeTarihi = null;

        kopya.setOduncte(true);
        kullanici.oduncKaydiEkle(this);
    }

    public Kullanici getKullanici() {
        return kullanici;
    }

    public KitapKopyasi getKopya() {
        return kopya;
    }

    public LocalDate getAlisTarihi() {
        return alisTarihi;
    }

    public LocalDate getIadeTarihi() {
        return iadeTarihi;
    }

    public void iadeEt() {
        this.iadeTarihi = LocalDate.now();
        kopya.setOduncte(false);
    }

    public void bilgiYazdir() {
        String iade = (iadeTarihi == null) ? "henuz iade edilmedi" : iadeTarihi.toString();
        System.out.println("Odunc: " + kullanici.getAd() + " " + kullanici.getSoyad()
                + " -> " + kopya.getKitap().getAd() + " (" + kopya.getBarkod() + ")"
                + " | alis: " + alisTarihi + " | iade: " + iade);
    }
}
