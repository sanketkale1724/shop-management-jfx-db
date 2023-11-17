package search_product;

import java.sql.ResultSet;
import java.sql.SQLException;

import db_operations.DBUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import product_management.ProductManagement;

public class SearchProductController {
	@FXML
	private TextField productNameToSearch;
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
	private Button search;
	
	@FXML
	private Button close;
	
	
	public void searchProduct(ActionEvent event)throws SQLException
	{
		boolean status=searchProductName(productNameToSearch.getText());
		if(status)
		{
			searchProductName(null);
		}
		else {
			System.out.println("Product Not Found");
		}
		
	}
	public boolean searchProductName(String productNameToSearch)throws SQLException
	{
		String query = "SELECT * FROM Product WHERE productname ='"+productNameToSearch+"'";

		ResultSet rs = DBUtils.executeQueryGetResult(query);

		try {
			if(rs.next()) {
			productName.setText(rs.getString("ProductName"));
			productID.setText(rs.getString("ProductID"));
			 price.setText(rs.getString("Price"));
			quantity.setText(rs.getString("Quantity"));
			 category.setText(rs.getString("category"));
			 
			 return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	public void closeScreen(ActionEvent event)
	{
		 ProductManagement.showProductManagementScreen();
	}
}
