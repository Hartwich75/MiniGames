package hartwich.minigames.view;

import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Stack;

public class ViewController {
    private static Stage stage;

    private static Stack<Scene> navigationStack = new Stack<>();

    public static void init(Stage stage) {
        ViewController.stage = stage;
        ViewController.stage.setHeight(800);
        ViewController.stage.setWidth(1000);
        navigationStack.push(HomeScreenView.createScene());
        ViewController.stage.setScene(navigationStack.peek());
        ViewController.stage.show();
    }

    public static Scene getScene() {
        return stage.getScene();
    }

    public static void setScene(Scene scene) {
        navigationStack.push(scene);
        stage.setScene(navigationStack.peek());
    }

}