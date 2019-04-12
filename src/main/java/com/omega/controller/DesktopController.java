package com.omega.controller;

import com.sun.jndi.toolkit.dir.SearchFilter;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DesktopController implements Initializable {
    @FXML
    Pane mainBox;

    @FXML
    SearchFilter searchFilter;

    @FXML
    HBox desktopHead;

    public DesktopController() {
    }

    /**
     * Pre-initialization of various methods at boot time of this controller.
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initializeSceneStyle();
        Platform.runLater(() -> ((Stage) mainBox.getScene().getWindow()).setOnCloseRequest(t -> {
            Platform.exit();
        }));
    }

    public void initializeSceneStyle() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                desktopHead.getChildren().get(0).setEffect(new DropShadow(0, Color.BLACK));
            }
        });
    }

    public void btnExit(ActionEvent actionEvent) {
        System.exit(0);
    }
}
