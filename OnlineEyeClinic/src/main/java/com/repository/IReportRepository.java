package com.repository;

import java.time.LocalDate;
import java.util.List;

import com.entity.Report;
import com.entity.Spectacles;
import com.exceptions.PatientIdFoundNotException;
import com.exceptions.ReportIdNotFoundException;

public interface IReportRepository {
	Report addReport(Report report);

	Report updateReport(Report report);

	Report removeReport(int reportId)throws ReportIdNotFoundException;

	Report viewReport(int reportId, int patientId)throws ReportIdNotFoundException,PatientIdFoundNotException;

	List<Report> viewAllReport(LocalDate date);

	List<Spectacles>  viewSpetacles();
}

