package login;

import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class LoginScreen 
{
	 public static void showLoginScreen()throws Exception{
	    	try {
	    		Parent actorGroup=FXMLLoader.load(new URL("file:C:\\NewShopManagementJavaFxDB\\src\\login\\LoginShoppingScreen.fxml"));
	    		StageFactory.stage.setTitle("Login Screen");
	    		Scene scene=new Scene(actorGroup,900,600);
	    		StageFactory.stage.setScene(scene);
	    		StageFactory.stage.setFullScreen(true);
	    		StageFactory.stage.show();	
	    	}
	    	catch(Exception e)
	    	{
	    		e.printStackTrace();
	    	}
	    }
}
