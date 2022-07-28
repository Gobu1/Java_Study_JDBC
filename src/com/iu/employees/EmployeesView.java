package com.iu.employees;

import java.util.ArrayList;

public class EmployeesView 
{
	
	public void view(ArrayList<EmployeesDTO> ar)
	{
		for(EmployeesDTO employeesDTO : ar)
		{
			
			System.out.print(employeesDTO.getEmployee_id()+"\t");
			System.out.print(employeesDTO.getSalary()+"\t");
			System.out.println(employeesDTO.getDepartment_di());
		}
	}

}
