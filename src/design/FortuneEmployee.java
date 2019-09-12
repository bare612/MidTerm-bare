package design;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public  class FortuneEmployee {

	public  FortuneEmployee() {


	}

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	 public static void main(String[] args) {

	 	String mission = "Helping people With Technology";

	 	EmployeeInfo employee1 = new EmployeeInfo("Araf",102);
	 	EmployeeInfo employee2 = new EmployeeInfo("Hasan",103);
	 	EmployeeInfo employee3 = new EmployeeInfo("KUKU",104);
	 	EmployeeInfo employee4 = new EmployeeInfo("KAKA",105);

	 	employee1.assignDepartment("HR");
	 	employee2.assignDepartment("Finance");
	 	employee3.assignDepartment("Sales");
	 	employee4.assignDepartment("Legal");


	 	employee1.setSalary(80000);
	 	employee1.calculateSalary(employee1.getSalary());
	 	employee2.setSalary(85000);
	 	employee2.calculateSalary(employee2.getSalary());
	 	employee3.setSalary(105000);
	 	employee3.calculateSalary(employee3.getSalary());
	 	employee4.setSalary(72000);
	 	employee4.calculateSalary(employee4.getSalary());

	 	employee1.setPerformance(6);
	 	double bonus102 = employee1.calculateEmployeeBonus(employee1.getSalary(),employee1.getPerformance());
        employee2.setPerformance(4);
        double bonus103 = employee2.calculateEmployeeBonus(employee2.getSalary(),employee2.getPerformance());
        employee3.setPerformance(3);
        double bonus104 = employee3.calculateEmployeeBonus(employee3.getSalary(),employee3.getPerformance());
        employee4.setPerformance(1);
        double bonus105 = employee4.calculateEmployeeBonus(employee4.getSalary(),employee4.getPerformance());

        EmployeeInfo.calculateEmployeePension(employee1.getSalary());

        Map<Integer, List<Object>> employeeInfo = new HashMap<Integer,List<Object>>();
        List<Object> employeeRecord102 = new ArrayList<Object>();
        employeeRecord102.add(employee1.employeeName());
        employeeRecord102.add(employee1.calculateSalary(),employee1.getSalary());
        employeeRecord102.add(bonus102);

        List<Object> employeeRecord103 = new ArrayList<Object>();
        employeeRecord103.add(employee2.employeeName());
        employeeRecord103.add(employee2.calculateSalary(),employee2.getSalary());
        employeeRecord103.add(bonus103);

      //  employeeInfo.put(102,employeeRecord102);
      //  employeeInfo.put(103,employeeRecord103);










	}

}
