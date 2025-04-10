package application;

import java.time.LocalDate;
import java.util.Date;



public class Student {
		private String first_name;
		private String last_name;
		private LocalDate dob;
		private String gender;
		private String email;
		private String study;
		private String specification;
		private String area_of_interest;
		private String name_of_the_college;
		private String study_status;
		private Long phone_number;
		private LocalDate registration_date;
		private String address_line;
		private String status;
		private String district;
		private String state;
		private String country;
		
		public String getFirst_name() {
			return first_name;
		}
		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}
		public String getLast_name() {
			return last_name;
		}
		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}
		public LocalDate getDob() {
			return dob;
		}
		public void setDob(LocalDate dob) {
			this.dob = dob;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getStudy() {
			return study;
		}
		public void setStudy(String study) {
			this.study = study;
		}
		public String getSpecification() {
			return specification;
		}
		public void setSpecification(String specification) {
			this.specification = specification;
		}
		public String getArea_of_interest() {
			return area_of_interest;
		}
		public void setArea_of_interest(String area_of_interest) {
			this.area_of_interest = area_of_interest;
		}
		public String getName_of_the_college() {
			return name_of_the_college;
		}
		public void setName_of_the_college(String name_of_the_college) {
			this.name_of_the_college = name_of_the_college;
		}
		public String getStudy_status() {
			return study_status;
		}
		public void setStudy_status(String study_status) {
			this.study_status = study_status;
		}
		public Long getPhone_number() {
			return phone_number;
		}
		public void setPhone_number(Long phone_number) {
			this.phone_number = phone_number;
		}
		public LocalDate getRegistration_date() {
			return registration_date;
		}
		public void setRegistration_date(LocalDate registration_date) {
			this.registration_date = registration_date;
		}
		public String getAddress_line() {
			return address_line;
		}
		public void setAddress_line(String address_line) {
			this.address_line = address_line;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getDistrict() {
			return district;
		}
		public void setDistrict(String district) {
			this.district = district;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		@Override
		public String toString() {
			return "student [first_name=" + first_name + ", last_name=" + last_name + ", dob=" + dob + ", gender="
					+ gender + ", email=" + email + ", study=" + study + ", specification=" + specification
					+ ", area_of_interest=" + area_of_interest + ", name_of_the_college=" + name_of_the_college
					+ ", study_status=" + study_status + ", phone_number=" + phone_number + ", registration_date="
					+ registration_date + ", address_line=" + address_line + ", status=" + status + ", district="
					+ district + ", state=" + state + ", country=" + country + "]";
		}
		public Student(String first_name, String last_name, LocalDate dob, String gender, String email, String study,
				String specification, String area_of_interest, String name_of_the_college, String study_status,
				Long phone_number, LocalDate registration_date, String address_line, String status, String district,
				String state, String country) {
			super();
			this.first_name = first_name;
			this.last_name = last_name;
			this.dob = dob;
			this.gender = gender;
			this.email = email;
			this.study = study;
			this.specification = specification;
			this.area_of_interest = area_of_interest;
			this.name_of_the_college = name_of_the_college;
			this.study_status = study_status;
			this.phone_number = phone_number;
			this.registration_date = registration_date;
			this.address_line = address_line;
			this.status = status;
			this.district = district;
			this.state = state;
			this.country = country;
		}
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
	}