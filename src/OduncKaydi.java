import java.time.LocalDate;

public class OduncKaydi {

    private int kullaniciNo;
    private String kopyaBarkod;
    private LocalDate alisTarihi;
    private LocalDate iadeTarihi;

    public OduncKaydi(int kullaniciNo, String kopyaBarkod, LocalDate alisTarihi) {
        this.kullaniciNo = kullaniciNo;
        this.kopyaBarkod = kopyaBarkod;
        this.alisTarihi = alisTarihi;
        this.iadeTarihi = null;
    }

    public int getKullaniciNo() {
        return kullaniciNo;
    }

    public String getKopyaBarkod() {
        return kopyaBarkod;
    }

    public LocalDate getAlisTarihi() {
        return alisTarihi;
    }

    public LocalDate getIadeTarihi() {
        return iadeTarihi;
    }

    public void iadeEt() {
        this.iadeTarihi = LocalDate.now();
    }

    public void bilgiYazdir() {
        String iade = (iadeTarihi == null) ? "henuz iade edilmedi" : iadeTarihi.toString();
        System.out.println("Odunc: kullanici #" + kullaniciNo + " -> kopya " + kopyaBarkod
                + " | alis: " + alisTarihi + " | iade: " + iade);
    }
}
