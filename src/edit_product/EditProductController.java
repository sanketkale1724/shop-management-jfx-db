package edit_product;

import java.sql.ResultSet;
import java.sql.SQLException;

import db_operations.DBUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import product_management.ProductManagement;

public class EditProductController {

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
	
	@FXML
	private Button save;
	
	public void searchProduct(ActionEvent event) throws SQLException
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
				quantity.setText(rs.getString("Quantity"));
				 category.setText(rs.getString("category"));
				 price.setText(rs.getString("Price"));
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
	public void saveProduct(ActionEvent event)
	{
		String query = "update Product set productname ='"+productName.getText()+"' , ProductID ='"+productID.getText()+"' ,"
				+ "price='"+price.getText()+"' ,Quantity='"+quantity.getText()+"', category='"
				+category.getText()+"' where productname='"+productNameToSearch.getText()+"' ";
		DBUtils.executeQuery(query);
	}
	
}
