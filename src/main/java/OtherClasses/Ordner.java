package OtherClasses;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Ordner extends Strukturobjekt {
    private String titel = null;
    private Date erstelldatum = null;
    private int kartensammlungsanzahl;

    //Konstruktor


    public Ordner(String titel) {
        super.titel = titel;
        this.erstelldatum = getHeute();
        this.kartensammlungsanzahl = 0;
    }

    @Override
    public void erstellen() {

        //Input ------Frontend implementieren------
        //Kommunikation GUI
        // Abfrage Titel -
        String instanzTitel = "placeholder";


        //Konstruktor-Aufruf --> wie weist man den Inhalt der Variable automatisch dem Objektnamen zu?
        Ordner placeholder = new Ordner(instanzTitel);


        //Bestätigung ------Frontend implementieren------

    }

    @Override
    public void loeschen() {

        //Input ------Frontend implementieren------
        //Kommunikation GUI
        // Abfrage welcher Ordner


        // Verarbeitung ------ Backend implementieren------
        //Konstruktor-Aufruf --> wie weist man den Inhalt der Variable automatisch dem Objektnamen zu?
        //AusgewählterOrdner = 0;
        // System.gc(); Garbage collection direkt aufrufen oder lieber sein lassen?



        //Bestätigung ------Frontend implementieren------

    }

    @Override
    public void umbenennen() {

    }

    public void verschieben(){
        //
    }


}
