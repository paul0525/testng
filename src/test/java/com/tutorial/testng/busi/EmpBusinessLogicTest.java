package com.tutorial.testng.busi;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.tutorial.testng.EmployeeDetails;

public class EmpBusinessLogicTest {

	EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();

	EmployeeDetails employee = new EmployeeDetails();

	@Test
	public void calculateAppraisal() {

		employee.setName("Rajeev");
		employee.setAge(25);
		employee.setMonthlySalary(8000);
		double appraisal = empBusinessLogic.calculateAppraisal(employee);
		Assert.assertEquals(500, appraisal, 0.0, "500");
	}

	@Test
	public void calculateYearlySalary() {

		employee.setName("Rajeev");
		employee.setAge(25);
		employee.setMonthlySalary(8000);
		double salary = empBusinessLogic.calculateYearlySalary(employee);
		Assert.assertEquals(96000, salary, 0.0, "8000");
	}
}
