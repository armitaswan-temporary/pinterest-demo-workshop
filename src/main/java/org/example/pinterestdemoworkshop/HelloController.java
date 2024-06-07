package org.example.pinterestdemoworkshop;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    Button saveBTN;

    @FXML
    public void save() {
        String x = saveBTN.getText();
        if (x.equals("Save")) {
            saveBTN.setText("Saved");
        }
        else {
            saveBTN.setText("Save");
        }
    }

    @FXML
    Button followBTN;

    @FXML
    public void follow() {
        String x = followBTN.getText();
        if (x.equals("Follow")) {
            followBTN.setText("Unfollow");
        }
        else {
            followBTN.setText("Follow");
        }
    }

    @FXML
    Button heartBTN;

    @FXML
    private void heart() {
        String currentColor = heartBTN.getStyle();
        if (currentColor.contains("black")) {
            heartBTN.setStyle("-fx-text-fill: red;");
        }
        else {
            heartBTN.setStyle("-fx-text-fill: black;");
        }
    }
}