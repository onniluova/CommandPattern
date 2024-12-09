module org.example.commandpattern {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.commandpattern to javafx.fxml;
    exports org.example.commandpattern;
}