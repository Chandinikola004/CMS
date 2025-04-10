package application;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Facultycontroller implements Initializable {
	@FXML
	private Button facultysubmit;
	@FXML
	private Button facultyback;
	@FXML
	private TextField First_Name1;
	@FXML
	private TextField Last_name1;
	@FXML
	private TextField Phone_number1;
	@FXML
	private TextField Email1;
	@FXML
	private TextField Specialization1;
	@FXML
	private TextField Batch_timings2;
	Faculty faculty = new Faculty();

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
        facultyback.setOnAction(event->handlefacultyback(event,event));
        //TODO auto-generated method
		facultysubmit.setOnAction(new EventHandler<ActionEvent>() {
	
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("hello");
				
				if(First_Name1.getText().isEmpty()) {
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setTitle("Waranning MSG..!");
					alert.setHeaderText(null);
					alert.setContentText(" please enter First Name....!");
					alert.showAndWait();
				}//else {
				//faculty.setFirst_Name1(First_Name1.getText());
				
			else if(Last_name1.getText().isEmpty()) {
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setTitle("Waranning MSG..!");
					alert.setHeaderText(null);
					alert.setContentText(" please enter Last Name....!");
					alert.showAndWait();
				}//else {
					//faculty.setLast_name1(Last_name1.getText());
				
				
				
		else if(Phone_number1.getText().isEmpty()) {
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setTitle("Waranning MSG..!");
					alert.setHeaderText(null);
					alert.setContentText(" please enter valid mobile number....!");
					alert.showAndWait();
				}//else {
					//faculty.setPhone_number1(Long.parseLong(Phone_number1.getText()));
				
		else if(Email1.getText().isEmpty()) {
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setTitle("Waranning MSG..!");
					alert.setHeaderText(null);
					alert.setContentText(" please enter email_id....!");
					alert.showAndWait();
				}
				//else {
					//faculty.setEmail1(Email1.getText());
				
		else if(Specialization1.getText().isEmpty()) {
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setTitle("Waranning MSG..!");
					alert.setHeaderText(null);
					alert.setContentText(" please enter Specialization....!");
					alert.showAndWait();
				}//else {
					//faculty.setSpecialization1(Specialization1.getText());
				
				
		else if(Batch_timings2.getText().isEmpty()) {
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setTitle("Waranning MSG..!");
					alert.setHeaderText(null);
					alert.setContentText(" please enter Batch_timings....!");
					alert.showAndWait();
				}else
				{
					faculty.setFirst_Name1(First_Name1.getText());
					faculty.setLast_name1(Last_name1.getText());
					faculty.setPhone_number1(Long.parseLong(Phone_number1.getText()));
					faculty.setEmail1(Email1.getText());
					faculty.setSpecialization1(Specialization1.getText());
					faculty.setBatch_timings2(Double.parseDouble(Batch_timings2.getText()));
				}
				
				
				if(faculty.getFirst_Name1().isEmpty() || faculty.getLast_name1().isEmpty() || faculty.getPhone_number1()==0 || faculty.getEmail1().isEmpty() )
				{
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setTitle("Waranning MSG..!");
					alert.setHeaderText(null);
					alert.setContentText(" please enter all the values....!");
					alert.showAndWait();
				
				
			}else {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
				 	
					System.out.println("submitted");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vegaahi", "root", "root");
					PreparedStatement ps = con.prepareStatement("insert into faculty values (?,?,?,?,?,?,?,?,?)");
					ps.setInt(1, 0);
					ps.setString(2, faculty.getFirst_Name1());
					ps.setString(3, faculty.getLast_name1());
					ps.setString(4, faculty.getEmail1());
					ps.setLong(5, faculty.getPhone_number1());
					ps.setString(6, faculty.getSpecialization1());
					ps.setString(7, "NOT ASSIGNED");
					ps.setDouble(9, faculty.getBatch_timings2());
					ps.setInt(8, 0);
	
					int i = ps.executeUpdate();
					if (i > 0) {
						System.out.println("inserted");
					} else {
						System.out.println("unsuccessful");
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			}
		});

	}

	private void handlefacultyback(ActionEvent event, ActionEvent event2) {
		// TODO Auto-generated method stub
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
