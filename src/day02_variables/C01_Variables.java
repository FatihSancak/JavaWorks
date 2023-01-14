package src.day02_variables;
   public class C01_Variables{
        public static void main(String[] args) {
            // Data türü    Variable İsmi     assigmnet sign       variable değeri
                int             not                 =                   60;

                int not2        =     70;
            //  variable             değer

            // Java önce değeri hesaplar sonra assign işlenmi yapar
                not2 =90;

            // yeni bir int variable oluşturalım değeri ilk iki variable'in ortalamaası olsun

                int ort = (not + not2) / 2;

            // "" içine yazılaan her sey metindir, Java " " içinde ne görürse o şekilde yazdırır.
            // eğer bir variable'in değerini yazdırıyorsanız
            // " " olmadan variable ismini yazmalısınız

                System.out.println(ort);


        }
    }