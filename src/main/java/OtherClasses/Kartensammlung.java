package OtherClasses;

import java.util.Date;

public class Kartensammlung implements KartenStrukturobjekt{
    private String titel = null;
    private Date erstelldatum = null;
    private String modul = null;
    private String ersteller = null;
    private int kartenanzahl;

    public Kartensammlung(String titel, Date erstelldatum, String modul, String ersteller) {
        this.titel = titel;
        this.erstelldatum = erstelldatum;
        this.modul = modul;
        this.ersteller = ersteller;
        this.kartenanzahl = 0;
    }

    @Override
    public void erstellen() {

    }

    @Override
    public void loeschen() {

    }

    @Override
    public void umbenennen() {

    }

    public void exportieren(){
        //
    }

    public void importieren(){
        //
    }

    public void ueben(){
        //
    }
}
