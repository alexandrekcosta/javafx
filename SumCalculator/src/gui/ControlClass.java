package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class ControlClass {
	@FXML
	private TextField txtNumber1;
	@FXML
	private TextField txtNumber2;
	@FXML
	private Button btSum;
	@FXML
	private Label labelResult;
	
	@FXML
	public void onBtSumAction() {
		
		try {
		double result1 = Double.parseDouble(txtNumber1.getText());
		double result2 = Double.parseDouble(txtNumber2.getText());
		double sum = result1 + result2;
		labelResult.setText(String.format("%.2f", sum));
		}
		catch(NumberFormatException e) {
			
			Alerts.showAlert("Error", "Parse error", e.getMessage(), AlertType.ERROR);
			
		}
		
	}

}
