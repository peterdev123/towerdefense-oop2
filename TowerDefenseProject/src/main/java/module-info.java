module com.example.towerdefenseproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.towerdefenseproject to javafx.fxml;
    exports com.example.towerdefenseproject;
    exports com.example.towerdefenseproject.Controller;
    opens com.example.towerdefenseproject.Controller to javafx.fxml;
}