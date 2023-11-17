package product_management;

import add_product.AddProduct;
import delete_product.DeleteScreen;
import edit_product.EditProduct;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import main_screen.MainScreen;
import search_product.SearchProduct;

public class ProductManagementController {
 
@FXML
private Button addProduct;

@FXML
private Button editProduct;

@FXML
private Button searchProduct;

@FXML
private Button DeleteProduct;

@FXML
private Button quit;

public void showAddProductScreen(ActionEvent event)
{
	AddProduct.showAddProductScreen();
}
public void showEditProductScreen(ActionEvent event)
{
	EditProduct.showEditProductScreen();
}
public void showSearchProductScreen(ActionEvent event)
{
	SearchProduct.showSearchProductScreen();
}
public void showDeleteProductScreen(ActionEvent event)
{
	DeleteScreen.showDeleteProductScreen();
}
public void showMainScreen(ActionEvent event)
{
	MainScreen.ShowMainScreen();
	
}
}
