module de.hwrberlin.wikursc.lkvp {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens de.hwrberlin.wikursc.lkvp to javafx.fxml;
    exports de.hwrberlin.wikursc.lkvp;
}