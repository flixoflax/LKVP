package OtherClasses;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Ordner implements Strukturobjekt{
    private String titel = null;
    private Date erstelldatum = null;
    private int kartensammlungsanzahl;

    //Konstruktor


    public Ordner(String titel) {
        this.titel = titel;
        //Datum ermitteln, nachher besser outsourcen -- Idee abstrakte Klasse anstelle der Interfaces ... als getDate Methode auslagern
        SimpleDateFormat dtf = new SimpleDateFormat("yyyy/MM/dd");
        Calendar calendar = Calendar.getInstance();
        Date heute = calendar.getTime();
        //Datum & Kartensammlungsanzahl zuweisen
        this.erstelldatum = heute;
        this.kartensammlungsanzahl = 0;
    }

    @Override
    public void erstellen() {

        //Input ------Frontend implementieren------
        //Kommunikation GUI
        // Abfrage Titel -
        String instanzTitel = "placeholder";


        //Konstruktor-Aufruf --> wie weis man den Inhalt der Variable automatisch dem Objektnamen zu?
        Ordner placeholder = new Ordner(instanzTitel);


        //Bestätigung ------Frontend implementieren------

    }

    @Override
    public void loeschen() {

    }

    @Override
    public void umbenennen() {

    }

    public void verschieben(){
        //
    }


}
