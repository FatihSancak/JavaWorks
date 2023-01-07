package src.day11_stringManipulations;

public class C01_indexOf {
    public static void main(String[] args) {
        String str = "Java öğrenmek. çok güzel";
        System.out.println(str.indexOf('ğ'));// 6
        System.out.println(str.indexOf("r"));// 7
        System.out.println(str.indexOf("j"));// -1
        System.out.println(str.indexOf("mek")); // 10

        System.out.println(str.indexOf('ğ', 6));// 1

        // stringdeki 2. ve 3. e'nin indexlerini bulunuz ?
        // 2. e'yi bulabilmek için 1. e'nin indexine ihtiyacımız var
        int ilke = str.indexOf('e');// 1. e'nin indexi
        int ikincie = str.indexOf("e",ilke+1); // 2. eNin indexi

        // 2. e var sa üçüncü e'nin olup olmadığını
        // ve varsa indexini yazıralım.
        if(ikincie==-1){
            System.out.println("verilen str da 2. e yok");
        }else{
            int ucuncue = str.indexOf("e",ikincie+1);
            System.out.println(ucuncue);
            if(ucuncue==-1){
                System.out.println("Üçüncü e yoktur");
            }else{
                System.out.println("verilen str'daki e nin indexi : " + ucuncue);
            }
        }
    }
}
