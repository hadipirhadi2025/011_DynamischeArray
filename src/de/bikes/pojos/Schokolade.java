package de.bikes.pojos;

public class Schokolade {
    private String name;
    private int kakaoAnteil; // percentage

    public Schokolade(String name, int kakaoAnteil) {
        this.name = name;
        this.kakaoAnteil = kakaoAnteil;
    }

    public String getName() {
        return name;
    }

    public int getKakaoAnteil() {
        return kakaoAnteil;
    }

    //console to string
    @Override
    public String toString() {
        return "Schokolade [Name=" + name + ", KakaoAnteil=" + kakaoAnteil + "%]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Schokolade that = (Schokolade) o;
        return kakaoAnteil == that.kakaoAnteil && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + kakaoAnteil;
        return result;
    }
}
