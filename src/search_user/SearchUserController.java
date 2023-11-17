package search_user;

import java.sql.ResultSet;
import java.sql.SQLException;

import db_operations.DBUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import user_management.UserManagement;

public class SearchUserController {
	
@FXML
private TextField searchName;
@FXML
private TextField userName;

@FXML
private TextField loginName;

@FXML
private TextField userRole;

@FXML
private TextField password;


@FXML
private TextField confirnPassword;

@FXML
private Button search;

@FXML
private Button delete;

@FXML
private Button close;

@FXML
private Button edit;
public void EditUser(ActionEvent event)
{
	edit_user.EditUser.ShowEditUserScreen();
}
public void DeleteUser(ActionEvent event)
{
	delete_user.DeleteUser.showDeleteUserScreen();
}
public void CloseScreen(ActionEvent event)
{
	UserManagement.ShowUserManagementScreen();
}

public void ShowUserInfo(ActionEvent event) throws SQLException
{
	boolean status=SearchUser(searchName.getText());
	if(status)
	{
		SearchUser(null);
	}
	else {
		System.out.println("User Not Found");
	}
	
	
	
}
public boolean SearchUser(String searchName) throws SQLException
{
	String query="select * from User where Username= '"+searchName+"'";
	ResultSet rs = DBUtils.executeQueryGetResult(query);
	try {
		if (rs.next()) {
			userName.setText(rs.getString("Username"));
			loginName.setText(rs.getString("loginName"));
			userRole.setText(rs.getString("userRole"));
			password.setText(rs.getString("password"));
			confirnPassword.setText(rs.getString("confirmPassword"));
			return true;
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return false;
}

}
