#  Fatura Yönetimi Uygulaması

Bu proje, müşteri ve faturalarını kaydedip görüntüleyebileceği bir uygulamayı içermektedir.

## Gereksinimler

- Java 14 veya üzeri bir JDK
- Maven

## Proje Yapısı

Proje, Spring Boot framework'ü kullanılarak geliştirilmiştir.

Proje klasör yapısı aşağıdaki gibidir:

- `src/main/java`: Uygulama kaynak kodları
- `src/main/resources`: Konfigürasyon dosyaları, veri tabanı dosyaları vb.

## Proje Kurulumu

1. Proje deposunu yerel makinenize kopyalayın veya ZIP olarak indirin.
2. Bir Java IDE'si açın ve projeyi açın.
3. Proje dosyasının kök dizinindeki `pom.xml` dosyasını açın ve Maven bağımlılıklarını indirin.
4. Uygulamayı çalıştırın.

## Kullanım

Uygulama başarıyla çalıştığında, aşağıdaki adımları izleyerek çeşitli işlemleri gerçekleştirebilirsiniz:

1. Tüm müşterileri listeleyin: Uygulama başladığında, tüm müşterileri listeleyen bir komut çalıştırılır.
2. Yeni müşteri oluşturun: Konsol üzerinden yeni bir müşteri oluşturabilirsiniz.
3. 'C' harfi olan müşterileri listeleyin: 'C' harfi içeren müşterileri listeleyen bir komut çalıştırabilirsiniz.
4. Haziran ayında kayıt olan müşterilerin faturalarının toplam tutarını listeleyin: Haziran ayında kayıt olan müşterilerin faturalarının toplam tutarını listeleyen bir komut çalıştırabilirsiniz.
5. Sistemdeki tüm faturaları listeleyin: Sistemdeki tüm faturaları listeleyen bir komut çalıştırabilirsiniz.
6. 1500TL üstündeki faturaları listeleyin: 1500TL üstündeki faturaları listeleyen bir komut çalıştırabilirsiniz.
7. 1500TL üstündeki faturaların ortalamasını hesaplayın: 1500TL üstündeki faturaların ortalamasını hesaplayan bir komut çalıştırabilirsiniz.
8. 500TL altındaki faturalara sahip müşterilerin isimlerini listeleyin: 500TL altındaki faturalara sahip müşterilerin isimlerini listeleyen bir komut çalıştırabilirsiniz.
9. Haziran ayında faturalarının ortalaması 750 altında olan firmaların sektörlerini listeleyin: Haziran ayında faturalarının ortalaması 750 altında olan firmaların sektörlerini listeleyen bir komut çalıştırabilirsiniz.

## API Endpoint'leri

Aşağıda, uygulamanın sağladığı API endpoint'lerin bir listesi bulunmaktadır:

### Customer API

- `POST /api/v1/customers`: Yeni bir müşteri oluşturur.
- `GET /api/v1/customers`: Tüm müşterilerin listesini döner.
- `GET /api/v1/customers/search/{letter}`: İsmi belirli bir harfle başlayan müşterilerin listesini döner.
- `GET /api/v1/customers/total-amount/{month}`: Belirli bir ayda kaydedilen müşterilerin faturalarının toplam tutarını döner.
- `GET /api/v1/customers/customers/low-value-invoices`: Belirli bir tutardan daha düşük değerde faturalara sahip müşterilerin isimlerini döner.
- `GET /api/v1/customers/average-invoice-below-amount`: Belirli bir ayda faturalarının ortalaması belirli bir tutardan düşük olan firmaların hangi sektörde olduğunu döndürür.

### Invoice API

- `POST /api/v1/invoices`: Yeni bir fatura kaydeder.
- `GET /api/v1/invoices`: Tüm faturaların listesini döner.
- `GET /api/v1/invoices/greater-than/amount`: Belirli bir miktarın üzerindeki faturaların listesini döner.
- `GET /api/v1/invoices/average-amount-greater-than`: Belirli bir ortalama tutardan daha yüksek olan faturaların ortalamasını döner.

API'leri kullanarak istekler yapabilir ve sonuçları alabilirsiniz.