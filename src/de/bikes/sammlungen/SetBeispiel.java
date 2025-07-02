package de.bikes.sammlungen;
import de.bikes.pojos.Schokolade;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetBeispiel {
    public static void main(String[] args) {
        System.out.println("--- Map Beispiel mit String als Key und Schokolade als Value ---");

        // Bauen ein HashMap mit String als Key و Schokolade als Value
        Map<String, Schokolade> meineSchokoMap = new HashMap<>();

        // 1. put Methode
        System.out.println("--- put Methode ---");
        meineSchokoMap.put("Milka", new Schokolade("Milka Alpenmilch", 30));
        meineSchokoMap.put("Ritter", new Schokolade("Ritter Sport Nuss", 40));
        meineSchokoMap.put("Lindt", new Schokolade("Lindt Excellence", 70));
        meineSchokoMap.put("Ritter", new Schokolade("Ritter Sport Marzipan", 50)); // austausch ersetz

        // 4.  size Methode
        System.out.println("Aktuelle Größe der Map: " + meineSchokoMap.size()); // 3

        // 2.  get Methode
        System.out.println("\n--- get Methode ---");
        Schokolade milka = meineSchokoMap.get("Milka");
        System.out.println("Schokolade für 'Milka': " + milka);
        Schokolade nichtVorhanden = meineSchokoMap.get("Nestle");
        System.out.println("Schokolade für 'Nestle' (nicht vorhanden): " + nichtVorhanden); // kein dann null

        // 3. remove Methode
        System.out.println("\n--- remove Methode ---");
        System.out.println("Entferne 'Milka': " + meineSchokoMap.remove("Milka")); //  Milka return als Object
        System.out.println("Versuche, nicht vorhandenen Key zu entfernen ('Nestle'): " + meineSchokoMap.remove("Nestle")); // null
        System.out.println("Größe der Map nach dem Entfernen: " + meineSchokoMap.size()); // 2

        // 5. for-loop show all
        System.out.println("\n--- Alle Einträge in der Map (mit entrySet) ---");
        // entrySet() ein Set als Map.Entry<K, V> return
        Set<Map.Entry<String, Schokolade>> eintraege = meineSchokoMap.entrySet();
        for (Map.Entry<String, Schokolade> eintrag : eintraege) {
            System.out.println("Key: " + eintrag.getKey() + ", Value: " + eintrag.getValue());
        }

        System.out.println("\n--- Alle Keys in der Map (mit keySet) ---");
        for (String key : meineSchokoMap.keySet()) {
            System.out.println("Key: " + key);
        }

        System.out.println("\n--- Alle Values in der Map (mit values) ---");
        for (Schokolade schokolade : meineSchokoMap.values()) {
            System.out.println("Value: " + schokolade);
        }

        System.out.println("--- Ende Map Beispiel ---");
    }
}
