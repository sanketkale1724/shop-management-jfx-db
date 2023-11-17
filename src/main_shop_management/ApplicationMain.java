package main_shop_management;

import common.StageFactory;
import javafx.application.Application;
import javafx.stage.Stage;
import login.LoginScreen;
import main_screen.MainScreen;
import user_management.UserManagement;

public class ApplicationMain extends Application {
	public static void main(String[] args)
	{
		launch(args);
		
	}
	
	@Override
	public void start(Stage stage) throws Exception
	{
	 StageFactory.stage=stage;
	  LoginScreen.showLoginScreen();
	  
	}
}
