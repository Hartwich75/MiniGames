package hartwich.minigames.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import java.util.List;

public class HomeScreenView {

    private static final String title = "MiniGames Application";

    private static final String[] games = {"TicTacToe", "Snake"};

    public static Scene createScene() {
        BorderPane layout = new BorderPane();
        layout.setPadding(new Insets(20));

        Pane titlePane = createTitlePane();
        layout.setTop(titlePane);

        Pane gamesPane = createGamesPane();
        layout.setCenter(gamesPane);

        return new Scene(layout);
    }

    private static Pane createTitlePane() {
        HBox titlePane = new HBox();
        titlePane.setAlignment(Pos.TOP_CENTER);
        Label titleLabel = new Label(title);
        titleLabel.setFont(Font.font("Arial", FontWeight.BOLD, 40));

        titlePane.getChildren().add(titleLabel);

        return titlePane;
    }

    private static Pane createGamesPane() {
        HBox gamesPane = new HBox();
        gamesPane.setAlignment(Pos.CENTER);

        for (String game : games) {
            Button newGameButton = new Button(game);
            newGameButton.setPrefSize(200, 50);
            newGameButton.setOnAction(_ -> {
                switch (game) {
                    case "TicTacToe":
                        ViewController.setScene(TicTacToeView.createScene());
                        break;
                    case "Snake":
                        //TODO: Add functionality
                        break;
                }
            });

            gamesPane.getChildren().add(newGameButton);
        }


        return gamesPane;
    }

}
