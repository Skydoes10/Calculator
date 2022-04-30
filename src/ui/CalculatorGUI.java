package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import model.Calculator;

public class CalculatorGUI {
	
	//MainPane
	@FXML
    private BorderPane mainPane;
	
	//NumbersLabel
	@FXML
    private Label numbersLabel;
	
	@FXML
    private Label operationLabel;
	
	//Buttons
	@FXML
    private Button btn_0;

    @FXML
    private Button btn_1;

    @FXML
    private Button btn_2;

    @FXML
    private Button btn_3;

    @FXML
    private Button btn_4;

    @FXML
    private Button btn_5;

    @FXML
    private Button btn_6;

    @FXML
    private Button btn_7;

    @FXML
    private Button btn_8;

    @FXML
    private Button btn_9;

    @FXML
    private Button btn_Equal;

    @FXML
    private Button btn_Plus;

    @FXML
    private Button btn_X;

    @FXML
    private Button btn_clear;

    @FXML
    private Button btn_decimal;

    @FXML
    private Button btn_dvide;

    @FXML
    private Button btn_minus;

    @FXML
    private Button btn_negative_or_positive;

    @FXML
    private Button btn_power;

    @FXML
    private Button btn_remove;

    @FXML
    private Button btn_sqrt;
    
    
    private Calculator calculator;
    
    public CalculatorGUI(Calculator clt) {
    	calculator = clt;
    }
    
    public void inicialize() {
    	type_0(null);
    }
    
    @FXML
    private void type_0(ActionEvent event) {
    	if(numbersLabel.getText().isEmpty()) {
    		numbersLabel.setText("0");
    	}else {
    		numbersLabel.setText(numbersLabel.getText() + "0");
    	}
    }

    @FXML
    private void type_1(ActionEvent event) {
    	if(numbersLabel.getText().isEmpty()) {
    		numbersLabel.setText("1");
    	}else {
    		numbersLabel.setText(numbersLabel.getText() + "1");
    	}
    }

    @FXML
    private void type_2(ActionEvent event) {
    	if(numbersLabel.getText().isEmpty()) {
    		numbersLabel.setText("2");
    	}else {
    		numbersLabel.setText(numbersLabel.getText() + "2");
    	}
    }

    @FXML
    private void type_3(ActionEvent event) {
    	if(numbersLabel.getText().isEmpty()) {
    		numbersLabel.setText("3");
    	}else {
    		numbersLabel.setText(numbersLabel.getText() + "3");
    	}
    }

    @FXML
    private void type_4(ActionEvent event) {
    	if(numbersLabel.getText().isEmpty()) {
    		numbersLabel.setText("4");
    	}else {
    		numbersLabel.setText(numbersLabel.getText() + "4");
    	}
    }

    @FXML
    private void type_5(ActionEvent event) {
    	if(numbersLabel.getText().isEmpty()) {
    		numbersLabel.setText("5");
    	}else {
    		numbersLabel.setText(numbersLabel.getText() + "5");
    	}
    }

    @FXML
    private void type_6(ActionEvent event) {
    	if(numbersLabel.getText().isEmpty()) {
    		numbersLabel.setText("6");
    	}else {
    		numbersLabel.setText(numbersLabel.getText() + "6");
    	}
    }

    @FXML
    private void type_7(ActionEvent event) {
    	if(numbersLabel.getText().isEmpty()) {
    		numbersLabel.setText("7");
    	}else {
    		numbersLabel.setText(numbersLabel.getText() + "7");
    	}
    }

    @FXML
    private void type_8(ActionEvent event) {
    	if(numbersLabel.getText().isEmpty()) {
    		numbersLabel.setText("8");
    	}else {
    		numbersLabel.setText(numbersLabel.getText() + "8");
    	}
    }

    @FXML
    private void type_9(ActionEvent event) {
    	if(numbersLabel.getText().isEmpty()) {
    		numbersLabel.setText("9");
    	}else {
    		numbersLabel.setText(numbersLabel.getText() + "9");
    	}
    }

