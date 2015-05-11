package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;

public class Controller {
	

		@FXML
		PasswordField Password;
		@FXML
		Button help;
		@FXML
		Button OK;
		@FXML
		Label label;

		
		@FXML
		public void handle(ActionEvent e) {
			if (Password.getText().equals("bugaboo")) {
				label.setText("Your Password is correct");
			} else {
				label.setText("Your Password is incorrect");
			}
			Password.clear();
		}
		public static void main(String[] args) {
			launch(args);
		}
				
			private static void launch(String[] args) {
			//TODO
			
		}

		
}
