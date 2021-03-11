package de.thunderfrog;

public class Mitarbeiter extends Personen{

    private String jobbezeichnung;
    private Organisationen organisation;

    public Mitarbeiter(String nachname, String vorname, char geschlecht, String geburtsdatum, String jobbezeichnung, Organisationen organisation) {
        super(nachname, vorname, geschlecht, geburtsdatum);
        this.jobbezeichnung = jobbezeichnung;
        // this.organisation = organisation; So wird die Organisation nicht hochgezählt
        setOrganisation(organisation);
    }

    public Mitarbeiter(){}

    public String getJobbezeichnung() {
        return jobbezeichnung;
    }

    public void setJobbezeichnung(String jobbezeichnung) {
        this.jobbezeichnung = jobbezeichnung;
    }

    public Organisationen getOrganisation() {
        return organisation;
    }

    public void setOrganisation(Organisationen organisation) {
        /*
        *   a)	Passen Sie den Setter für Organisation, für die eine Person arbeitet so an,
        *       dass die Mitarbeiterzahl der Organisation verändert wird.
        *
        *   Jedesmal wenn ein Mitarbeiter hinzu kommt, wird der OrganisationAnzahl erhöht.
        */
        if(this.organisation != null){
            int anzahl = this.organisation.getAnzahlMitarbeiter();
            this.organisation.setAnzahlMitarbeiter(anzahl - 1);
            this.organisation.getMaListe().remove(this);
        }

        this.organisation = organisation;
        int anzahl = organisation.getAnzahlMitarbeiter();
        organisation.setAnzahlMitarbeiter(anzahl + 1);

        organisation.getMaListe().add(this);
    }

    @Override
    public String toString() {
       return getVorname() + " " + getNachname() + " | " + getGeburtsdatum() + " | " + getJobbezeichnung() + " - " + getOrganisation();
    }
}
