package src.day42_abstractClass_Interfaces;

public interface I03_Interfaces {
    int SAYI = 20;
    /*
    Interfacelerdaki t�m variable'lar public statik ve final'd�r
    Bu sebeple sonradan de�er atamas� yap�lamayaca��ndan tan�mlama
    yap�l�rken mutlaka de�er atanmal�d�r.

    int sayi; // Buna m�saade etmez.

    Interface, bir class'� parent edinemez.
     */

    void yakit();

    /*
    Interface i�ersindeki her method
    public ve abstract �zelliklere sahiptir.

    abstract bir mnethod'un body'si olmas� m�mk�n de�ildir.
    Java sonradan developer'lar�n iste�i �zerine k�smi bir
    update yapm��t�r.

    bir interface'e sonradan bir abstract method eklerseniz
    o interace'ei daha �nce implement etmi� t�m class'lara gidip
    hepsinde yeni eklenen method'u override etmeniz gerekir.
    bu da b�y�k ve eskiden gelen projeler iin �ok zor bir i�lemdir.

    Bunun i�in java, Java 8'den sonra interface'lere sonradan
    body'si olan method'lar eklenmesine izin vermi�tir.

    Bu method'lar�n body'si olsa da Interface'in yap�s� gere�i
    bu method'lara concrete denmez
    body'si olan bu method'lar istisna olarak kabul edilebilir.

     */

    public void motor();

    public abstract void teker();

}
