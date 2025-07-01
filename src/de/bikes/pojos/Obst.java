package de.bikes.pojos;

public class Obst{
    private String name;
    private String herkunftsLand;

    public Obst(String name) {
        this.name = name;
        herkunftsLand = "Irgendwo auf der Erde";
    }

    public Obst(String herkunftsLand, String name) {
        this.herkunftsLand = herkunftsLand;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHerkunftsLand() {
        return herkunftsLand;
    }

    public void setHerkunftsLand(String herkunftsLand) {
        this.herkunftsLand = herkunftsLand;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Obst obst = (Obst) o;
        return name.equals(obst.name) && herkunftsLand.equals(obst.herkunftsLand);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + herkunftsLand.hashCode();
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
