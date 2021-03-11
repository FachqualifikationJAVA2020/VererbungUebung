package de.thunderfrog;


import java.util.ArrayList;

public class Organisationen {

    private String organisationsName;
    private int anzahlMitarbeiter;

    private ArrayList<Mitarbeiter> maListe = new ArrayList<>();

    public int getAnzahlMitarbeiter() {
        return anzahlMitarbeiter;
    }

    public void setAnzahlMitarbeiter(int anzahlMitarbeiter) {
        this.anzahlMitarbeiter = anzahlMitarbeiter;
    }

    public String getOrganisationsName() {
        return organisationsName;
    }

    public void setOrganisationsName(String organisationsName) {
        this.organisationsName = organisationsName;
    }

    public ArrayList<Mitarbeiter> getMaListe() {
        return maListe;
    }

    public void setMaListe(ArrayList<Mitarbeiter> maListe) {
        this.maListe = maListe;
    }

    // Vergleichen das es nur eine Organisation gibt
    @Override
    public boolean equals(Object o) {
        if (o instanceof Organisationen){
            Organisationen org = (Organisationen) o;
            if(this.organisationsName.equals(org.organisationsName)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return organisationsName;
    }
}
