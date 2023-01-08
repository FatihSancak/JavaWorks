package src.day12_stringManipulations;

public class C01_replace {
    public static void main(String[] args) {

        String str = " Bu gün ha va çok güz el  ";

        System.out.println(str.replace(" ", ""));
        System.out.println(str.replace("h", "J").replace(" ", ""));
        System.out.println(str.replace("güz el", "harika"));

        // cümleyi replace kullanarak "Bugün hava çok güzel" yapalım
        str = str.replace(" Bu gün", "Bugün")
                .replace("ha va","Java")
                .replace("güz el", "güzel");
        System.out.println(str);
        System.out.println(str.replace(' ', '_')); ;
    }
}
