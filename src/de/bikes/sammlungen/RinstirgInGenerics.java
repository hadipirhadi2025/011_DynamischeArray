package de.bikes.sammlungen;


import de.bikes.pojos.Obst;

import java.util.ArrayList;
import java.util.List;

/**
 * Lste wie : StringListe, ObsListe, FahhradListe, JButtonsListe ... müsste für jede Klasse neu erstellt werden
 * Kein Hilfestellung durch Compiler
 *
 * Lösung:Generic: Interface/Klassen werden als Vorlage für Interfaces und Klasse erstellt:
 * zb MeinKlasse<T>{} ist keine Klasse , sondern ein Teplate für Klasse wie MeinKlasse<obst>{}
 * Generics unter anderem in der Collwction API
 * List<E> ins ein Template für typisierte List Interfaces
 *
 */
public class RinstirgInGenerics {
    public static void main(String[] args) {
        List<String> sischerNurStrings = new ArrayList<>();
        sischerNurStrings.add("Justus Jonas");
        Obst apfel = new Obst("Apfel");
        //sischerNurStrings.add(apfel);

        List<Obst> sischerNurObst = new ArrayList<>();
        sischerNurObst.add(apfel);
        //sischerNurObst.add("Justus");

        for (int i = 0; i < sischerNurObst.size(); i++) {
            System.out.println(sischerNurObst.get(i).getHerkunftsLand());
        }
        sischerNurObst.forEach(dasLeckerObst -> System.out.println(dasLeckerObst.getName()));
    }
}
