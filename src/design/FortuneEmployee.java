package design;
import java.util.*;
import java.lang.*;

public class FortuneEmployee {

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

		EmployeeInfo employee1 = new EmployeeInfo(1,"Dahlia");
		EmployeeInfo employee2 = new EmployeeInfo(2,"Avery");
		EmployeeInfo employee3 = new EmployeeInfo(3, "Alisha", 27, "Architect", 90000, 2);

		employee1.setEmployeeName("Dahlia");
		employee1.setEmployeeAge(29);
		employee1.setDepartment("Developer");
		employee1.setSalary(95000);
		employee1.setPerformance(4);

        employee2.setEmployeeName("Avery");
        employee2.setEmployeeAge(25);
		employee2.setDepartment("Designer");
		employee2.setSalary(90500);
		employee2.setPerformance(3);

		employee1.benefitLayout();

		EmployeeInfo.calculateEmployeeBonus(employee2.getSalary(), employee2.getPerformance());

		EmployeeInfo.calculateEmployeePension(employee3.getSalary());
	}


	}
