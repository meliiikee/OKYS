public class KitapKopyasi {

    private String barkod;
    private boolean oduncte;

    public KitapKopyasi(String barkod) {
        this.barkod = barkod;
        this.oduncte = false;
    }

    public String getBarkod() {
        return barkod;
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
        System.out.println("Kopya: " + barkod + " [" + durum + "]");
    }
}
