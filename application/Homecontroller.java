package application;

import java.io.IOException;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.mysql.cj.conf.DatabaseUrlContainer;
import com.mysql.cj.xdevapi.Statement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
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
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Labeled;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;


public class Homecontroller implements Initializable {
	
@FXML
private Parent parent;
	
	// These variables are Enquiry form variables data 
	
	Date d = new Date();
	@FXML
	private Labeled results_info;
	@FXML
	private TextField First_Name;
	@FXML
	private TextField Last_Name;
	@FXML
	private TextField Name_of_the_college;
	@FXML
	private DatePicker DOB;
	@FXML
	private TextField Email;
	@FXML
	private ComboBox<String> study;
	
	@FXML
	private ComboBox<String> specifications;
	@FXML
	private ComboBox<String> study_status;
	@FXML
	private TextField Phone_number;
	@FXML
	private DatePicker registration_date;
	@FXML
	private ComboBox<String> course_intrested;
	
	@FXML
	private ComboBox<String> gender;
	@FXML
	private TextField Address_Line;
	@FXML
	private TextField District;
	@FXML
	private TextField state;
	@FXML
	private TextField Country;
	
	@FXML
	private Button submit;
	
	
	
	// These variables are payment data 
	
	@FXML
	private Button View_payment_history;
	@FXML
	private Button addfaculty;
	@FXML
	private TextField Student_id;
	@FXML 
	private TextField Course_id;
	@FXML
	private TextField Batch_id;
	@FXML
	private TextField Amount;
	@FXML
	private DatePicker Payment_Date;
	@FXML
	private TextField Payment_method;
	@FXML
	private Button addpayment;
	
	
	
	// Batch of variable data
	
	@FXML
	private Button addbatches;
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
	@FXML
	private Labeled resultsinfo;
	
	
	//Course variable data
	@FXML
	private Button addcourse;
	@FXML
	private TextField course_name;
	@FXML
	private TextField duration;
	@FXML
	private TextField fee;
	@FXML
	private TextField description;
	@FXML
	private TableView<course1> coursetable;
	@FXML
	private TableColumn<course1, Integer>course_id1;
	@FXML
	private TableColumn<course1, String> course_name1;
	@FXML
	private TableColumn<course1, String> description1;
	@FXML
	private TableColumn<course1, String> duration1;
	@FXML
	private TableColumn<course1, Integer>fee1;
	@FXML
	//private TableColumn<Student1, Date> dab;
	//@FXML
	private TextField coursesearch;
	
	
	//view_registred student details
	@FXML
	private TableView<Student1> registertable;
	@FXML
	private TableColumn<Student1, Integer> studentid;
	@FXML
	private TableColumn<Student1, String> name;
	@FXML
	private TableColumn<Student1, String> emailtable;
	@FXML
	private TableColumn<Student1, Integer> phoneno;
	@FXML
	private TableColumn<Student1, Date> dab;
	@FXML
	private TextField viewsearch;
//	ObservableList<Student1> studentobsObservableList=FXCollections.observableArrayList();
//	@FXML
//	private TableColumn<Main, Integer> studentid;
//	@FXML
	//private TableColumn<Main, String> name;
//	@FXML
	//private TableColumn<Main, String> emailtable;
//	@FXML
//	private TableColumn<Main, Long> phoneno;
//	@FXML
//	private TableColumn<Main, Date> dab;
//	ObservableList<Main> ObservableList = FXCollections.observableArrayList();  
	

public void enquirydata() {
Student s = new Student();
	
	submit.setOnAction(new EventHandler<ActionEvent>() {
		@Override
		public void handle(ActionEvent arg0) {
			System.out.println("welcome");
			// TODO Auto-generated method stub
//			s.setFirst_name(First_Name.getText());
			if(First_Name.getText().isEmpty()) {
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Waranning MSG..!");
				alert.setHeaderText(null);
				alert.setContentText(" please first name....!");
				alert.showAndWait();
			} 
//			s.setLast_name(Last_Name.getText());
			else if(Last_Name.getText().isEmpty()) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Waranning MSG..!");
				alert.setHeaderText(null);
				alert.setContentText(" please lastname....!");
				alert.showAndWait();
			}
//			s.setName_of_the_college(Name_of_the_college.getText());
			else if(Name_of_the_college.getText().isEmpty()) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Waranning MSG..!");
				alert.setHeaderText(null);
				alert.setContentText(" please Name_of_the_college....!");
				alert.showAndWait();
			}
//			s.setDob(DOB.getValue());
			else if (DOB.getValue() == null) { 
			    Alert alert = new Alert(Alert.AlertType.INFORMATION);
			    alert.setTitle("Warning Message..!");
			    alert.setHeaderText(null);
			    alert.setContentText("Please select a valid date !");
			    alert.showAndWait();
			}
			
//			s.setEmail(Email.getText());
			else if (Email.getText().isEmpty()) { 
			    Alert alert = new Alert(Alert.AlertType.INFORMATION);
			    alert.setTitle("Warning Message..!");
			    alert.setHeaderText(null);
			    alert.setContentText("Please select a valid Email !");
			    alert.showAndWait();
			}
//			s.setStudy(study.getValue());
			else if(study.getValue().isEmpty()) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Waranning MSG..!");
				alert.setHeaderText(null);
				alert.setContentText(" please study....!");
				alert.showAndWait();
			}
//			s.setSpecification(specifications.getValue());
			else if(specifications.getValue().isEmpty()) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Waranning MSG..!");
				alert.setHeaderText(null);
				alert.setContentText(" please specifications....!");
				alert.showAndWait();
			}
//			s.setStatus(study_status.getValue());
			else if(study_status.getValue().isEmpty()) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Waranning MSG..!");
				alert.setHeaderText(null);
				alert.setContentText(" please study_status....!");
				alert.showAndWait();
			}
