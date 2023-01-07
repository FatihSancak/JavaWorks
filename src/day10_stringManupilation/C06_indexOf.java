package src.day10_stringManupilation;

public class C06_indexOf {
    public static void main(String[] args) {
        String str = "Java öğren. işi kap";
        System.out.println(str.indexOf('a'));
        System.out.println(str.indexOf("ğ"));
        System.out.println(str.indexOf('t'));
        System.out.println(str.indexOf("Java"));

        String str5="dsfhaskjhfkjls hfkjlshdfkjkdjsfha jkafhsdjkfhsadjlhfsadhf";

        //str5'de p harfi varmı dır_
        if(str5.indexOf('=')==-1){ // -1 ile string içinde olup olmadığını sorguluyorz.
            System.out.println("Str5'de istenilen karakter kullanılamamış");
        }else{
            System.out.println("Str5'de istenilen karakter kullanılmıştır.");
        }
    }
}