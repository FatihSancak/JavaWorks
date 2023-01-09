package src.day14_Recap02;

public class R04_KanBagisiYasAraligi {
    public static void main(String[] args) {
        /*
        Kullanıcıdan yaşını ve kilosunu alın
        18 yaşından küçük ise kan bağışı yapamaz
        18 yaşından büyük ve 50 kilodan hafif ise kan bağışı yapamaz
        18 yaşından büyük ve 50 kilodan ağır ise kan bağışı yapabilir
         */

        int yas = 18 ;
        double kilo = -50;

        if(yas>0 && yas<18){
            System.out.println("Kan bağışını yaşınız küçük olmasından dolayı yapamazsınız");
        }else {
            if(kilo<50){
                System.out.println("Her ne kadar yaşınız kan bağışı için uygun olsada" +
                        " kilonuz kan bağışına uygun değildi");
            }else{
                System.out.println("Kan bağışı yapabilirsiniz.");
            }
        }
    }
}
