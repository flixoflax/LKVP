package UserClasses;

import java.util.Date;

public class Dozierender extends User{
    private String fachbereich;

    public Dozierender(int userID, String vorname, String nachname, Date gebdatum, String fachbereich) {
        super(userID, vorname, nachname, gebdatum);
        this.fachbereich = fachbereich;
    }
}
