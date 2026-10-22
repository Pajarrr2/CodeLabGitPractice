module com.example.codelab1proglan {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.codelab1proglan to javafx.fxml;
    exports com.example.codelab1proglan;
}