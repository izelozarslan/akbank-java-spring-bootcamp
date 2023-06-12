# Online Alışveriş Sistemi - Backend Servis

Bu projede, bir online alışveriş sitesinin backend servisini oluşturduk. Bu servis, kullanıcıları, ürünleri ve yorumları yönetmektedir. Serviste aynı kullanıcı adı, telefon numarası veya e-posta ile kayıt yapılamaz ve bir e-posta veya telefon numarası sadece bir kullanıcıya ait olabilir.

## Başlarken
Aşağıdaki adımları izleyerek projeyi yerel makinenizde çalıştırabilirsiniz.

## Gereksinimler
* Java 14 veya daha yeni bir sürüm
* Apache Maven
* PostgreSQL veritabanı

## Kurulum
1. Bu projeyi GitHub'dan klonlayın:
``` shell
git clone https://github.com/Akbank-Patika-dev-Java-Spring-Bootcamp/homework-2-izelozarslan.git
```
2. PostgreSQL veritabanında yeni bir veritabanı oluşturun.

3. application.properties dosyasını açın ve veritabanı bağlantı bilgilerini güncelleyin:

```bash

spring.datasource.url=jdbc:postgresql://localhost:5432/veritabani_adi
spring.datasource.username=kullanici_adi
spring.datasource.password=sifre
```

4. Proje dizininde aşağıdaki komutu çalıştırarak Maven bağımlılıklarını yükleyin:
```shell
mvn clean install
```

5. Projeyi çalıştırın:
```shell
mvn spring-boot:run
```

6. Servis, varsayılan olarak http://localhost:8080 adresinde çalışır.

## Kullanım
Aşağıda, sağladığımız API rotalarının ve kullanımlarının örneklerini bulabilirsiniz:

### Product Controller
* Ürünleri listelemek için GET api/v1/products rotasını kullanabilirsiniz.
* Bir ürünü kaydetmek için POST api/v1/products rotasını kullanabilirsiniz.
* Bir ürünü ID'sine göre getirmek için GET api/v1/products/{id} rotasını kullanabilirsiniz.
* Bir ürünü silmek için DELETE api/v1/products/{id} rotasını kullanabilirsiniz.
* Bir ürünün fiyatını güncellemek için PUT api/v1/products/{id} rotasını kullanabilirsiniz.

### User Controller
* Tüm kullanıcıları getirmek için GET api/v1/users rotasını kullanabilirsiniz.
* Bir kullanıcıyı ID'sine göre getirmek için GET api/v1/users/{id} rotasını kullanabilirsiniz.
* Bir kullanıcıyı kullanıcı adına göre getirmek için GET api/v1/users/username rotasını kullanabilirsiniz.
* Bir kullanıcıyı kaydetmek için POST api/v1/users rotasını kullanabilirsiniz.
* Bir kullanıcıyı silmek için DELETE api/v1/users/{id} rotasını kullanabilirsiniz.
* Bir kullanıcının bilgilerini güncellemek için PUT api/v1/users/{id} rotasını kullanabilirsiniz.

### Comment Controller
* Bir kullanıcının yaptığı yorumları getirmek için GET api/v1/comments/users/{id} rotasını kullanabilirsiniz.
* Bir ürüne yapılan tüm yorumları getirmek için GET api/v1/comments/products/{id} rotasını kullanabilirsiniz.
* Yeni bir yorum yazmak için POST api/v1/comments rotasını kullanabilirsiniz.
* Bir yorumu silmek için DELETE api/v1/comments/{id} rotasını kullanabilirsiniz.
* Tüm yorumları getirmek için GET api/v1/comments
* Bir yorumu ID'sine göre getirmek için GET api/v1/comments/{id}

## Hata İşleme
Bu projede, hata yönetimi için bir "Controller Advice" mekanizması kullanılmıştır. Sunucu tarafında meydana gelebilecek hataların istemciye uygun bir şekilde dönüş yapılması sağlanmıştır.

## Katkıda Bulunma
Eğer projeye katkıda bulunmak isterseniz, lütfen bir "Pull Request" gönderin. Büyük değişiklikler için önceden tartışmak amacıyla bir konu açmaktan çekinmeyin.
