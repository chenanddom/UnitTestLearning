package com.itdom;

import com.itdom.pojo.EmployeeDetails;
import com.itdom.service.EmpBusinessLogic;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static junit.framework.TestCase.assertEquals;

public class TestEmployeeDetails {
    EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
    EmployeeDetails employeeDetails = new EmployeeDetails();


    @Test
    public void testCalculateAppriasal() {
        employeeDetails.setName("chendom");
        employeeDetails.setAge(25);
        employeeDetails.setMonthlySalary(8000);
        double appraisal = empBusinessLogic.calculateAppraisal(employeeDetails);
        assertEquals(500, appraisal, 0.0);
    }
    @Test
    public void testCalculateYearlySalary(){
        employeeDetails.setName("Rajeev");
        employeeDetails.setAge(25);
        employeeDetails.setMonthlySalary(8000);
        double salary = empBusinessLogic.calculateYearlySalary(employeeDetails);
        assertEquals(96000, salary, 0.0);
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestEmployeeDetails.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
