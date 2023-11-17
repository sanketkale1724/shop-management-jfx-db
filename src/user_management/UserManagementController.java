package user_management;

import add_user.AddUser;
import delete_user.DeleteUser;
import edit_user.EditUser;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import main_screen.MainScreen;
import search_user.SearchUser;

public class UserManagementController {
  @FXML
  private Button addUser;
  
  @FXML
  private Button editUser;
  
  @FXML
  private Button searchUser;
  
  @FXML
  private Button deleteUser;
  
  @FXML
  private Button quit;
  
  public void ShowAddUserScreen(ActionEvent event) {
	  AddUser.ShowAddUserScreen();
  }
  public void ShowEditUserScreen(ActionEvent event)
  {
	 EditUser.ShowEditUserScreen();
  }
  public void ShowSearchUserScreen(ActionEvent event)
  {
	  SearchUser.ShowSearchScreen();
  }
  public void ShowDeleteUserScreen(ActionEvent event)
  {
	  DeleteUser.showDeleteUserScreen();
  }
  public void ShowQuitScreen(ActionEvent event)
  {
	  MainScreen.ShowMainScreen();
  }
}
