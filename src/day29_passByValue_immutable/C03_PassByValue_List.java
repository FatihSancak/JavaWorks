package src.day29_passByValue_immutable;

import java.util.ArrayList;
import java.util.List;

public class C03_PassByValue_List {
    public static void main(String[] args) {
        /*
        bir list olu�tural�m
        iki ayr� mthod'dan birinde
        sadece elemanlar� de�i�tirelim

        di�erinde yeni bri list atay�p
        ayn� say�da yeni eleman ekleyelim

        ve her iki method call'dan sonra kendi listemizi
        main method i�inden kontrol edelim.
         */

        List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Veli");
        list.add("Can");

        System.out.println("�lk ba�ta list :  "+list);
        //[Ali, Veli, Can]

        elemalariDegistir(list); // [O�uz, Murat, Fatih]

        System.out.println("eleman de�i�tir methodundan sonra list :  "+list);
        // [O�uz, Murat, Fatih]

        listDegistir(list); // [Nutella, �ay, �okokrem]

        System.out.println("liste  de�i�tir methodundan sonra list :  "+list);
        // [O�uz, Murat, Fatih]
    }

    public static void listDegistir(List<String> list) {
        list = new ArrayList<>();
        list.add("Nutella");
        list.add("�ay");
        list.add("�okokrem");

        System.out.println("List de�i�tir methounda list: "+ list);
        // [Nutella, �ay, �okokrem]

    }

    public static void elemalariDegistir(List<String> list) {
        list.set(0,"O�uz");
        list.set(1,"Murat");
        list.set(2,"Fatih");

        System.out.println("Eleman de�i�tir methounda list : "+ list);
        // [O�uz, Murat, Fatih]
    }
}