//			s.setPhone_number(Long.parseLong(Phone_number.getText()));
			else if(Phone_number.getText().isEmpty()) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Waranning MSG..!");
				alert.setHeaderText(null);
				alert.setContentText(" please Phone_number....!");
				alert.showAndWait();
			}
//			s.setRegistration_date(registration_date.getValue());
			else if(registration_date.getValue() == null) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Waranning MSG..!");
				alert.setHeaderText(null);
				alert.setContentText(" please registration_date....!");
				alert.showAndWait();
			}
//			s.setArea_of_interest(course_intrested.getValue());
			else if(course_intrested.getValue().isEmpty()) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Waranning MSG..!");
				alert.setHeaderText(null);
				alert.setContentText(" please course_intrested....!");
				alert.showAndWait();
			}
//			s.setGender(gender.getValue());
			else if(gender.getValue().isEmpty()) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Waranning MSG..!");
				alert.setHeaderText(null);
				alert.setContentText(" please gender....!");
				alert.showAndWait();
			}
//			s.setAddress_line(Address_Line.getText());
			else if(Address_Line.getText().isEmpty()) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Waranning MSG..!");
				alert.setHeaderText(null);
				alert.setContentText(" please Address_Line....!");
				alert.showAndWait();
			}
//			s.setDistrict(District.getText());
			else if(District.getText().isEmpty()) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Waranning MSG..!");
				alert.setHeaderText(null);
				alert.setContentText(" please District....!");
				alert.showAndWait();
			}
//			s.setState(state.getText());
			else if(state.getText().isEmpty()) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Waranning MSG..!");
				alert.setHeaderText(null);
				alert.setContentText(" please state....!");
				alert.showAndWait();
			}
