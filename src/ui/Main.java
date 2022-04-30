package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Calculator;

public class Main extends Application {
	private Calculator calculator;
	private CalculatorGUI calculatorGUI;
	
	public Main() {
		calculator = new Calculator();
		calculatorGUI = new CalculatorGUI(calculator);
	}

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("calculator.fxml"));
		fxmlLoader.setController(calculatorGUI);
		
		Parent root = fxmlLoader.load();
		Scene scene = new Scene(root); 
		primaryStage.setScene(scene);
		primaryStage.setTitle("Calculator");
		primaryStage.show();
	}

}
