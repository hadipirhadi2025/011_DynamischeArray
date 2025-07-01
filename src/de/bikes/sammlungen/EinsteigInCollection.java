package de.bikes.sammlungen;

import java.time.chrono.IsoEra;
import java.util.ArrayList;
import java.util.Collection;


/**
 * <pre>
 *     Ein Array kann gleichartiege Elemente zusammenfassen
 *     Ein Array ist inseiner Größe nicht änderbar: .length :Kostante
 * </pre>
 *
 * Wenn dynamishce Sammlungen beraucht werden, eingnet sisch ein Array nicht
 * dynamisch: zb Kunden in unseren Projekt
 * Dynamische Sammlungen: Collection API (im java.util-Package)
 * Namensgeber: INTERFACE collection (Referenztyp)
 * Referenztypen: Collection, List, Set (später MAP)
 * Objekttypen: ArrayList, HashSet...
 *   Alle Collections (inc Set und List) haben eine add-Mehtode
 * Später: Collection mit Generics
*/
public class EinsteigInCollection {
    public static void main(String[] args) {
        String lieblingsSorte = "Eisgekülter Kaffee mit Eiswürfeln";
        Collection sorten = new ArrayList();
        System.out.println(sorten.size());
        sorten.add("Eisgekülter Kaffee mit Eiswürfeln");
        sorten.add("EisKaffee");
        System.out.println(sorten.size());
        sorten.add("Latte Macchiato");
        sorten.add("Schwartzer Kaffee");
        sorten.add("Irish Coffee");
        sorten.add(lieblingsSorte);
        System.out.println(sorten);
        sorten.remove(lieblingsSorte);//sucht nach dem ersten Objekt, das beim Vergleich mit equals true liefert
        System.out.println(sorten);

    }
}
