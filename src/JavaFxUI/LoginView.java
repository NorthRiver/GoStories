package JavaFxUI;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class LoginView extends Scene {


	public LoginView(Group root, double width, double height) {
		super(root, width, height);
		// TODO Auto-generated constructor stub
		Button BtnLogin = new Button();
		Button BtnRegister = new Button();
		Button BtnRecover = new Button();
		
		BtnLogin.setLayoutX(120);
		BtnLogin.setLayoutY(150);
		BtnRegister.setLayoutX(50);
		BtnRegister.setLayoutY(200);
		BtnRecover.setLayoutX(160);
		BtnRecover.setLayoutY(200);
		
        
		BtnLogin.setText("Login");
		BtnRegister.setText("Register");
		BtnRecover.setText("Recover"+"\n"+"Password");
        
        
		BtnLogin.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                System.out.println("Login");
            }
        });
		BtnRegister.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                System.out.println("Register");
            }
        });
		BtnRecover.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                System.out.println("Recover password");
            }
        });
        root.getChildren().add(BtnLogin);  
        root.getChildren().add(BtnRegister);   
        root.getChildren().add(BtnRecover);   
	
	}



}
