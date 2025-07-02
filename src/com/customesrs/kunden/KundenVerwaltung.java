package com.customesrs.kunden;

import java.util.ArrayList;
import java.util.List;

public class KundenVerwaltung {

    private Kunde[] alleKunde  = new Kunde[100];
//    private List vieleKunden = new ArrayList(); Leider auch Betrüger möglcih
    private List<Kunde> vieleKunden = new ArrayList<>(); // Nur Kunden sind möglich

    public void aufnehmenNeuerKunde(Kunde neukunde){
        vieleKunden.add(neukunde);
    }

//    public List getVieleKunden() {
//        return vieleKunden;
//    }

    public List<Kunde> getVieleKunden() {
        return vieleKunden;
    } //Jetzt eine Liste, die kontrolliert: Nur Kunden dürfen aufgenommen werden
}
