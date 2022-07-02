package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Doctor extends Admin{
@Id
@GeneratedValue
private int doctorId;
private String doctorName;
private String doctorConsultationTime;
private long doctorMobile;
private String doctorEmail;
private String userName;
private String password;
private String address;
public int getDoctorId() {
	return doctorId;
}
public void setDoctorId(int doctorId) {
	this.doctorId = doctorId;
}
public String getDoctorName() {
	return doctorName;
}
public void setDoctorName(String doctorName) {
	this.doctorName = doctorName;
}
public String getDoctorConsultationTime() {
	return doctorConsultationTime;
}
public void setDoctorConsultationTime(String doctorConsultationTime) {
	this.doctorConsultationTime = doctorConsultationTime;
}
public long getDoctorMobile() {
	return doctorMobile;
}
public void setDoctorMobile(long doctorMobile) {
	this.doctorMobile = doctorMobile;
}
public String getDoctorEmail() {
	return doctorEmail;
}
public void setDoctorEmail(String doctorEmail) {
	this.doctorEmail = doctorEmail;
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
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", doctorConsultationTime="
			+ doctorConsultationTime + ", doctorMobile=" + doctorMobile + ", doctorEmail=" + doctorEmail + ", userName="
			+ userName + ", password=" + password + ", address=" + address + "]";
}

}

