package application;


import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.EventObject;
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
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

 

public class batchcontroller implements Initializable {
	
	@FXML
	private Button batchsubmit;
	@FXML
	private Button batchback;
	@FXML
	private TextField batch_id;
	@FXML
	private TextField batch_number;
	@FXML
	private TextField course_id;
	@FXML
	private TextField batch_timings;
	@FXML
	private DatePicker start_date;
	@FXML
	private DatePicker end_date;
	@FXML
	private TextField faculty_name;
	@FXML
	private TextField num_students;
	Batch batch= new Batch();

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

		batchback.setOnAction(event->handlebatchback(event,event));
		batchsubmit.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("welcome");
//				batch.setBatch_id(Integer.parseInt(batch_id.getText()));
				if(batch_id.getText().isEmpty()) {
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setTitle("Waranning MSG..!");
					alert.setHeaderText(null);
					alert.setContentText(" please batch_id....!");
					alert.showAndWait();
				}
//				batch.setBatch_number(Integer.parseInt(batch_number.getText()));
				else if(batch_number.getText().isEmpty()) {
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setTitle("Waranning MSG..!");
					alert.setHeaderText(null);
					alert.setContentText(" please batch_number....!");
					alert.showAndWait();
				}
//				batch.setCourse_id(Integer.parseInt(course_id.getText()));
				else if(course_id.getText().isEmpty()) {
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setTitle("Waranning MSG..!");
					alert.setHeaderText(null);
					alert.setContentText(" please course_id....!");
					alert.showAndWait();
				}
//				batch.setBatch_timings(Double.parseDouble(batch_timings.getText()));
				else if(batch_timings.getText().isEmpty()) {
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setTitle("Waranning MSG..!");
					alert.setHeaderText(null);
					alert.setContentText(" please batch_timings....!");
					alert.showAndWait();
				}
//				batch.setStart_date(start_date.getValue());
				else if(start_date.getValue() == null) {
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setTitle("Waranning MSG..!");
					alert.setHeaderText(null);
					alert.setContentText(" please start_date....!");
					alert.showAndWait();
				}
//				batch.setEnd_date(end_date.getValue());
				else if(end_date.getValue() == null) {
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setTitle("Waranning MSG..!");
					alert.setHeaderText(null);
					alert.setContentText(" please end_date....!");
					alert.showAndWait();
				}
//				batch.setFaculty_name(faculty_name.getText());
				else if(faculty_name.getText().isEmpty()) {
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setTitle("Waranning MSG..!");
					alert.setHeaderText(null);
					alert.setContentText(" please faculty_name....!");
					alert.showAndWait();
				}else {
					batch.setBatch_id(Integer.parseInt(batch_id.getText()));
					batch.setBatch_number(Integer.parseInt(batch_number.getText()));
					batch.setCourse_id(Integer.parseInt(course_id.getText()));
					batch.setBatch_timings(Double.parseDouble(batch_timings.getText()));
					batch.setStart_date(start_date.getValue());
					batch.setEnd_date(end_date.getValue());
					batch.setFaculty_name(faculty_name.getText());
					
					
				}
				
				
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vegaahi", "root", "root");
					PreparedStatement ps = con.prepareStatement("insert into batch values (?,?,?,?,?,?,?,?)");
					ps.setInt(1,0);
					ps.setInt(2, batch.getBatch_number());
				    ps.setInt(3, batch.getCourse_id());
				    ps.setDate(4,java.sql.Date.valueOf(batch.getStart_date()));
				    ps.setDate(5, java.sql.Date.valueOf(batch.getEnd_date()));
				    ps.setInt(6,batch.getNum_students() );
				    ps.setString(7,batch.getFaculty_name());
				    ps.setLong(8,(long)batch.getBatch_timings());
				    int i = ps.executeUpdate();
				    if (i > 0) {
						System.out.println("inserted");
					} else {
						System.out.println("unsuccessful");
					}
				    
				
				
				
			
		
	} catch (SQLException | ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
			
	} 
				};			
				
			});	
				
				
		}

	private void handlebatchback(ActionEvent event,ActionEvent event2) {
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