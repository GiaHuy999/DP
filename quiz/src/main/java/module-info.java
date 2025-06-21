module com.mycompany.huy.quiz {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.huy.quiz to javafx.fxml;
    exports com.mycompany.huy.quiz;
}
