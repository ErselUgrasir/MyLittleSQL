# MyLittleSQL
Bir mağazadan N kişinin alışveriş yaptığını ve M adet ürün olduğunu varsayalım. Bu Java kodu mümkün olan tüm kombinasyonlarda ürünlerin kaç kişi tarafından satın alındığını tespit eder.

Girilen müşteri sayısına göre (satır) ve bulunan ürün sayısına göre (sütun varsayılan 10) rasgele bir matris oluşturur. 1 o satırdaki müşteri tarafından o sütundaki ürünün satın alındığını ve 0 satın alınmadığını gösterir.

Ürün numarası  : En çok satılan ürünlerin ürün kodu (matriste hangi sütunu temsil ettiği)
Satılan ürün : En çok satılan ürünlerin sırası
[5, 7] -> 2 (5 ve 7 numaralı ürünlerden aynı anda toplam 2 kişi satın almış)
[5, 7, 4] -> 1 (5 ve 7 ve 4 numaralı ürünlerden aynı anda toplam 1 kişi satın almış)

Oluşan çıktının bir örneği:

Lütfen müşteri sayısını giriniz: 5
Oluşturulan ürün matrisi :
0 0 0 0 0 0 1 1 0 1 
0 1 0 1 1 1 0 1 1 0 
0 1 0 0 1 1 0 0 0 0 
0 0 1 1 0 0 0 0 0 1 
1 1 1 0 0 1 1 1 0 1 
Ürün numarası  : 5 7 1 9 6 3 2 4 8 0 
Satılan ürün : 3 3 3 3 2 2 2 2 1 1 
[5, 7] -> 2
[5, 1] -> 3
[5, 9] -> 1
[5, 6] -> 1
[5, 3] -> 1
.
.
.
.
[2, 0] -> 1
[4, 8] -> 1
[4, 0] -> 0
[8, 0] -> 0
[5, 7, 1] -> 2
[5, 7, 9] -> 1
[5, 7, 6] -> 1
[5, 7, 3] -> 1
[5, 7, 2] -> 1
[5, 7, 4] -> 1
[5, 7, 8] -> 1
.
.
.
