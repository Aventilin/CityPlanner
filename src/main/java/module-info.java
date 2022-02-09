module com.example.cityplanner {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.fsalman.cityplanner to javafx.fxml;
    exports com.fsalman.cityplanner;
}