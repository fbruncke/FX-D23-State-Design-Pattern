module com.example.fxd23statedesignpattern {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxd23statedesignpattern to javafx.fxml;
    exports com.example.fxd23statedesignpattern;
}