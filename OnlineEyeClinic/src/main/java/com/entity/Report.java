package com.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Report {
	@Id
	@GeneratedValue
	private int reportId;
	private LocalDateTime dateOfReport;
	private String descriptionOfReport;
	private String visualAcuity;
	private String visualAcuityNear;
	private String visualAcuityDistance;
	private Test typeOfTest;
	private Patient patientId;
	public int getReportId() {
		return reportId;
	}
	public void setReportId(int reportId) {
		this.reportId = reportId;
	}
	public LocalDateTime getDateOfReport() {
		return dateOfReport;
	}
	public void setDateOfReport(LocalDateTime dateOfReport) {
		this.dateOfReport = dateOfReport;
	}
	public String getDescriptionOfReport() {
		return descriptionOfReport;
	}
	public void setDescriptionOfReport(String descriptionOfReport) {
		this.descriptionOfReport = descriptionOfReport;
	}
	public String getVisualAcuity() {
		return visualAcuity;
	}
	public void setVisualAcuity(String visualAcuity) {
		this.visualAcuity = visualAcuity;
	}
	public String getVisualAcuityNear() {
		return visualAcuityNear;
	}
	public void setVisualAcuityNear(String visualAcuityNear) {
		this.visualAcuityNear = visualAcuityNear;
	}
	public String getVisualAcuityDistance() {
		return visualAcuityDistance;
	}
	public void setVisualAcuityDistance(String visualAcuityDistance) {
		this.visualAcuityDistance = visualAcuityDistance;
	}
	public Test getTypeOfTest() {
		return typeOfTest;
	}
	public void setTypeOfTest(Test typeOfTest) {
		this.typeOfTest = typeOfTest;
	}
	public Patient getPatientId() {
		return patientId;
	}
	public void setPatientId(Patient patientId) {
		this.patientId = patientId;
	}
	@Override
	public String toString() {
		return "Report [reportId=" + reportId + ", dateOfReport=" + dateOfReport + ", descriptionOfReport="
				+ descriptionOfReport + ", visualAcuity=" + visualAcuity + ", visualAcuityNear=" + visualAcuityNear
				+ ", visualAcuityDistance=" + visualAcuityDistance + ", typeOfTest=" + typeOfTest + ", patientId="
				+ patientId + "]";
	}
	
}
