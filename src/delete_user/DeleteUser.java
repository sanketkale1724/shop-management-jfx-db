package delete_user;

import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class DeleteUser {
	public static void showDeleteUserScreen(){
    	try {
    		Parent actorGroup=FXMLLoader.load(new URL("file:C:\\NewShopManagementJavaFxDB\\src\\delete_user\\DeleteUserShopping.fxml"));
    		StageFactory.stage.setTitle("Delete User");
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
