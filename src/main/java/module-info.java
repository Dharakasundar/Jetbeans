module com.example.jetbeans {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.jetbeans to javafx.fxml;
    exports com.example.jetbeans;
}