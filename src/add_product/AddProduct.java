package add_product;

import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class AddProduct {
	public static void showAddProductScreen(){
    	try {
    		Parent actorGroup=FXMLLoader.load(new URL("file:C:\\NewShopManagementJavaFxDB\\src\\add_product\\AddProductShopping.fxml"));
    		StageFactory.stage.setTitle("Add Product Screen");
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
