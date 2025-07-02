package com.customesrs.kunden;

import java.time.LocalDate;
import java.util.Objects;

public class Kunde {
    private String vorname;
    private String nachname;
    private LocalDate geburtstag;
    private double verfuegbaresGeld;

    public Kunde(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
        geburtstag = LocalDate.of(1970,1,1);
        verfuegbaresGeld = 1001.22;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public LocalDate getGeburtstag() {
        return geburtstag;
    }

    public void setGeburtstag(LocalDate geburtstag) {
        this.geburtstag = geburtstag;
    }

    public double getVerfuegbaresGeld() {
        return verfuegbaresGeld;
    }

    public void setVerfuegbaresGeld(double verfuegbaresGeld) {
        this.verfuegbaresGeld = verfuegbaresGeld;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Kunde kunde = (Kunde) o;
        return Double.compare(verfuegbaresGeld, kunde.verfuegbaresGeld) == 0 && Objects.equals(vorname, kunde.vorname) && Objects.equals(nachname, kunde.nachname) && Objects.equals(geburtstag, kunde.geburtstag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vorname, nachname, geburtstag, verfuegbaresGeld);
    }

    @Override
    public String toString() {
        return "Kunde{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", geburtstag=" + geburtstag +
                ", verfuegbaresGeld=" + verfuegbaresGeld +
                '}';
    }
}
