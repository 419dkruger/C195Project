module com.c195project {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.c195project to javafx.fxml;
    exports com.c195project;
}