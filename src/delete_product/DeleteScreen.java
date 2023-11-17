package delete_product;

import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class DeleteScreen {
	public static void showDeleteProductScreen(){
    	try {
    		Parent actorGroup=FXMLLoader.load(new URL("file:C:\\NewShopManagementJavaFxDB\\src\\delete_product\\DeleteProductShopping.fxml"));
    		StageFactory.stage.setTitle("Delete Product");
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
