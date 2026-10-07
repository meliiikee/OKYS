# OKYS - Kütüphane Yönetim Sistemi

Bir kütüphanedeki kitapların, kitap kopyalarının (fiziksel nüshaların), kullanıcıların ve ödünç işlemlerinin yönetildiği basit bir Java projesi.

## Klasör Yapısı

| Klasör / Dosya | İçerik |
|---|---|
| `doc/okys-DESIGN.drawio` | Use case ve class diyagramları (draw.io ile açılır) |
| `src/Kitap.java` | Kitabın tanımı (ISBN, ad, yazar, yayın yılı) |
| `src/KitapKopyasi.java` | Raftaki fiziksel nüsha (barkod, ödünçte mi?) |
| `src/Kullanici.java` | Kütüphane üyesi |
| `src/OduncKaydi.java` | Hangi kullanıcının hangi kopyayı ne zaman aldığı |
| `src/Main.java` | Nesneleri oluşturup programı çalıştıran sınıf |

## Çalıştırma

```
javac -encoding UTF-8 -d out src/*.java
java -cp out Main
```
