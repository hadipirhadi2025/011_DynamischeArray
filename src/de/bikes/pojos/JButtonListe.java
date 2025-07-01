package de.bikes.pojos;

import javax.swing.*;
import java.util.ArrayList;

public class JButtonListe extends ArrayList {
    @Override
    public boolean add(Object o) {
        if (o instanceof JButton) {
            return super.add(o);
        } else {
            throw new RuntimeException("Nur ganze JButtons");
        }
    }
}
