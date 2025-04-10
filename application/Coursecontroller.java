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
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class Coursecontroller implements Initializable {

    @FXML
    private TextField course_name;

    @FXML
    private TextField duration;

    @FXML
    private TextField fee;

    @FXML
    private TextField description;

    @FXML
    private Button addcoursesubmit;
@FXML
private Button courseback;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // Set the action for the Add Course button
    	courseback.setOnAction(event->handlecourseback(event, event));
        addcoursesubmit.setOnAction(event -> handleAddCourse(event));
        
    }

    private void  handlecourseback(ActionEvent event, EventObject arg0) {
		// TODO Auto-generated method stub
    	Parent parent;
   	Stage stage;
    				try {
    					
    					parent=FXMLLoader.load(getClass().getResource("Home.fxml"));
    					stage = (Stage) ( (Node)arg0.getSource()).getScene().getWindow();
    					stage.setScene(new Scene(parent, 1200, 800));
    					stage.show();
    				} catch (IOException e) {
    					// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
    				
    		
		return;
	}

	private void handleAddCourse(ActionEvent event) {
        // Validate the input fields
        if (course_name.getText().isEmpty()) {
        	Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Waranning MSG..!");
			alert.setHeaderText(null);
			alert.setContentText(" please Course_Name...!");
			alert.showAndWait();
        }

        else if (duration.getText().isEmpty()) {
        	Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Waranning MSG..!");
			alert.setHeaderText(null);
			alert.setContentText(" please Duration....!");
			alert.showAndWait();
        }

        else  if (fee.getText().isEmpty()) {
        	Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Waranning MSG..!");
			alert.setHeaderText(null);
			alert.setContentText(" please Fee....!");
			alert.showAndWait();
        }

        else if (description.getText().isEmpty()) {
        	Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Waranning MSG..!");
			alert.setHeaderText(null);
			alert.setContentText(" please Description....!");
			alert.showAndWait();
        }

        try {
            long feeValue = Long.parseLong(fee.getText()); // Parse fee as a long

            // Establish a database connection
            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vegaahi", "root", "1234");
			Connection con = DriverManager.getConnection("jdbc:"
					+ "mysql://localhost:3306/vegaahi","root","root");

            // Prepare SQL statement
            PreparedStatement ps = con.prepareStatement(
                "insert into course values (?, ?, ?, ?, ?)"
            );
            ps.setLong(1, 0); // Assuming ID is auto-incremented in the database
            ps.setString(2, course_name.getText());
            ps.setString(3, description.getText());
            ps.setString(4, duration.getText());
            ps.setLong(5, feeValue);

            // Debugging: Print SQL statement
            System.out.println(" All values are Added Successfully");

            // Execute update
            int result = ps.executeUpdate();

            if (result > 0) {
                showAlert("Success", "Course added successfully.");
            } else {
                showAlert("Error", "Failed to add course.");
            }

            con.close(); // Close connection

        } catch (NumberFormatException e) {
            showAlert("Error", "Fee must be a valid number.");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            showAlert("Error", "Database driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            showAlert("Error", "Database error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}