package OtherClasses;

import java.util.Date;

public class Karte implements KartenStrukturobjekt{
    private String titel = null;
    private Date erstelldatum = null;
    private String modul = null;
    private String ersteller = null;
    private boolean kannIch;
    private String vorderseite;
    private String rueckseite;

    //Konstruktor


    public Karte(String titel, Date erstelldatum, String modul, String ersteller, String vorderseite, String rueckseite) {
        this.titel = titel;
        this.erstelldatum = erstelldatum;
        this.modul = modul;
        this.ersteller = ersteller;
        this.kannIch = false;
        this.vorderseite = vorderseite;
        this.rueckseite = rueckseite;
    }

    @Override
    public void erstellen() {
        //
    }

    @Override
    public void loeschen() {
        //
    }

    @Override
    public void umbenennen() {
        //
    }

    public void karteBearbeiten(){
        //
    }

}
