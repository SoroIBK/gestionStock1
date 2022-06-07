module com.snm.gestionstock.gestionstock {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.snm.gestionstock.gestionstock to javafx.fxml;
    exports com.snm.gestionstock.gestionstock;
}