# Homework

Bu uygulama, farklı ev tiplerini ve özelliklerini temsil etmek için Ev, Villa ve Yazlık sınıflarını içerir. Ayrıca, evlerin toplam fiyatlarını, ortalama metrekaresini ve oda-salon sayısına göre filtreleme işlemlerini gerçekleştiren bir hizmet sınıfı içerir.

## Özellikler
- House sınıfı: Evlerin genel özelliklerini temsil eder, BaseHouseType sınıfından türetilir.
- Villa sınıfı: Villaların özelliklerini temsil eder, BaseHouseType sınıfından türetilir.
- SummerHouse sınıfı: Yazlık evlerin özelliklerini temsil eder, BaseHouseType sınıfından türetilir.
- BaseHouseType sınıfı: Ev tiplerinin ortak özelliklerini barındıran ana sınıftır.

## Nasıl Kullanılır
1. House, Villa ve SummerHouse nesnelerini oluşturmak için BaseHouseType sınıfını kullanabilirsiniz.
2. BaseService sınıfı, tüm ev tiplerinin toplam fiyatlarını, ortalama metrekaresini ve oda-salon sayısına göre filtreleme işlemlerini gerçekleştiren metotları içerir.
3. BaseService sınıfını ve her bir ev tipinin ayrı servis sınıflarını kullanarak istenen hesaplamaları ve filtrelemeleri gerçekleştirebilirsiniz.
4. Sonuçları ekrana yazdırmak için System.out.println() kullanabilirsiniz.