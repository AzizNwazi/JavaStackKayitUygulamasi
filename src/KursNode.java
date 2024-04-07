// KursNode sınıfı, bağlı listedeki her bir düğümü temsil eder
public class KursNode {
    String tc; // Öğrencinin TC kimlik numarası
    String ad; // Öğrencinin adı
    String soyad; // Öğrencinin soyadı
    String mezunBolum; // Öğrencinin mezun olduğu bölüm
    KursNode next; // Bir sonraki düğümü işaret eden referans

    // Kurucu metod: Yeni bir düğüm oluşturur ve bilgileri parametrelerle doldurur
    public KursNode(String tc, String ad, String soyad, String mezunBolum) {
        this.tc = tc; // TC kimlik numarası atanır
        this.ad = ad; // Ad atanır
        this.soyad = soyad; // Soyad atanır
        this.mezunBolum = mezunBolum; // Mezun olduğu bölüm atanır
        this.next = null; // Başlangıçta bir sonraki düğüm boş olur
    }
}
