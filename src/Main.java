import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n; // Kursa kayıt edilecek kişi sayısı
        int secim = -1; // Kullanıcının seçtiği işlem

        System.out.print("Kursa kayit edilecek kisi sayisini giriniz :");
        n = scanner.nextInt();
        KursStack kurs = new KursStack(n); // KursStack sınıfından bir nesne oluşturuluyor.

        while (secim != 0) { // Kullanıcı çıkışı seçeneğini seçene kadar döngü devam edecek.
            System.out.println("1 -> Kursa yeni kayit");
            System.out.println("2 -> En son ki kaydi sil");
            System.out.println("3 -> Bilgileri goster");
            System.out.println("4 -> Kontenjan bilgileri");
            System.out.println("0 -> Cikis");
            System.out.print("Seciminiz: ");
            secim = scanner.nextInt(); // Kullanıcının seçtiği işlem alınıyor.

            switch (secim) {
                case 1:
                    kurs.push(); // Kursa yeni kayıt eklemek için push() metodu çağrılıyor.
                    break;
                case 2:
                    kurs.pop(); // En son kaydı silmek için pop() metodu çağrılıyor.
                    break;
                case 3:
                    kurs.print(); // Kayıtları göstermek için print() metodu çağrılıyor.
                    break;
                case 4:
                    kurs.kalanKontenjan(); // Kontenjan bilgilerini göstermek için kalanKontenjan() metodu çağrılıyor.
                    break;
                case 0:
                    System.out.println("Cikis yapiliyor");
                    break; // Programdan çıkış yapılıyor.
                default:
                    System.out.println("Hatali secim [0-5]"); // Geçersiz seçenek durumu.
            }

        }


    }
}
