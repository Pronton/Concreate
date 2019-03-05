package application;
	
import java.io.IOException;

import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;


public class Main extends Application {
	
	private Stage stage;
	private Scene scene;
	private AnchorPane pane;
	   
	@Override 
	public void start(Stage primaryStage) {
		
		this.stage = primaryStage;
		try {
			pane = (AnchorPane)FXMLLoader.load(Main.class.getResource("Doctrine.fxml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		scene = new Scene(pane, 640, 480);
		stage.setScene(scene);
		stage.show();
 
//		try 
//			BorderPane root = new BorderPane();
//			Scene scene = new Scene(root,400,400);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			primaryStage.setScene(scene);
//			primaryStage.show();
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
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
