package de.thunderfrog;

public class Kunden extends Personen{
    private int kundennummer;

    public Kunden(String nachname, String vorname, char geschlecht, String geburtsdatum, int kundennummer) {
        super(nachname, vorname, geschlecht, geburtsdatum);
        this.kundennummer = kundennummer;
    }

    public Kunden() {
        super();
    }

    public int getKundennummer() {
        return kundennummer;
    }

    public void setKundennummer(int kundennummer) {
        this.kundennummer = kundennummer;
    }

    @Override
    public String toString() {
        return getVorname() + " " + getNachname() + " | " + getGeburtsdatum();
    }
}
