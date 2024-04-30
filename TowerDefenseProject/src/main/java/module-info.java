module com.example.towerdefenseproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.towerdefenseproject to javafx.fxml;
    exports com.example.towerdefenseproject;
}