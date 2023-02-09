package com.elltechs.pomodoro;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.scene.transform.Scale;
import javafx.stage.StageStyle;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {

        scene = new Scene(loadFXML("primary"), 1024, 800);
        stage.initStyle(StageStyle.UNDECORATED);

        //Scale scale = new Scale();
        //scale.setX(0.5);
        //scale.setY(0.5);
        //scale.setPivotX(0);
        //scale.setPivotY(0);
        //stage.sizeToScene();
        //scene.getRoot().getTransforms().setAll(scale);
        //stage.setResizable(true);

        stage.setScene(scene);
        stage.show();

    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}
