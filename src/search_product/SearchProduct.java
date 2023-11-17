package search_product;

import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class SearchProduct {
	public static void showSearchProductScreen(){
    	try {
    		Parent actorGroup=FXMLLoader.load(new URL("file:C:\\NewShopManagementJavaFxDB\\src\\search_product\\SeacrhProductShopping.fxml"));
    		StageFactory.stage.setTitle("Search Product");
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
