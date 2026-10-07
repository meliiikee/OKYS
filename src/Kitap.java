public class Kitap {

    private String isbn;
    private String ad;
    private String yazar;
    private int yayinYili;

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

    public void bilgiYazdir() {
        System.out.println("Kitap: " + ad + " - " + yazar + " (" + yayinYili + "), ISBN: " + isbn);
    }
}
