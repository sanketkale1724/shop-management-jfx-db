package login;

import java.sql.ResultSet;
import java.sql.SQLException;

import db_operations.DBUtils;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import main_screen.MainScreen;

public class LoginScreenController {

	@FXML
	private TextField loginName;
	
	@FXML
	private TextField password;
	
	@FXML
	private Button login;

	public void ShowMainScreen(ActionEvent event)
	{
		System.out.println(loginName.getText());
		System.out.println(password.getText());
		boolean loginStatus= LoginScreenController.validateUserAndPassword(loginName.getText(), password.getText());
		if(loginStatus)
		{
			MainScreen.ShowMainScreen();
		}
		else {
			System.out.println("Login UnSuccessfull");
		}
	}
	public static boolean validateUserAndPassword(String loginName, String password) {
		String query = " Select * from User where LoginName='" + loginName + "' and password = '" + password + "' ";

		ResultSet rs = DBUtils.executeQueryGetResult(query);
		try {
			if (rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
