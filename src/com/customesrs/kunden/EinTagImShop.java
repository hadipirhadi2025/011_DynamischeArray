package com.customesrs.kunden;

import java.util.ArrayList;
import java.util.List;

public class EinTagImShop {
    public static void main(String[] args) {
        Kunde justus = new Kunde("Justus","Jonas");
        Betrueger ferengi = new Betrueger("Ferengi");
        KundenVerwaltung verwaltung = new KundenVerwaltung();
        List<Kunde> meineKunde = verwaltung.getVieleKunden();
        meineKunde.add(justus);
        System.out.println(meineKunde);

//        meineKunde.add(ferengi);//DAS IST NICHT GEWÜNSCHT!
        //Mit <Kunde> auch nicht möglich
        System.out.println(meineKunde);

        for(Kunde kunde:meineKunde){
            System.out.println("Der Kunde " + kunde.getNachname() + " hat " + kunde.getVerfuegbaresGeld() + " €");
        }
        List<Betrueger> vorsicht = new ArrayList<>();
        vorsicht.add(ferengi);
//        vorsicht.add(justus);
        for(Betrueger schlingel : vorsicht){
            System.out.println("Erwischt! " + schlingel.getName() + " wird hier nicht bedient!");
        }

        List<String> kundenNamen = new ArrayList<>();
        for(Kunde kunde : meineKunde){
            kundenNamen.add(kunde.getVorname() + " " + kunde.getNachname());
        }
        for (int i = 0; i < meineKunde.size(); i++) {
            Kunde kunde = meineKunde.get(i);
            System.out.println("Der Kunde " + kunde.getNachname() + " hat " + kunde.getVerfuegbaresGeld() + " €");
        }
        System.out.println(kundenNamen);
    }
}
