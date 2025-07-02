package de.bikes.sammlungen;

import java.util.ArrayList;
import java.util.Collection;

/**
 * <pre>
 *     Ein Array kann gleichartige Elemente zusammenfassen.
 *     Ein Array ist in seiner Größe nicht änderbar: .length: Konstante
 *
 *     Wenn dynamische Sammlungen begraucht werden, eignet sich ein Array nicht
 *     dynamisch: zb Kunden in unseren Projekt
 *     Dynamische Sammlungen: Collection API (im java.util-Package)
 *     Namensgeber: INTERFACE Collection (Referenztyp)
 *     Referenztypen:Collection, List, Set (später Map)
 *     Objekttypen: ArrayList, HashSet...
 *
 *      Alle Collections (incl Set und List) haben eine add-Methode
 *     Später: Collections mit Generics
 * </pre>
 */
public class EinstiegInCollection {
    public static void main(String[] args) {
        String lieblingsSorte = "Eisgekühler Kaffee mit Eiswürfeln";
        Collection sorten = new ArrayList();
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

    }
}
