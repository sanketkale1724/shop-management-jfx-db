package add_user;

import java.sql.ResultSet;
import java.sql.SQLException;

import db_operations.DBUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import user_management.UserManagement;

public class AddUserController {

	@FXML
	private TextField userName;
	
	@FXML
	private TextField userID;
	
	@FXML
	private TextField role;
	
	@FXML
	private TextField password;
	
	@FXML
	private TextField confirmPassword;
	
	@FXML
	private Button save;
	
	@FXML
	private Button close;
	
	public void SaveUserInfo(ActionEvent event)
	{
       String query = "INSERT INTO User(Username,LoginName,Password,ConfirmPassword,UserRole)VALUES('"+userName.getText()+"','"+userID.getText()+"','"+password.getText()+"','"+confirmPassword.getText()+"','"+role.getText()+"')";
		
		DBUtils.executeQuery(query);	
		
	}
	public void CloseScreen(ActionEvent event)
	{
		UserManagement.ShowUserManagementScreen();
		
	}
	
}
