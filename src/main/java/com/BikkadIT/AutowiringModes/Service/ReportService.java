package com.BikkadIT.AutowiringModes.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.AutowiringModes.dao.MySqlReportDaoImpl;

@Service
public class ReportService {
	@Autowired
	private MySqlReportDaoImpl reportDaoI;            //Injecting MySqlReportDaoImpl into ReportService
	
	public void generateReport() {
		String reportData = reportDaoI.getReportData();
		System.out.println(reportData);
	}
	

}
