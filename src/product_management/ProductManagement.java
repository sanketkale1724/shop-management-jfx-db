package product_management;

import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class ProductManagement {
	public static void showProductManagementScreen() {
		try {
			Parent actorGroup = FXMLLoader.load(new URL(
					"file:C:\\NewShopManagementJavaFxDB\\src\\product_management\\ProductManagementShopping.fxml"));
			StageFactory.stage.setTitle("Product Management");
			Scene scene = new Scene(actorGroup, 900, 600);
			StageFactory.stage.setScene(scene);
			StageFactory.stage.setFullScreen(true);
			StageFactory.stage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
