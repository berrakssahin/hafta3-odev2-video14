public class ProductValidator {
    //NOT: Manager sınıfları static yapılmaz

    //NOT: Staticler direkt class ismiyle çağrılır ve çağrıldığı anda da bellekte oluşur

    //NOT: Static olarak tanımlanmayanlar class olarak çağrılamaz. New'lenmeleri gerekiyor.

    //NOT: Yapıcı bloklar new'leyince çalışır.

    //NOT: Parametresiz olan yapıcı blok sataticte de çalışır

    //NOT: Ana class static olamıyor

    static {
        System.out.println("Static yapıcı blok çalıştı");
    }
    public ProductValidator() {
        System.out.println("Yapıcı blok çalıştı");
    }
    public static boolean isValid(Product product) {
        if(product.price>0 && !product.name.isEmpty()) {
            return true;
        }

        else {
            return false;
        }

    }

    public void bisey() {

    }

    public static class BaskaBirClass {
        public static void Sil() {

        }
    }
    //linner class
}
