package OtherClasses;

import java.util.Date;

public class Kartensammlung extends Strukturobjekt {

    private String modul = null;
    private String ersteller = null;
    private int kartenanzahl;

    public Kartensammlung(String titel, String modul, String ersteller) {
        super.titel = titel;
        super.erstelldatum = getHeute();
        this.modul = modul;
        this.ersteller = ersteller;
        this.kartenanzahl = 0;
    }

    @Override
    public void erstellen() {

        //Input ------Frontend implementieren------
        //Kommunikation GUI
        // Abfragen
        String instanzTitel = "placeholder";
        String instanzModul = "placeholder";
        String instanzErsteller = "placeholder";                //gegen User ersetzen ... sodass automatisch der user der gerade aktiv ist zum ersteller wird


        // Verarbeitung ------ Backend implementieren------
        //Konstruktor-Aufruf --> wie weis man den Inhalt der Variable automatisch dem Objektnamen zu?
        Kartensammlung placeholder = new Kartensammlung(instanzTitel, instanzModul, instanzErsteller);


        //Bestätigung ------Frontend implementieren------

    }

    @Override
    public void loeschen() {

        //Input ------Frontend implementieren------
        //Kommunikation GUI
        // Abfrage welche Kartensammlung


        // Verarbeitung ------ Backend implementieren------
        //Alle Karten aus der Kartensammlung = 0;
        //AusgewählteKartensammlung = 0;
        // System.gc(); Garbage collection direkt aufrufen oder lieber sein lassen?



        //Bestätigung ------Frontend implementieren------

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
