module org.example.pinterestdemoworkshop {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.pinterestdemoworkshop to javafx.fxml;
    exports org.example.pinterestdemoworkshop;
}