module opdr2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens opdr2 to javafx.fxml;

    exports opdr2;
}