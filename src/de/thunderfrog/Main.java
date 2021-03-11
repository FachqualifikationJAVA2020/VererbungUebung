package de.thunderfrog;

public class Main {

    public static void main(String[] args) {

        Organisationen ms = new Organisationen();
        ms.setOrganisationsName("Mircosoft");
        System.out.println(ms.getAnzahlMitarbeiter());

        Mitarbeiter klaus = new Mitarbeiter();
        klaus.setVorname("Klaus");
        klaus.setNachname("Müller");
        klaus.setGeburtsdatum("01.01.1972");
        klaus.setGeschlecht('m');
        klaus.setJobbezeichnung("Bauer");
        klaus.setOrganisation(ms);

        System.out.println(ms.getAnzahlMitarbeiter());

        Mitarbeiter klara = new Mitarbeiter("Sprudel","Klara",'w',"01.01.1990","Müllerin",ms);

        System.out.println(ms.getAnzahlMitarbeiter());

        System.out.println(ms.getMaListe());

        Organisationen mg = new Organisationen();
        mg.setOrganisationsName("Moogle");

        klaus.setOrganisation(mg);

        System.out.println(ms.getMaListe());
        System.out.println(mg.getMaListe());




    }
}
