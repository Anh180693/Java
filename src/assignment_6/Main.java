package assignment_6;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("students.fxml"));
        primaryStage.setTitle("T2204M JavaFX");
        primaryStage.setScene(new Scene(root,800,600));
        primaryStage.show();
    }
}