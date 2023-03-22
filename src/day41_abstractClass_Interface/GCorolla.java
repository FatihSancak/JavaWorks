package src.day41_abstractClass_Interface;

public class GCorolla extends EToyota{
    /*
    Corolla class'ýnýn 2 tane parent'i var
    Corolla parent'larýnýn ikisinin de standartlarýna (abstract method)
    uymak zorundadýr.

    Concrete bir class parent'ý olan tüm abstract class'larda
    abstract olan methodlarý implement etmek ZORUNDADIR

    Ancak parent silsilesinde override edilerek concrete yapýlan method'larý
    override etmek zorunda DEÐÝLDÝR

     */

    @Override
    protected void yakit() {

    }

    @Override
    protected void kaporta() {

    }

}
