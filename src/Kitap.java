import java.util.ArrayList;
import java.util.List;

public class Kitap {

    private String isbn;
    private String ad;
    private String yazar;
    private int yayinYili;
    private List<KitapKopyasi> kopyalar = new ArrayList<>();

    public Kitap(String isbn, String ad, String yazar, int yayinYili) {
        this.isbn = isbn;
        this.ad = ad;
        this.yazar = yazar;
        this.yayinYili = yayinYili;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAd() {
        return ad;
    }

    public String getYazar() {
        return yazar;
    }

    public int getYayinYili() {
        return yayinYili;
    }

    public List<KitapKopyasi> getKopyalar() {
        return kopyalar;
    }

    public void kopyaEkle(KitapKopyasi kopya) {
        kopyalar.add(kopya);
    }

    public int raftakiKopyaSayisi() {
        int sayi = 0;
        for (KitapKopyasi kopya : kopyalar) {
            if (kopya.oduncVerilebilirMi()) {
                sayi++;
            }
        }
        return sayi;
    }

    public void bilgiYazdir() {
        System.out.println("Kitap: " + ad + " - " + yazar + " (" + yayinYili + "), ISBN: " + isbn);
        System.out.println("   Toplam kopya: " + kopyalar.size() + ", rafta: " + raftakiKopyaSayisi());
        for (KitapKopyasi kopya : kopyalar) {
            System.out.print("   ");
            kopya.bilgiYazdir();
        }
    }
}
