module com.csongi.otthoni {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.csongi.otthoni to javafx.fxml;
    exports com.csongi.otthoni;
}
