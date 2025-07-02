package de.bikes.pojos;

import java.util.ArrayList;

public class GanzzahlListe extends ArrayList {
    @Override
    public boolean add(Object o) {
        if(o instanceof Integer) {
            return super.add(o);
        }else{
            throw new RuntimeException("Nur ganze Zahlen");
        }
    }
}