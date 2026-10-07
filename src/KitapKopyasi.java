public class KitapKopyasi {

    private String barkod;
    private boolean oduncte;
    private Kitap kitap;

    public KitapKopyasi(String barkod, Kitap kitap) {
        this.barkod = barkod;
        this.kitap = kitap;
        this.oduncte = false;
        kitap.kopyaEkle(this);
    }

    public String getBarkod() {
        return barkod;
    }

    public Kitap getKitap() {
        return kitap;
    }

    public boolean isOduncte() {
        return oduncte;
    }

    public void setOduncte(boolean oduncte) {
        this.oduncte = oduncte;
    }

    public boolean oduncVerilebilirMi() {
        return !oduncte;
    }

    public void bilgiYazdir() {
        String durum = oduncte ? "oduncte" : "rafta";
        System.out.println("Kopya: " + barkod + " (" + kitap.getAd() + ") [" + durum + "]");
    }
}
