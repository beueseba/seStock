module de.unihannover.sestock {
    requires javafx.controls;
    requires javafx.fxml;


    opens de.unihannover.sestock to javafx.fxml;
    exports de.unihannover.sestock;
}