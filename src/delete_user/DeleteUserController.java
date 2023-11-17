package delete_user;

import java.sql.ResultSet;
import java.sql.SQLException;

import db_operations.DBUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import user_management.UserManagement;

public class DeleteUserController {
@FXML
private TextField userName;

@FXML
private Button delete;
 @FXML
 private Button close;
 
 public void deleteUser(ActionEvent event)throws SQLException
 {
	 boolean status =  Delete_User(userName.getText());

		if(status) {
			System.out.println("USER DELETED SUCCESSFULLY");
		}
		else {
			System.out.println("!!!!USER NOT FOUND!!!!!");
		}
		
 }
 public static boolean Delete_User(String Username) {

		String query = "DELETE FROM User WHERE Username = '"+Username+"'";

		DBUtils.executeQuery(query);

		int rowsDeleted = DBUtils.getRowsDeleted();

		if(rowsDeleted > 0) {
			return true;
		}
		return false;
	}

 public void goToUserManagementScreen(ActionEvent event)
 {
	 UserManagement.ShowUserManagementScreen();
 }
}
