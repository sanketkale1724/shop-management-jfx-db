package edit_user;

import java.sql.ResultSet;
import java.sql.SQLException;

import db_operations.DBUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import user_management.UserManagement;

public class EditUserController {
	
	@FXML
	private TextField nameToSearch;
	
	@FXML
	private TextField userName;
	
	@FXML
	private TextField loginName;
	
	@FXML
	private TextField userRole;
	
	@FXML
	private TextField password;
	
	@FXML
	private TextField confirmPassword;
	
	@FXML
	private Button save;
	
	@FXML
	private Button close;
	
	@FXML
	private Button edit;
	
	public void SaveUpdateUser(ActionEvent event)
	{
		String query = "update User set Username ='"+userName.getText()+"' , loginname ='"+loginName.getText()+"' ,"
				+ "password='"+password.getText()+"' ,confirmPassword='"+confirmPassword.getText()+"', UserRole='"
				+userRole.getText()+"' where Username='"+nameToSearch.getText()+"' ";
		DBUtils.executeQuery(query);
	}
	public void CloseThisScreen (ActionEvent event)
	{
		UserManagement.ShowUserManagementScreen();
	}
	public void showUserInfo(ActionEvent event)throws SQLException
	{
		boolean status=searchUserName(nameToSearch.getText());
		if(status)
		{
			searchUserName(null);
		}
		else {
			System.out.println("User Not Found");
		}
		
}
	public boolean searchUserName(String nameToSearch)throws SQLException
	{
		String query="select * from User where Username= '"+nameToSearch+"'";
		ResultSet rs = DBUtils.executeQueryGetResult(query);
		try {
			if (rs.next()) {
				userName.setText(rs.getString("Username"));
				loginName.setText(rs.getString("loginName"));
				userRole.setText(rs.getString("userRole"));
				password.setText(rs.getString("password"));
				confirmPassword.setText(rs.getString("confirmPassword"));
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
