package application;

import java.time.LocalDate;

public class Batch {
    private int batch_id;
    private int batch_number;
    private int course_id; 
    private LocalDate start_date;
    private LocalDate end_date;
    private int num_students;
    private String faculty_name;
    private double batch_timings;
	public int getBatchId() {
		return batch_id;
	}
	public int getBatch_id() {
		return batch_id;
	}
	public void setBatch_id(int batch_id) {
		this.batch_id = batch_id;
	}
	public int getBatch_number() {
		return batch_number;
	}
	public void setBatch_number(int string) {
		this.batch_number = string;
	}
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int i) {
		this.course_id = i;
	}
	public LocalDate getStart_date() {
		return start_date;
	}
	public void setStart_date(LocalDate localDate) {
		this.start_date = localDate;
	}
	public LocalDate getEnd_date() {
		return end_date;
	}
	public void setEnd_date(LocalDate localDate) {
		this.end_date = localDate;
	}
	public int getNum_students() {
		return num_students;
	}
	public void setNum_students(int num_students) {
		this.num_students = num_students;
	}
	public String getFaculty_name() {
		return faculty_name;
	}
	public void setFaculty_name(String faculty_name) {
		this.faculty_name = faculty_name;
	}
	public double getBatch_timings() {
		return batch_timings;
	}
	public void setBatch_timings(double batch_timings) {
		this.batch_timings = batch_timings;
	}
	
	

}