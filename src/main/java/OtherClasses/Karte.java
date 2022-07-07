package OtherClasses;

import java.util.Date;

public class Karte extends Strukturobjekt {

    private String modul = null;
    private String ersteller = null;
    private boolean kannIch;
    private String vorderseite;
    private String rueckseite;

    //Konstruktor


    public Karte(String titel, Date erstelldatum, String modul, String ersteller, String vorderseite, String rueckseite) {
        super.titel = titel;
        super.erstelldatum = getHeute();
        this.modul = modul;
        this.ersteller = ersteller;
        this.kannIch = false;
        this.vorderseite = vorderseite;
        this.rueckseite = rueckseite;
    }

    @Override
    public void erstellen() {
        //Input ------Frontend implementieren------
        //Kommunikation GUI
        // Abfrage Titel -
        String instanzTitel = "placeholder";

        // Verarbeitung ------ Backend implementieren------
        //Konstruktor-Aufruf --> wie weis man den Inhalt der Variable automatisch dem Objektnamen zu?
        Ordner placeholder = new Ordner(instanzTitel);


        //Bestätigung ------Frontend implementieren------
    }

    @Override
    public void loeschen() {

        // Input ------Frontend implementieren------
        // Kommunikation GUI
        // Abfrage welche Karte



        // Verarbeitung ------ Backend implementieren------
        // AusgewählteKarte = 0;
        // System.gc(); Garbage collection direkt aufrufen oder lieber sein lassen?



        // Bestätigung ------Frontend implementieren------

    }

    @Override
    public void umbenennen() {
        //
    }

    public void karteBearbeiten(){
        //
    }

}
