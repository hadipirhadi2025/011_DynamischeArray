package de.bikes.sammlungen;

import de.bikes.pojos.Obst;
import de.bikes.pojos.ObstListe;
import de.bikes.pojos.StringListe;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *     ArrayLst : Duplikate, Reihenfolge, get(index
 * </pre>
 */
public class EinsteigInListen {
    public static void main(String[] args) {
        List obst = new ObstListe();
        //eception !!!!
        //obst.add("Apfel");
        obst.add(new Obst("Banane"));
        obst.add(new Obst("Kiwi"));
        System.out.println(obst);
        for (int i = 0; i < obst.size(); i++) {
            if(obst.get(i) instanceof Obst){
                Obst ausDerListe = (Obst) obst.get(i);
                System.out.print(ausDerListe.getName() + " ");
            }
            else {
                System.out.print(obst.get(i) + " ");
            }
        }
        System.out.println();


        List nurNamen = new StringListe();
        nurNamen.add("Apfel");
        Obst apfel = new Obst("Apfel");
        nurNamen.add(apfel);
    }
}
