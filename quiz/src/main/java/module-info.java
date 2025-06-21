module com.mycompany.huy.quiz {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires lombok;
    requires java.sql;


    opens com.mycompany.huy.quiz to javafx.fxml;
    exports com.mycompany.huy.quiz;
}
