package application;

import javafx.beans.property.*;

import java.time.LocalDate;

public class Student1 {
    private final IntegerProperty studentId;
    private final StringProperty firstName;
    private final StringProperty email;
    private final LongProperty phoneNumber;
    private final ObjectProperty<LocalDate> dob;

    public Student1(int studentId, String firstName, String email, Long phoneNumber, LocalDate dob) {
        this.studentId = new SimpleIntegerProperty(studentId);
        this.firstName = new SimpleStringProperty(firstName);
        this.email = new SimpleStringProperty(email);
        this.phoneNumber = new SimpleLongProperty(phoneNumber);
        this.dob = new SimpleObjectProperty<>(dob);
    }

    public int getStudentId() {
        return studentId.get();
    }

    public IntegerProperty studentIdProperty() {
        return studentId;
    }

    public String getFirstName() {
        return firstName.get();
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }

    public String getEmail() {
        return email.get();
    }

    public StringProperty emailProperty() {
        return email;
    }

    public long getPhoneNumber() {
        return phoneNumber.get();
    }

    public LongProperty phoneNumberProperty() {
        return phoneNumber;
    }

    public LocalDate getDob() {
        return dob.get();
    }

    public ObjectProperty<LocalDate> dobProperty() {
        return dob;
    }
}

