module com.example.javafx_2048 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.javafx_2048 to javafx.fxml;
    exports com.example.javafx_2048;
}