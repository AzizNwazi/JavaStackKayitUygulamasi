import java.util.Scanner;

public class KursStack {
    int size; // Kursa kayıt edilebilecek maksimum kişi sayısı
    int counter; // Kursa kayıt edilmiş kişi sayısı
    KursNode head; // Bağlı listenin başlangıç düğümü

    Scanner scanner = new Scanner(System.in); // Kullanıcıdan veri almak için Scanner nesnesi

    // Kurucu metod
    public KursStack(int size) {
        this.size = size;
        counter = 0;
        head = null;
    }

    // Kayıt işlemi
    String tc; // TC kimlik numarası
    String ad; // Adı
    String soyad; // Soyadı
    String mezunBolum; // Mezun olduğu bölüm

    void push() {
        System.out.println("Bilgileri giriniz: ");
        System.out.print("TC : ");
        tc = scanner.nextLine();
        System.out.print("Ad : ");
        ad = scanner.nextLine();
        System.out.print("Soyad : ");
        soyad = scanner.nextLine();
        System.out.print("Bolum : ");
        mezunBolum = scanner.nextLine();

        KursNode node = new KursNode(tc, ad, soyad, mezunBolum); // Yeni düğüm oluşturuluyor

        // Kontenjan doluysa ekleme yapılmaz
        if (isFull()) {
            System.out.println("Kontenjan dolu!");
        } else {
            // Bağlı liste boşsa yeni düğüm başa eklenir
            if (isEmpty()) {
                head = node;
                System.out.println(head.tc + " Nolu kisi kursa ilk kayit olarak eklendi");
            } else {
                node.next = head; // Yeni düğümün next'i eski baş düğümü gösterir
                head = node; // Yeni düğüm başa atanır
            }
            counter++; // Kayıt sayısı artırılır
        }
    }

    // Kayıt silme işlemi
    void pop() {
        if (isEmpty()) {
            System.out.println("Kontenjan bostur");
        } else {
            System.out.println(head.tc + " Nolu kisinin kaydi silindi");
            head = head.next; // Baş düğüm güncellenir, eski baş düğüm silinir
            counter--; // Kayıt sayısı azaltılır
        }
    }

    // Kayıtları listeleme işlemi
    void print() {
        if (isEmpty()) {
            System.out.println("Kontenjan bos");
        } else {
            KursNode temp = head;
            System.out.println("Kisi listesi: ");
            while (temp != null) {
                System.out.println("Tc: " + temp.tc);
                System.out.println("Ad: " + temp.ad);
                System.out.println("Soyad: " + temp.soyad);
                System.out.println("Bolum: " + temp.mezunBolum);
                head = head.next; // Liste ilerletiliyor
            }
        }
    }

    // Kursa kayıt edilebilecek maksimum kişi sayısını döndürür
    void kalanKontenjan() {
        System.out.println("Toplam dolu kontenjan : " + counter);
        System.out.println("Toplam bos kontenjan : " + (size - counter));
    }

    // Kontenjan dolu mu kontrolü
    boolean isFull() {
        return counter == size;
    }

    // Kontenjan boş mu kontrolü
    boolean isEmpty() {
        return counter == 0;
    }
}
