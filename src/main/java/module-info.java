module com.example.proyectoparejaweek7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proyectoparejaweek7 to javafx.fxml;
    exports com.example.proyectoparejaweek7;
}