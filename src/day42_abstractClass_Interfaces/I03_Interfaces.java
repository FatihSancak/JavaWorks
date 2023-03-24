package src.day42_abstractClass_Interfaces;

public interface I03_Interfaces {
    int SAYI = 20;
    /*
    Interfacelerdaki tüm variable'lar public statik ve final'dýr
    Bu sebeple sonradan deðer atamasý yapýlamayacaðýndan tanýmlama
    yapýlýrken mutlaka deðer atanmalýdýr.

    int sayi; // Buna müsaade etmez.

    Interface, bir class'ý parent edinemez.
     */

    void yakit();

    /*
    Interface içersindeki her method
    public ve abstract özelliklere sahiptir.

    abstract bir mnethod'un body'si olmasý mümkün deðildir.
    Java sonradan developer'larýn isteði üzerine kýsmi bir
    update yapmýþtýr.

    bir interface'e sonradan bir abstract method eklerseniz
    o interace'ei daha önce implement etmiþ tüm class'lara gidip
    hepsinde yeni eklenen method'u override etmeniz gerekir.
    bu da büyük ve eskiden gelen projeler iin çok zor bir iþlemdir.

    Bunun için java, Java 8'den sonra interface'lere sonradan
    body'si olan method'lar eklenmesine izin vermiþtir.

    Bu method'larýn body'si olsa da Interface'in yapýsý gereði
    bu method'lara concrete denmez
    body'si olan bu method'lar istisna olarak kabul edilebilir.

     */

    public void motor();

    public abstract void teker();

}
