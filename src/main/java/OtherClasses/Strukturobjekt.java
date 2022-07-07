package OtherClasses;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public abstract class Strukturobjekt {

    protected Date erstelldatum;
    protected String titel;


    public abstract void erstellen();
    public abstract void loeschen();
    public abstract void umbenennen();


    //Datum ermitteln
    public Date getHeute(){
        SimpleDateFormat dtf = new SimpleDateFormat("yyyy/MM/dd");
        Calendar calendar = Calendar.getInstance();
        Date heute = calendar.getTime();
        return heute;
    }
}
