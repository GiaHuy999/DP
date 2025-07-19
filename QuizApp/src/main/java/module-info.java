module com.dht.quizapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires lombok;
    requires java.sql;

    opens com.dht.quizapp to javafx.fxml;
    exports com.dht.quizapp;
    exports com.dht.pojo;
}
