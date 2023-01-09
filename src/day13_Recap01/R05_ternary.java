package src.day13_Recap01;

public class R05_ternary {
    public static void main(String[] args) {
        /*
        Ternary kullanarak bir kod yazın fiyat isminde bir variable tanımlayın. eger fiyat
        10 dan az ise "ucuz",
        10 ile 20 arasında ise "normal",
        20 ve 20'den büyükse "pahalı"
        yazsın
         */

        int fiyat =20;

        // IF ELSE STATEMENT
        if (fiyat<10){
            System.out.println("ucuz");
        }else if(fiyat<20){
            System.out.println("normal");
        }else {
                System.out.println("pahalı");
        }

        //TERNARY
        String result = fiyat<10?"ucuz":fiyat<20?"normal":"pahalı";


        System.out.println(result);
    }
}
