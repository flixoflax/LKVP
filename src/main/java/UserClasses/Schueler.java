package UserClasses;

import java.util.Date;

public class Schueler extends User{
    private int klassenstufe;


    public Schueler(int userID, String vorname, String nachname, Date gebdatum, int klassenstufe) {
        super(userID, vorname, nachname, gebdatum);
        this.klassenstufe = klassenstufe;
    }
}
