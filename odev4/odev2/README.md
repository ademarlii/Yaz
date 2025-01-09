Odev2 Projesi - Docker ile Çalıştırma
Bu proje, Spring Boot kullanılarak geliştirilmiş basit bir hesap makinesi uygulamasıdır. Uygulama şu endpoint'leri sağlar:

/start/sum: İki sayının toplamını döndüren bir GET isteği.
/start/multiply: İki sayının çarpımını döndüren bir POST isteği.
Docker Kullanımı
Docker İmajını Oluşturma
Projenin bulunduğu dizinde aşağıdaki komutla Docker imajını oluşturabilirz:


docker build -t odev2:v1 .
Docker Container'ını Çalıştırma
Oluşturulan imajdan bir container çalıştırmak için şu komutu kullanabiliriz:


docker run -d -p 8080:8080 --name my-odev2-app odev2:v1
Container'ın Çalıştığını Kontrol Etme
Container'ın çalıştığını doğrulamak için şu komutla kontrol edebiliriz:

docker ps
Uygulamanın Docker Compose ile Çalıştırılması
Docker Compose Dosyası
Proje dizininde bulunan docker-compose.yaml dosyası şu içeriğe sahiptir:

yaml
Kodu kopyala
version: '3.8'

services:
odev2-service:
image: odev2:v1
build:
context: .
ports:
- "8080:8080"
volumes:
- ./target:/app/target
Docker Compose ile Container Çalıştırma
Docker Compose kullanarak container'ı başlatmak için şu komutu çalıştırabiliriz:

docker-compose up -d
Çalışan servisleri kontrol etmek için şu komutu kullanabiliriz:


docker-compose ps
Uygulamayı test etmek için şu endpoint'leri kullanabiliriz:

GET /start/sum:

http://localhost:8080/start/sum?a=5&b=3
Bu istek, a ve b parametrelerinin toplamını döndürecektir. Örneğin, yukarıdaki istek 8 sonucunu verir.
POST /start/multiply:
URL:

http://localhost:8080/start/multiply
JSON Gövdesi:
json

{
"a": 5,
"b": 3
}
Bu istek, a ve b parametrelerinin çarpımını döndürecektir. Örneğin, yukarıdaki istek 15 sonucunu verir.