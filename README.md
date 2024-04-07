# Kurs Kayıt Uygulaması

Bu Java programı, bir kursa kayıt işlemlerini gerçekleştirmek için oluşturulmuştur. Kullanıcı, kursa kayıt olabilir, kayıt yapmış kişilerin bilgilerini görüntüleyebilir, en son kaydı silebilir ve mevcut kontenjan durumunu kontrol edebilir.

## Nasıl Çalıştırılır

Programı çalıştırmak için `Main.java` dosyasını derleyip çalıştırabilirsiniz. Program başladığında, kullanıcıya bir dizi seçenek sunulur ve kullanıcı istediği işlemi seçebilir.

## Kullanılan Veri Yapısı: Stack (Yığın)

Bu uygulama, kursa kayıtlı kişileri saklamak için bir yığın (stack) veri yapısını kullanır. Stack veri yapısı, verilerin en son eklenenin (push) en önce çıkarılması (pop) mantığına dayanır. Bu uygulamada, yeni bir kişi kaydedildiğinde (push), bu kişi yığının en üstüne eklenir. Kayıt silme işlemi (pop) ise en son eklenen kişiyi yığından çıkarır.

## Örnek Kullanım

1. Kursa yeni kayıt eklemek için "1 -> Kursa yeni kayit" seçeneğini seçin.
2. Kayıt silmek için "2 -> En son ki kaydi sil" seçeneğini seçin.
3. Kayıtları görüntülemek için "3 -> Bilgileri goster" seçeneğini seçin.
4. Mevcut kontenjan bilgilerini görmek için "4 -> Kontenjan bilgileri" seçeneğini seçin.
5. Çıkış yapmak için "0 -> Cikis" seçeneğini seçin.

