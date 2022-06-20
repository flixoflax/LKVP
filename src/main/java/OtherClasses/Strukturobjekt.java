package OtherClasses;

import java.util.Date;

public interface Strukturobjekt {
    String titel = null;
    Date erstelldatum = null;

    public void erstellen();
    public void loeschen();
    public void umbenennen();
}
