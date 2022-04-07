package gui;

import java.util.Locale;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ControlClass {
	@FXML
	private TextField txtNumber1;
	@FXML
	private TextField txtNumber2;
	@FXML
	private Button BtMinus;
	@FXML
	private Label labelResult;
	
	@FXML
	public void onBtMinusAction() {
		try {
		Locale.setDefault(Locale.UK);
		double n1 = Double.parseDouble(txtNumber1.getText());
		double n2 = Double.parseDouble(txtNumber2.getText());
		double result = n1 - n2;
		labelResult.setText(String.format("%.2f",result));
		}
		catch(NumberFormatException e) {
			
			Alerts.showAlert("Error","Parse error",e.getMessage(),AlertType.ERROR);
			
		}
	}

}