//			s.setCountry(Country.getText());
			else if(Country.getText().isEmpty()) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Waranning MSG..!");
				alert.setHeaderText(null);
				alert.setContentText(" please enter  Country....!");
				alert.showAndWait();
			}else {
				s.setFirst_name(First_Name.getText());
				s.setLast_name(Last_Name.getText());
				s.setName_of_the_college(Name_of_the_college.getText());
				s.setDob(DOB.getValue());
				s.setEmail(Email.getText());
				s.setStudy(study.getValue());
				s.setSpecification(specifications.getValue());
				s.setStatus(study_status.getValue());
				s.setPhone_number(Long.parseLong(Phone_number.getText()));
				s.setRegistration_date(registration_date.getValue());
				s.setArea_of_interest(course_intrested.getValue());
				s.setGender(gender.getValue());
				s.setAddress_line(Address_Line.getText());
				s.setDistrict(District.getText());
				s.setState(state.getText());
				s.setCountry(Country.getText());
				
			}
			// Validate Email Address
						if (Email.getText() == null || Email.getText().trim().isEmpty()) {
						    Alert alert = new Alert(Alert.AlertType.INFORMATION);
						    alert.setTitle("Warning Message");
						    alert.setHeaderText(null);
						    alert.setContentText("Please enter your email address!");
						    alert.showAndWait();
						} else if (!Email.getText().matches("^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$")) { 
						    Alert alert = new Alert(Alert.AlertType.INFORMATION);
						    alert.setTitle("Invalid Input");
						    alert.setHeaderText(null);
						    alert.setContentText("Please enter a valid email address!");
						    alert.showAndWait();
						}
			// Validate Phone Number
						else if (Phone_number.getText() == null || Phone_number.getText().trim().isEmpty()) {
			    Alert alert = new Alert(Alert.AlertType.INFORMATION);
			    alert.setTitle("Warning Message");
			    alert.setHeaderText(null);
			    alert.setContentText("Please enter your phone number!");
			    alert.showAndWait();
			} else if (!Phone_number.getText().matches("[6-9]\\d{9}")) { 
			    Alert alert = new Alert(Alert.AlertType.INFORMATION);
			    alert.setTitle("Invalid Input");
			    alert.setHeaderText(null);
			    alert.setContentText("Please enter a valid  phone number!");
			    alert.showAndWait();
			}

			

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vegaahi","root","root");
				PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
				ps.setInt(1, 0);
				ps.setString(2,s.getFirst_name());
				ps.setString(3, s.getLast_name());
				ps.setDate(4, java.sql.Date.valueOf( s.getDob()));
				ps.setString(5, s.getGender());
				ps.setString(6, s.getEmail());
				ps.setString(7, s.getStudy());
				ps.setString(8, s.getSpecification());
				ps.setString(9, s.getArea_of_interest());
				ps.setString(10, s.getName_of_the_college());
				ps.setString(11, s.getStudy_status());
				ps.setLong(12, s.getPhone_number());
				ps.setDate(13,java.sql.Date.valueOf(s.getRegistration_date()));
				ps.setString(14, s.getAddress_line());
				ps.setString(15, s.getDistrict());
				ps.setString(16, s.getState());
				ps.setString(17, s.getCountry());
				ps.setString(18, s.getStatus());
				int i = ps.executeUpdate();
				if(i>0) {
					//results_info.setText("Submitted Successfully");
					
					System.out.println("Sucsessfull");
				}
				else {
					System.out.println("unsuccessfull");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
		}
	});	
	
	}
