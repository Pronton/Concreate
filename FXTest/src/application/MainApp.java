package application;

import java.io.IOException;

import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class MainApp extends Application {

	private Stage stage;
	private Scene scene;
	private FlowPane pane;
	
	@Override
	public void start(Stage primaryStage) {
		stage = primaryStage;
		pane = new FlowPane();
		scene = new Scene(pane, 640, 480);
		try {
			pane = FXMLLoader.load(Main.class.getResource("Doctrine.fxml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		stage.setScene(scene); 
		stage.show();
	}

	@FXML
	public void initialize()
	{
		JOptionPane.showMessageDialog(null,"Get it Done.");
	}
	
	public static void main(String[] args) { 
		launch(args);
	}
}
