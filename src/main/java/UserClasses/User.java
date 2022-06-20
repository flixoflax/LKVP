package UserClasses;

import java.util.Date;

public abstract class User {
    private int userID;
    private String vorname;
    private String nachname;
    private Date gebdatum;

    public User(int userID, String vorname, String nachname, Date gebdatum) {
        this.userID = userID;
        this.vorname = vorname;
        this.nachname = nachname;
        this.gebdatum = gebdatum;
    }

    public void userdatenAusgabe(){
        System.out.println("UserID: " + userID);
        System.out.println("Name: " + vorname + " " + nachname);
        System.out.println("Geburtsdatum: " + gebdatum);
    }

}
