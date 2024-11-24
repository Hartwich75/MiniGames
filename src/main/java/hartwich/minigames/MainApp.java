package hartwich.minigames;

import javafx.application.Application;
import javafx.stage.Stage;

public class MainApp extends Application {
    @Override
    public void start(Stage primaryStage) {ViewController.init(primaryStage);}

    public static void main(String[] args) {
        launch(args);
    }
}