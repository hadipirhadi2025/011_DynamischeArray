package de.bikes.pojos;

import java.util.ArrayList;

public class ObstListe extends ArrayList {
    @Override
    public boolean add(Object o) {
        if(o instanceof  Obst) {
            return super.add(o);
        }else {
            throw new RuntimeException("Hier nur Obst!");
        }
    }
}
