module hellofx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mau to javafx.fxml;
    exports com.mau;
}