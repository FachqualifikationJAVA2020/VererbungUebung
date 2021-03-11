package de.thunderfrog;

import java.util.Objects;

public abstract class Personen {

    private String nachname, vorname;
    private char geschlecht;
    private String geburtsdatum;

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public char getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(char geschlecht) {
        this.geschlecht = geschlecht;
    }

    public String getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(String geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public Personen(String nachname, String vorname, char geschlecht, String geburtsdatum) {
        this.nachname = nachname;
        this.vorname = vorname;
        this.geschlecht = geschlecht;
        this.geburtsdatum = geburtsdatum;
    }

    public Personen(){}

    // AUTO-GENERATE equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personen personen = (Personen) o;
        return geschlecht == personen.geschlecht && Objects.equals(nachname, personen.nachname) && Objects.equals(vorname, personen.vorname) && Objects.equals(geburtsdatum, personen.geburtsdatum);
    }

}
