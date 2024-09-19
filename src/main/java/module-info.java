module org.example.boltmaven {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.boltmaven to javafx.fxml;
    exports org.example.boltmaven;
}