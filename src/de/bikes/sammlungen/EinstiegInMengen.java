package de.bikes.sammlungen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * <pre>
 *     Verwendet als Objekttyp ein HashSet
 *     HashSet: keine Reihenfolge und keine Duplikate
 *     Duplikate: beide Elemente liefern beim Vergleich mit equals: true
 * </pre>
 */
public class EinstiegInMengen {
    public static void main(String[] args) {
        String lieblingsSorte = "Eisgekühler Kaffee mit Eiswürfeln";
        Collection sorten = new HashSet();
        System.out.println(sorten.size());
        sorten.add("Eisgekühler Kaffee mit Eiswürfeln");
        sorten.add("Eiskaffee");
        System.out.println(sorten.size());
        sorten.add("Latte Macchiato");
        sorten.add("Schwarzer Kaffee");
        sorten.add("Irish Coffee");
        sorten.add("Eiskaffee");
        sorten.add(lieblingsSorte);
        System.out.println(sorten);
        sorten.remove(lieblingsSorte); //sucht nach dem ersten Objekt, das beim Vergleich mit equals true liefert
        System.out.println(sorten);
        boolean wurdeZugefuegt = sorten.add("Eiskaffee");
        System.out.println("Mehr Eiskaffee? " + wurdeZugefuegt);
        boolean wurdeEntfernt = sorten.remove(lieblingsSorte);
        System.out.println("Wurde die Lieblingssorte entfernt: " + wurdeEntfernt);
    }
}
