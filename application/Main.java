package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
	    Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
		
		Scene scene = new Scene(root,600,600);
		arg0.setScene(scene);
		arg0.show();
	}
}