public void paymentpage() {
	Payment p = new Payment();
	
	View_payment_history.setOnAction(new EventHandler<ActionEvent>() {
		Parent parent;
		Stage stage;
		@Override
		public void handle(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			try {
				parent = FXMLLoader.load(getClass().getResource("Payment.fxml"));
				stage = (Stage) ( (Node) arg0.getSource()).getScene().getWindow();
				stage.setScene(new Scene(parent,1200,800));
				stage.show();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		});
			
			addpayment.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent arg0) {
					System.out.println("welcome to Payment Page");
					// TODO Auto-generated method stub
					
					
//					p.setStudent_id(Integer.parseInt(Student_id.getText()));
					if(Student_id.getText().isEmpty()) {
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setTitle("Waranning MSG..!");
						alert.setHeaderText(null);
						alert.setContentText(" please Student_id....!");
						alert.showAndWait();
					}
//					p.setBatch_id(Integer.parseInt(Batch_id.getText()));
					else if(Batch_id.getText().isEmpty()) {
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setTitle("Waranning MSG..!");
						alert.setHeaderText(null);
						alert.setContentText(" please Batch_id....!");
						alert.showAndWait();
					}
//					p.setPayment_method(Payment_method.getText());
					else if(Payment_method.getText().isEmpty()) {
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setTitle("Waranning MSG..!");
						alert.setHeaderText(null);
						alert.setContentText(" please Payment_method....!");
						alert.showAndWait();
					}
//					p.setCourse_id(Integer.parseInt(Course_id.getText()));
					else if(Course_id.getText().isEmpty()) {
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setTitle("Waranning MSG..!");
						alert.setHeaderText(null);
						alert.setContentText(" please Course_id....!");
						alert.showAndWait();
					}
//					p.setPayment_Date(Payment_Date.getValue());
					else if(Payment_Date.getValue() == null) {
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setTitle("Waranning MSG..!");
						alert.setHeaderText(null);
						alert.setContentText(" please Payment_Date....!");
						alert.showAndWait();
					}
//					p.setAmount(Double.parseDouble(Amount.getText()));
					else if(Amount.getText().isEmpty()) {
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setTitle("Waranning MSG..!");
						alert.setHeaderText(null);
						alert.setContentText(" please Amount....!");
						alert.showAndWait();
					}
					else {
						p.setStudent_id(Integer.parseInt(Student_id.getText()));
						p.setBatch_id(Integer.parseInt(Batch_id.getText()));
						p.setPayment_method(Payment_method.getText());
						p.setCourse_id(Integer.parseInt(Course_id.getText()));
						p.setPayment_Date(Payment_Date.getValue());
						p.setAmount(Double.parseDouble(Amount.getText()));
						
					}
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					try {
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vegaahi", "root", "root");
						PreparedStatement ps = con.prepareStatement("insert into payment values(?,?,?,?,?,?,?)");
						ps.setInt(1, 0);
						ps.setInt(2, p.getStudent_id());
						ps.setInt(3, p.getCourse_id());
						ps.setInt(4, p.getBatch_id());
						ps.setDouble(5, p.getAmount());
						ps.setDate(6, java.sql.Date.valueOf(p.getPayment_Date()));
						ps.setString(7,p.getPayment_method() );
						
						int m = ps.executeUpdate();
						if(m>0) {
							
							
							resultsinfo.setText("Payment Done Successfully and Payment Id is:");
							
							Student_id.setText("");
							Batch_id.setText("");
							Payment_method.setText("");
							Course_id.setText("");
							Payment_Date.setEditable(true);
							Amount.setText("");
							System.out.println("data inserted successfully");
						}else {
							System.out.println("data Not inserted successfully");
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		            
				
					
				}
			});
	
	
	 
}
public void viewregisteredstudent() {
	// Create an ObservableList to hold the data
    ObservableList<Student1> studentList = FXCollections.observableArrayList();
    
    
    // Database connection
    try {
        // Load the MySQL driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        // Establish the connection to the database
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vegaahi", "root", "root");

        // Prepare the SQL query to fetch all students
        PreparedStatement ps = con.prepareStatement("SELECT * FROM student");

        // Execute the query
        ResultSet rs = ps.executeQuery();

        // Iterate through the result set and add each row to the ObservableList
        while (rs.next()) {
            int studentId = rs.getInt("STUDENT_ID");
            String firstName = rs.getString("first_name");
            String email = rs.getString("email");
            Long phoneNumber = rs.getLong("phone_number");
            LocalDate dob = rs.getDate("dob").toLocalDate();

            // Create a new Student object and populate it with data from the database
            Student1 student = new Student1(studentId, firstName, email, phoneNumber, dob);

            // Add the student to the ObservableList
            studentList.add(student);
        }

        // Close the database connection
        rs.close();
        ps.close();
        con.close();

    } catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
    }

    // Bind the data to the TableView
    studentid.setCellValueFactory(new PropertyValueFactory<>("studentId"));
    name.setCellValueFactory(new PropertyValueFactory<>("firstName"));
    emailtable.setCellValueFactory(new PropertyValueFactory<>("email"));
    phoneno.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
    dab.setCellValueFactory(new PropertyValueFactory<>("dob"));

    // Set the data to the TableView
    registertable.setItems(studentList);
    FilteredList<Student1> filteredData = new FilteredList<>(studentList, b -> true);

    viewsearch.textProperty().addListener((observable, oldValue, newValue) -> {
        filteredData.setPredicate(student -> {
            // Simple filtering by name
            if (newValue == null || newValue.isEmpty()) {
                return true;
            }
            String lowerCaseFilter = newValue.toLowerCase();
            return student.getFirstName().toLowerCase().contains(lowerCaseFilter) || 
                   String.valueOf(student.getStudentId()).toLowerCase().contains(lowerCaseFilter);

        });
    });

    SortedList<Student1> sortedData = new SortedList<>(filteredData);
    sortedData.comparatorProperty().bind(registertable.comparatorProperty());
    registertable.setItems(sortedData);

}

	/*
	 * try { Class.forName("com.mysql.jdbc.Driver"); } catch (ClassNotFoundException
	 * e) { // TODO Auto-generated catch block e.printStackTrace(); } try {
	 * Connection con =
	 * DriverManager.getConnection("jdbc.mysql://localhost:3306/vegaahi","root",
	 * "Ganesh@445"); } catch (SQLException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 */	