    @FXML
    private void type_decimal(ActionEvent event) {
    	if(numbersLabel.getText().isEmpty()) {
    		numbersLabel.setText("0.");
    	}else {
    		numbersLabel.setText(numbersLabel.getText() + ".");
    	}
    }
    
    @FXML
    private void putNegativeOrPositive(ActionEvent event) {
    	if(numbersLabel.getText().contains("-")) {
    		numbersLabel.setText(numbersLabel.getText().substring(1, numbersLabel.getText().length()));
    	} else {
    		numbersLabel.setText("-" + numbersLabel.getText());
    	}
    }
    
    
    
    @FXML
    private void plus(ActionEvent event) {
    	if(!numbersLabel.getText().isEmpty()) {
    		operationLabel.setText(numbersLabel.getText() + " +");
    		numbersLabel.setText("");
    	}
    }
    
    @FXML
    private void minus(ActionEvent event) {
    	if(!numbersLabel.getText().isEmpty()) {
    		operationLabel.setText(numbersLabel.getText() + " -");
    		numbersLabel.setText("");
    	}
    }
    
    @FXML
    private void multiplication(ActionEvent event) {
    	if(!numbersLabel.getText().isEmpty()) {
    		operationLabel.setText(numbersLabel.getText() + " x");
    		numbersLabel.setText("");
    	}
    }
    
    @FXML
    private void divide(ActionEvent event) {
    	if(!numbersLabel.getText().isEmpty()) {
    		operationLabel.setText(numbersLabel.getText() + " ÷");
    		numbersLabel.setText("");
    	}
    }
    
    @FXML
    private void raiseToPower2(ActionEvent event) {
    	if(!numbersLabel.getText().isEmpty()) {
    		operationLabel.setText(numbersLabel.getText() + "²");
    		
    		double num = Double.parseDouble(numbersLabel.getText());
    		double result = calculator.raiseToPower2(num);
    		String resultStr = String.valueOf(result);
    		
    		if(result % 1 == 0) {
    			String[] resultArr = resultStr.split(".0");
        		numbersLabel.setText(resultArr[0]);
    		} else {
    			numbersLabel.setText(resultStr);
    		}
    	}
    }
    
    @FXML
    private void takeSqrt(ActionEvent event) {
    	if(!numbersLabel.getText().isEmpty()) {
    		operationLabel.setText("sqrt(" + numbersLabel.getText() + ")");
    		
    		double num = Double.parseDouble(numbersLabel.getText());
    		double result = calculator.takeSqrt(num);
    		String resultStr = String.valueOf(result);
    		
    		if(result % 1 == 0) {
    			String[] resultArr = resultStr.split(".0");
        		numbersLabel.setText(resultArr[0]);
    		} else {
    			numbersLabel.setText(resultStr);
    		}
    	}
    }
    
    @FXML
    private void equal(ActionEvent event) {
    	if(!(operationLabel.getText().isEmpty() && numbersLabel.getText().isEmpty())) {
    		String firstNum = operationLabel.getText().substring(0, operationLabel.getText().length() - 2);
        	String secondNum = numbersLabel.getText();
        	String sign = operationLabel.getText().substring(operationLabel.getText().length() - 1, operationLabel.getText().length());
        	
        	if(secondNum.equals("0") && sign.equals("÷")) {
        		numbersLabel.setText("No division by zero");
        	} else {
        		double result = calculator.solveOperation(firstNum, secondNum, sign);
        		
        		operationLabel.setText(operationLabel.getText() + " " + secondNum + " =");
            	
            	String resultStr = String.valueOf(result);
            	if(result % 1 == 0) {
            		String[] resultArr = resultStr.split(".0");
            		numbersLabel.setText(resultArr[0]);
            	} else {
            		numbersLabel.setText(resultStr);
            	}
        	}
    	}
    }
    
    

    @FXML
    private void removeNumber(ActionEvent event) {
    	if(!numbersLabel.getText().isEmpty()) {
    		numbersLabel.setText(numbersLabel.getText().substring(0, numbersLabel.getText().length()-1));
    	}
    }

    @FXML
    private void clearNumbersLabel(ActionEvent event) {
    	numbersLabel.setText("");;
    	operationLabel.setText("");
    }
    
}
