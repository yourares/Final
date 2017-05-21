package rocket.app.view;

import java.text.DecimalFormat;

import eNums.eAction;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import rocket.app.MainApp;
import rocketCode.Action;
import rocketData.LoanRequest;

public class MortgageController {

	@FXML TextField txtIncome;
	@FXML TextField txtExpenses;
	@FXML TextField txtCreditScore;
	@FXML TextField txtHouseCost;
	@FXML TextField txtMortgageAmt;
	@FXML ComboBox<Integer> cmbTerm;
	@FXML Label lblIncome;
	@FXML Label lblExpenses;
	@FXML Label lblCreditScore;
	@FXML Label lblHouseCost;
	@FXML Label lblTerm;
	@FXML Label lblMortgageAmt;
	
	
	private TextField txtNew;
	
	private MainApp mainApp;
	

	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
	}
	
	
	@FXML
	public void btnCalculatePayment(ActionEvent event)
	{
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Message Here...");
		alert.setHeaderText("Look, an Information Dialog");
		alert.setContentText(txtNew.getText());
		alert.showAndWait().ifPresent(rs -> {
		    if (rs == ButtonType.OK) {
		        System.out.println("Pressed OK.");
		    }
		});
	}
	
	public void HandleLoanRequestDetails(LoanRequest lRequest)
	{
		double Payment = lRequest.getdIncome()*0.28; 
		double Amount = (lRequest.getdIncome() - lRequest.getdExpenses())*0.36;
		if(Payment>Amount){
			String newPayment = new DecimalFormat("%.2f").format(Payment);
			txtMortgageAmt.setText("The MortgageAmt will Be: $ ");
		}
		else{
			txtMortgageAmt.setText("House Cost too High");
		}
		
	}
  }

