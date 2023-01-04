package day06_concatenition;

public class C02_Concatination {
    public static void main(String[] args) {
        String str = "Java";
        String str2 = "Güzeldir";
        int sayi = 5;
        int sayi2 = 4;

        // İstenilen çıktıları yukarıdaki değişkenleri kullanarak yazdırın.
        // Java Güzeldir 54
        System.out.println(str+" "+str2+" "+ sayi + sayi2 );

        // Java Güzeldir 9
        System.out.println(str2 +" " +str +" "+(sayi+sayi2));

        // 9 Java
        System.out.println(sayi+sayi2+" " + str2);

        // 54 Güzeldir
        System.out.println(""+sayi+sayi2+" "+ str2);

        // concat ile string birleştirme işlemi ikinci de ise bir boşluk verilmiştir.
        System.out.println(str.concat(str2));
        System.out.println(str2.concat(" "+str));


    }
}
