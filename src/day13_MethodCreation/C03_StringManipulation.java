package src.day13_MethodCreation;

public class C03_StringManipulation {
    public static void main(String[] args) {
        /*
        String methodlarini kullanarak 
            “ Java ogrenmek123 Cok guzel@ ” 
        String’ini 
            “Java ogrenmek cok guzel.” 
        sekline getirin.        
         */
        String str = " Java ogrenmek123 Cok guzel@ ";
        
        //str = str.replaceAll(" ", "qazxsw");
        str = str.replaceAll("\\d","");
        str = str.replace("@","");
        //str = str.replaceAll("\\W",""); // tüm harf/rakam dışındakilerini at.  
        str = str.replace("C","c");
        //str = str.replaceAll(" ","");
        str = str.replaceAll("qazxsw"," ");
        str = str.trim();
        System.out.println("str = " + str+".");

    }
}
