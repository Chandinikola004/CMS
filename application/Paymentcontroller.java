package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Paymentcontroller implements Initializable{

    @FXML
    private Button paymentback;

    @FXML
    private Button paymentfilter;

    @FXML
    private TextField paymentsearch;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		paymentback.setOnAction(event->handlepaymentback(event, event));
	}
	private void handlepaymentback(ActionEvent event, ActionEvent event2) {
		// TODO Auto-generated method stub
		Parent parent;
	   	Stage stage;
	    				try {
	    					
	    					parent=FXMLLoader.load(getClass().getResource("Home.fxml"));
	    					stage = (Stage) ( (Node)event.getSource()).getScene().getWindow();
	    					stage.setScene(new Scene(parent, 1200, 800));
	    					stage.show();
	    				} catch (IOException e) {
	    					// TODO Auto-generated catch block
	    				e.printStackTrace();
	    			}
	    				
		return ;
	}
	
}