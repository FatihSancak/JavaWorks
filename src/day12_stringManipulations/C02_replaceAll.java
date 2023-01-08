package src.day12_stringManipulations;

public class C02_replaceAll {
    public static void main(String[] args) {
        String str = "1Bu2g3un Ja*va- cok g3uz/el1";
        str = str.replaceAll("\\s","qawsx");
        System.out.println(str);
        str = str.replaceAll("\\d","");
        System.out.println(str);
        str = str.replaceAll("\\W","");
        System.out.println(str);
        str = str.replace("qawsx"," ");
        System.out.println(str);
    }
}

