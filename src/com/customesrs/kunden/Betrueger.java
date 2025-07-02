package com.customesrs.kunden;

import java.util.Objects;

public class Betrueger {
    private String name;

    public Betrueger(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Betrueger betrueger = (Betrueger) o;
        return Objects.equals(name, betrueger.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "Betrueger{" +
                "name='" + name + '\'' +
                '}';
    }
}
