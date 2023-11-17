package user_management;

import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class UserManagement {

	public static void ShowUserManagementScreen(){
    	try {
    		Parent actorGroup=FXMLLoader.load(new URL("file:C:\\NewShopManagementJavaFxDB\\src\\user_management\\UserManagementShopping.fxml"));
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
