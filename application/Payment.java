package application;

import java.sql.Date;
import java.time.LocalDate;

public class Payment {
	private int payment_id;
	  private int Student_id;
	  private int Course_id;
	  private int Batch_id;
	  private Double Amount;
	  private LocalDate Payment_Date;
	  private String Payment_method; 
  public int getPayment_id() {
		return payment_id;
	}
	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
	}
	public int getStudent_id() {
		return Student_id;
	}
	public void setStudent_id(int student_id) {
		Student_id = student_id;
	}
	public int getCourse_id() {
		return Course_id;
	}
	public void setCourse_id(int course_id) {
		Course_id = course_id;
	}
	public int getBatch_id() {
		return Batch_id;
	}
	public void setBatch_id(int batch_id) {
		Batch_id = batch_id;
	}
	public Double getAmount() {
		return Amount;
	}
	public void setAmount(Double string) {
		Amount = string;
	}
	public LocalDate getPayment_Date() {
		return Payment_Date;
	}
	public void setPayment_Date(LocalDate string) {
		Payment_Date = string;
	}
	public String getPayment_method() {
		return Payment_method;
	}
	public void setPayment_method(String payment_method) {
		Payment_method = payment_method;
	}

}
