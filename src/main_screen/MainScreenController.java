package main_screen;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import login.LoginScreen;
import product_management.ProductManagement;
import user_management.UserManagement;

public class MainScreenController {

	@FXML
	private Button userManagement;
	
	@FXML
	private Button productManagement;
	
	@FXML
	private Button Quit;
	public void ShowUserManagementScreen(ActionEvent event)
	{
      UserManagement.ShowUserManagementScreen();
	}
	public void ShowProductManagementScreen(ActionEvent event)
	{
		ProductManagement.showProductManagementScreen();
	}
	public void showLoginScreeen(ActionEvent event) throws Exception
	{
		LoginScreen.showLoginScreen();
		
	}
}
