package add_product;

import db_operations.DBUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import product_management.ProductManagement;

public class AddProductController {

	@FXML
	private TextField productName;

	@FXML
	private TextField productID;

	@FXML
	private TextField quantity;

	@FXML
	private TextField category;

	@FXML
	private TextField price;

	@FXML
	private Button save;
	
	@FXML
	private Button close;
	
	public void saveProductDetails(ActionEvent event)
	{
		String query = "INSERT INTO Product(productname,ProductID,price,Quantity,category)VALUES('"+productName.getText()+"','"+productID.getText()+"','"+price.getText()+"','"+quantity.getText()+"','"+category.getText()+"')";
		DBUtils.executeQuery(query);
		System.out.println("User added successfully.");
	}
	public void goToProductManagementScreen(ActionEvent event)
	{
		ProductManagement.showProductManagementScreen();
	}

}
