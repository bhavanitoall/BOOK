package com.booking.BookingABook1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="register")
public class RegisterBean {
	@Id
	@Column
	private int cutomerId;
	@Id
    @Column
	private String firstName;
	@Id
   @Column
	private String lastName;
	@Id
   @Column
	private String contactNo;
	@Id
	@Column
	private String emailId;
	@Id
   @Column
	private String userName;
	@Id
   @Column
	private String password;

	public int getCutomerId() {
		return cutomerId;
	}

	public void setCutomerId(int cutomerId) {
		this.cutomerId = cutomerId;
	}
	public String getFirstName() {
		return firstName;
	}
     
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public RegisterBean(int cutomerId, String firstName, String lastName, String contactNo, String emailId,
			String userName, String password) {
		super();
		this.cutomerId = cutomerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNo = contactNo;
		this.emailId = emailId;
		this.userName = userName;
		this.password = password;
	}

	public RegisterBean() {
		super();
	}

}
