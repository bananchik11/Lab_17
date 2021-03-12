import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Lab14 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("FxmlForLab17.fxml"));
        primaryStage.setTitle("Lab17");
        primaryStage.setScene(new Scene(root, 450, 400));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
} 