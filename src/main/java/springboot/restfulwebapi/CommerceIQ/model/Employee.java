package springboot.restfulwebapi.CommerceIQ.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "employee_id",nullable = false,unique = true)
	private String employeeId;
	@Column(name = "first_name", nullable = false)
	private String firstName;
	@Column(name = "last_name", nullable = false)
	private String lastName;
	@Column(name = "email_address", nullable = false)
	private String emailId;
	@Column(name = "phone_number",nullable = false,unique = true)
	private String phoneNumber;
	
	public Employee() {
		
	}

	public Employee(String employeeId, String firstName, String lastName, String emailId, String phoneNumber) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
	}

	public long getId() {
		return id;
	}

	public Employee setId(long id) {
		this.id = id;
		return this;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public Employee setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
		return this;
	}

	public String getFirstName() {
		return firstName;
	}

	public Employee setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public String getLastName() {
		return lastName;
	}

	public Employee setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public String getEmailId() {
		return emailId;
	}

	public Employee setEmailId(String emailId) {
		this.emailId = emailId;
		return this;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public Employee setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"id=" + id +
				", employeeId='" + employeeId + '\'' +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", emailId='" + emailId + '\'' +
				", phoneNumber='" + phoneNumber + '\'' +
				'}';
	}
}

