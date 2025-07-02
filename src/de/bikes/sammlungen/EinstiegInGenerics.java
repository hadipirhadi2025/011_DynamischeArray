package de.bikes.sammlungen;

import de.bikes.pojos.Obst;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *     Listen wie: StringListe, ObstListe, FahrradListe, JButtonListe....müssen für jede Klasse neu erstellt werden
 *     Kein Hilfestellung durch Compiler
 *
 *     Lösung: Generics: Interface/Klassen werden als Vorlage für Interfaces und Klasse erstellt:
 *     zb MeinKlasse<T>{ } ist keine Klasse, sondern ein Template für Klassen wie MeineKlasse<Obst>{}
 *     Generics unter anderem in der Collection API
 *     List<E> ins ein Template für typisierte List Interfaces
 * </pre>
 */
public class EinstiegInGenerics {
    public static void main(String[] args) {
        List<String> sicherNurStrings = new ArrayList<>();
        sicherNurStrings.add("Justus Jonas");
        Obst apfel = new Obst("Apfel");
//        sicherNurStrings.add(apfel);

        List<Obst> sicherNurObst = new ArrayList<>();
        sicherNurObst.add(apfel);
//        sicherNurObst.add("Justus");
        for (int i = 0; i <sicherNurObst.size() ; i++) {
            System.out.println(sicherNurObst.get(i).getHerkunftsLand());
        }
        //sicherNurObst.forEach(Obst dasLeckerObst -> System.out.println(dasLeckerObst.getName()));
        sicherNurObst.forEach(dasLeckerObst -> System.out.println(dasLeckerObst.getName()));
    }
}
