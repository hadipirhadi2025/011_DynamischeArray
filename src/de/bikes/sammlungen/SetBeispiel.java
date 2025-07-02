package de.bikes.sammlungen;
import de.bikes.pojos.Schokolade;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetBeispiel {
    public static void main(String[] args) {
        System.out.println("--- Map Beispiel mit String als Key und Schokolade als Value ---");

        // ایجاد یک HashMap با String به عنوان Key و Schokolade به عنوان Value
        Map<String, Schokolade> meineSchokoMap = new HashMap<>();

        // 1. استفاده از put Methode
        System.out.println("--- put Methode ---");
        meineSchokoMap.put("Milka", new Schokolade("Milka Alpenmilch", 30));
        meineSchokoMap.put("Ritter", new Schokolade("Ritter Sport Nuss", 40));
        meineSchokoMap.put("Lindt", new Schokolade("Lindt Excellence", 70));
        meineSchokoMap.put("Ritter", new Schokolade("Ritter Sport Marzipan", 50)); // جایگزین قبلی Ritter می‌شود

        // 4. استفاده از size Methode
        System.out.println("Aktuelle Größe der Map: " + meineSchokoMap.size()); // باید 3 باشد

        // 2. استفاده از get Methode
        System.out.println("\n--- get Methode ---");
        Schokolade milka = meineSchokoMap.get("Milka");
        System.out.println("Schokolade für 'Milka': " + milka);
        Schokolade nichtVorhanden = meineSchokoMap.get("Nestle");
        System.out.println("Schokolade für 'Nestle' (nicht vorhanden): " + nichtVorhanden); // باید null باشد

        // 3. استفاده از remove Methode
        System.out.println("\n--- remove Methode ---");
        System.out.println("Entferne 'Milka': " + meineSchokoMap.remove("Milka")); // باید شیء Milka را برگرداند
        System.out.println("Versuche, nicht vorhandenen Key zu entfernen ('Nestle'): " + meineSchokoMap.remove("Nestle")); // باید null باشد
        System.out.println("Größe der Map nach dem Entfernen: " + meineSchokoMap.size()); // باید 2 باشد

        // 5. نمایش همه ورودی‌ها در یک for-loop
        System.out.println("\n--- Alle Einträge in der Map (mit entrySet) ---");
        // entrySet() یک Set از Map.Entry<K, V> برمی‌گرداند
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
