package com.SchSysAITI.kace.pojo;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class StudentContactDetails {

	@Column(name = "primary_contact")
	private String primaryContact;
	@Column(name = "secondary_contact")
	private String secondaryContact;
	@Column(name = "guardian_name")
	private String guardianName;
	@Column(name = "mobile_number")
	private String mobileNumber;
	
	public String getPrimaryContact() {
		return primaryContact;
	}
	public void setPrimaryContact(String primaryContact) {
		this.primaryContact = primaryContact;
	}
	public String getSecondaryContact() {
		return secondaryContact;
	}
	public void setSecondaryContact(String secondaryContact) {
		this.secondaryContact = secondaryContact;
	}
	public String getGuardianName() {
		return guardianName;
	}
	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	
}
