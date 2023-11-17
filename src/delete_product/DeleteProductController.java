package delete_product;

import java.sql.SQLException;

import db_operations.DBUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import product_management.ProductManagement;

public class DeleteProductController {
 @FXML
 private TextField deleteProduct;
 
 @FXML
 private Button delete;
 
 @FXML 
 private Button close;
 
 public void deleteProduct(ActionEvent event)throws SQLException
 {
	 boolean status =  deleteProductDetails(deleteProduct.getText());

		if(status) {
			System.out.println("PRODUCT DELETED SUCCESSFULLY");
		}
		else {
			System.out.println("!!!!PRODUCT NOT FOUND!!!!!");
		}
 }
 public static boolean deleteProductDetails(String ProductName) {
		String Query = "DELETE FROM Product WHERE ProductName = '"+ProductName+"'";

		DBUtils.executeQuery(Query);

		int rowDeleted = DBUtils.getRowsDeleted();

		if(rowDeleted > 0) {
			return true;
		}
		return false;
	}
 public void closeProduct(ActionEvent event)
 {
	 ProductManagement.showProductManagementScreen();
 }
 
}
