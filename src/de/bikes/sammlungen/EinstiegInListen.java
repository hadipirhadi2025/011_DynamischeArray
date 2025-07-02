package de.bikes.sammlungen;

import de.bikes.pojos.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *     ArrayList: Duplikate, Reihenfolge, get(index), remove(index)
 * </pre>
 */
public class EinstiegInListen {
    public static void main(String[] args) {
        List obst = new ObstListe();
//        obst.add("Apfel"); ist nicht mehr möglich
        Obst banane = new Obst("Banane","Spanien");
        obst.add(banane);
        obst.add(new Obst("Kiwi"));
        Obst zitrone = new Obst("Zitrone");
        obst.add(zitrone);
        System.out.println(obst);
        for (int i = 0; i < obst.size(); i++) {
            if(obst.get(i) instanceof Obst){
                Obst ausDerListe = (Obst)obst.get(i);
                System.out.print(ausDerListe.getName() + " ");
            }
            else {
                System.out.print(obst.get(i)+ " ");
            }
        }
        System.out.println();
        List nurNamen = new StringListe();
        nurNamen.add("Justus Jonas");
        Obst apfel = new Obst("Apfel");
//        nurNamen.add(apfel);

        List nurGanzZahlen = new GanzzahlListe();
        nurGanzZahlen.add(17);
//        nurGanzZahlen.add("Justus");

        List nurJButtons = new JButtonListe();
        nurJButtons.add(new JButton());
//        nurJButtons.add("Ein Name");

    }
}
