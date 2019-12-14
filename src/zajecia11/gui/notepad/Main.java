package zajecia11.gui.notepad;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Bez tytułu - Notatnik");
        primaryStage.setScene(new Scene(root, 478, 256));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