public void viewenrolledstudent() {
	/*
	 * try { Class.forName("com.mysql.jdbc.Driver"); } catch (ClassNotFoundException
	 * e) { // TODO Auto-generated catch block e.printStackTrace(); } try {
	 * Connection con =
	 * DriverManager.getConnection("jdbc.mysql://localhost:3306/vegaahi","root",
	 * "Ganesh@445"); } catch (SQLException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 */
	}
public void course() {
	  ObservableList<course1> courseList = FXCollections.observableArrayList();
	    
	    
	    // Database connection
	    try {
	        // Load the MySQL driver
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        
	        // Establish the connection to the database
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vegaahi", "root", "root");

	        // Prepare the SQL query to fetch all students
	        PreparedStatement ps = con.prepareStatement("SELECT * FROM course");

	        // Execute the query
	        ResultSet rs = ps.executeQuery();

	        // Iterate through the result set and add each row to the ObservableList
	        while (rs.next()) {
	        	int courses_id1 = rs.getInt("course_id1");
	            String course_name = rs.getString("course_name");
	            String description = rs.getString("description");
	            String duration= rs.getString("duration");
	            Long fee = rs.getLong("fee");
	         

	            // Create a new Student object and populate it with data from the database
	            course1  course = new course1(courses_id1,course_name,description,duration,fee);

	            // Add the student to the ObservableList
	            courseList.add(course);
	        }

	        // Close the database connection
	        rs.close();
	        ps.close();
	        con.close();

	    } catch (ClassNotFoundException | SQLException e) {
	        e.printStackTrace();
	    }

	    // Bind the data to the TableView
	   course_id1.setCellValueFactory(new PropertyValueFactory<>("course_id1"));
	    course_name1.setCellValueFactory(new PropertyValueFactory<>("course_name1"));
	   description1.setCellValueFactory(new PropertyValueFactory<>("description1"));
	   duration1.setCellValueFactory(new PropertyValueFactory<>("duration1"));
	    fee1.setCellValueFactory(new PropertyValueFactory<>("fee1"));
	  //  dab.setCellValueFactory(new PropertyValueFactory<>("dob"));

	    // Set the data to the TableView
	    coursetable.setItems(courseList);
	    FilteredList<course1> filteredData = new FilteredList<>(courseList, b -> true);

	    viewsearch.textProperty().addListener((observable, oldValue, newValue) -> {
	        filteredData.setPredicate(course -> {
	            // Simple filtering by name
	            if (newValue == null || newValue.isEmpty()) {
	                return true;
	            }
	            String lowerCaseFilter = newValue.toLowerCase();
	            return  course.getCourse_name1().toLowerCase().contains(lowerCaseFilter) || 
	                   String.valueOf(course.getCourse_id1()).toLowerCase().contains(lowerCaseFilter);

	        });
	    });

	    SortedList<course1> sortedData = new SortedList<>(filteredData);
	    sortedData.comparatorProperty().bind(coursetable.comparatorProperty());
	    coursetable.setItems(sortedData);

	addcourse.setOnAction(new EventHandler<ActionEvent>() {
		Stage stage;
		@Override
		public void handle(ActionEvent arg0) {
			// TODO Auto-generated method stub
			try {
				parent = FXMLLoader.load(getClass().getResource("course.fxml"));
			stage = (Stage) ( (Node)arg0.getSource()).getScene().getWindow();
				stage.setScene(new Scene(parent, 1200, 800));
				stage.show();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	});
}
public void batches() {
	addbatches.setOnAction(new EventHandler<ActionEvent>() {
    	
		Stage stage;
		
		@Override
		public void handle(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			
				try {
					parent=FXMLLoader.load(getClass().getResource("batch.fxml"));
					stage = (Stage) ( (Node)arg0.getSource()).getScene().getWindow();
					stage.setScene(new Scene(parent, 1200, 800));
					stage.show();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
			
		}
	});
}
public void faculty() {
	addfaculty.setOnAction(new EventHandler<ActionEvent>() {
		Stage stage;
		@Override
		public void handle(ActionEvent arg0) {
			// TODO Autoparent-generated method stub
			try {
				parent=FXMLLoader.load(getClass().getResource("faculty.fxml"));
				stage = (Stage) ( (Node) arg0.getSource()).getScene().getWindow();
				stage.setScene(new Scene(parent,1200,800));
				stage.show();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	});
	
}
@Override
public void initialize(URL arg0, ResourceBundle arg1) {
	// TODO Auto-generated method stub
	enquirydata();
	paymentpage();
	batches();
	faculty();
	course();
	viewregisteredstudent();
	
//	@Override
//	public void initialize(URL arg0, ResourceBundle arg1) {
//		// TODO Auto-generated method stub
		enquirydata();
		paymentpage();
		study.getItems().addAll("Diploma","B-tech","Degree","MBA","MCA");
		specifications.getItems().addAll("CSE","EEE","CSD","CSM","ECE","MECH","AUTOMOBILES","CIVIL");
		study_status.getItems().addAll("completed","pursuing");
		course_intrested.getItems().addAll("AI&ML","FULLSTACK","JAVA","PYTHON","AWT","TESTING METHODOLOGIES");
		gender.getItems().addAll("MALE","FEMALE");
		
		
//		 DatabaseConnection connectNow = new DatabaseConnection();
//	        Connection connection = connectNow.getConnection();
//	        String productViewQuery = "select STUDENT-ID,NAME,EMAIL,PHONE NO,DOB from student_batch_enrollment";
//	       try {
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			Logger.getLogger(Homecontroller.class.getName()).log(Level.SEVERE, null, e);
//			e,printStatckTrace();
//		}
	       
		
	}
	
	
}