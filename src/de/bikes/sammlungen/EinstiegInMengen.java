package de.bikes.sammlungen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * <pre>
 *     Verwendet als Objecttyp ein HashSet
 *     HashSet: keine Reihnfolge und keine Duplikate
 *     Duplikate: beide Elemente liefern beim Vergleich mit equals: true
 * </pre>
 */
public class EinstiegInMengen {
    public static void main(String[] args) {
        String lieblingsSorte = "Eisgekülter Kaffee mit Eiswürfeln";
        Collection sorten = new HashSet();
        System.out.println(sorten.size());
        sorten.add("Eisgekülter Kaffee mit Eiswürfeln");
        sorten.add("EisKaffee");
        System.out.println(sorten.size());
        sorten.add("Latte Macchiato");
        sorten.add("Schwartzer Kaffee");
        sorten.add("Irish Coffee");
        System.out.println(sorten);
        sorten.add(lieblingsSorte);
        System.out.println(sorten);
        sorten.remove(lieblingsSorte);//sucht nach dem ersten Objekt, das beim Vergleich mit equals true liefert
        System.out.println(sorten);
        boolean wurdeZugefuegt = sorten.add("Eiskaffee");
        System.out.println("Mehr Eiskaffee" + wurdeZugefuegt);
    }
}
