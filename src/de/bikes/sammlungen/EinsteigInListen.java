package de.bikes.sammlungen;

import de.bikes.pojos.*;

import javax.swing.*;
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
        nurNamen.add("Justos Junas");
        Obst apfel = new Obst("Apfel");
        //nurNamen.add(apfel);

        List nurGanzZahlen = new GanzzahlListe();
        nurGanzZahlen.add(17);
       // nurGanzZahlen.add("Justus");

        List nurJButtons = new JButtonListe();
        nurJButtons.add(new JButton());
//        nurJButtons.add("Ein Name");

    }
}
