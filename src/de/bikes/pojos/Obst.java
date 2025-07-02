package de.bikes.pojos;

import java.util.Objects;

public class Obst {
    private String name;
    private String herkunftsLand;

    public Obst(String name) {
        this.name = name;
        herkunftsLand = "Irgendwo auf der Erde";
    }

    public Obst(String name, String herkunftsLand) {
        this.name = name;
        this.herkunftsLand = herkunftsLand;
    }

    public String getName() {
        return name;
    }

    public String getHerkunftsLand() {
        return herkunftsLand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHerkunftsLand(String herkunftsLand) {
        this.herkunftsLand = herkunftsLand;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Obst obst = (Obst) o;
        return Objects.equals(name, obst.name) && Objects.equals(herkunftsLand, obst.herkunftsLand);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(herkunftsLand);
        return result;
    }

    @Override
    public String toString() {
        return "Obst{" +
                "name='" + name + '\'' +
                ", herkunftsLand='" + herkunftsLand + '\'' +
                '}';
    }
}
