package src.day13_MethodCreation;

public class C04_MethodCreation {
    public static void main(String[] args) {
        // input olarak iki int'ı toplayıp
        // sonucunu yazdıran
        // bir method oluşturun
        int input1 = 180;
        int input2 = -150;

        /*
        Method 4 adımda oluşturulur.
        1. adım method call
        2. adım argument eklenmesi gerekiyorsa ekleyelim
           eğer method'un return type void'den farklı olacaksa
           bir variable oluşturup, method call'u assign edelim
        */

        topla(input1,input2);
    }

    public static void topla(int input1, int input2) {
        /*
        3. adım method deklarasyonunda değiştirilmesi gereken yerleir değiştir.
        (access modifier, return type vb)
        4. eğer return type void dışında ise
        return keywordu ve dönecek değeri hesaplamalıyız
         */
        System.out.println("Girilen iki sayının toplamı : "+(input1 + input2));
    }
}