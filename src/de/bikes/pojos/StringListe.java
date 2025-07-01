package de.bikes.pojos;

import java.util.ArrayList;

public class StringListe extends ArrayList {
    @Override
    public boolean add(Object o) {
        if (o instanceof String){
            return super.add(o);
        }else {
            throw new RuntimeException("Nur Strings");
        }
    }
}
