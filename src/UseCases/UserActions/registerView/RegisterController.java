package UseCases.UserActions.registerView;

import java.net.URL;
import java.time.LocalDate;
import java.util.*;

import JavaFxUI.ViewManager;
import domain.User;
import facade.FacadeLogin;
import facade.FacadeRegister;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;

public class RegisterController {

	ObservableList<String> genderList = FXCollections.observableArrayList("Man","Woman");
	@FXML
	private TextField usernameText;
	@FXML
	private TextField pswdText;
	@FXML
	private TextField pswdText2;
	@FXML
	private TextField email;
	@FXML
	private DatePicker birthPicker;
	@FXML
    private ComboBox<String> gender;
	@FXML
	private Label errorLabel;
	@FXML
	private Label errorLabel1;
	
	public void initialize() {
		gender.setItems(genderList);
		//pswdText2.setOnKeyPressed(new PasswordComparator(pswdText, pswdText2));
	}
	
	public void register(ActionEvent event) {
		FacadeRegister facade = FacadeRegister.getFacadeRegister();
		if (!pswdText.getText().equals(pswdText2.getText())){
			errorLabel.setText("Wrong Password");
			return;
		}
		if ((usernameText.getText() == null )||( pswdText.getText() == null )||(  email.getText() == null) ||( birthPicker.getValue() == null )||( gender.getValue() == null)) {
			errorLabel1.setText("All field must be filled!");
			return;
		}
		User moi = facade.register(usernameText.getText(), pswdText.getText(), email.getText(),birthPicker.getValue(), gender.getValue());
		facade.setUser(moi);
		ViewManager.goToHome();
	}
	
//	class PasswordComparator implements EventHandler<KeyEvent> {
//
//		private TextField p1;
//		private TextField p2;
//		
//		PasswordComparator(TextField pswdText, TextField pswdText2){
//			this.p1 = pswdText;
//			this.p2 = pswdText2;
//		}
//
//		@Override
//		public void handle(KeyEvent arg0) {
//			if(p1.equals(p2)) {
//				p2.setStyle("-fx-border-color: green");
//			} else {
//				p2.setStyle("-fx-border-color: red");
//			}
//
//		}
//	}

}