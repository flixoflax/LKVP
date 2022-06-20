package UserClasses;

import java.util.Date;

public class Studierender extends User{
    private int matikelnummer;
    private String studiengang;

    public Studierender(int userID, String vorname, String nachname, Date gebdatum, int matikelnummer, String studiengang) {
        super(userID, vorname, nachname, gebdatum);
        this.matikelnummer = matikelnummer;
        this.studiengang = studiengang;
    }
}
