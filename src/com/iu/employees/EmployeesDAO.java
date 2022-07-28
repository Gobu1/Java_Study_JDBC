package com.iu.employees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.iu.util.DBConnector;

public class EmployeesDAO 
{
	public ArrayList<EmployeesDTO> getList(String search) throws Exception
	{
		ArrayList<EmployeesDTO> ar = new ArrayList();
		
		Connection con = DBConnector.getConnection();
		
		String sql = "SELECT * FROM EMPLOYEES WHRER FIRST_NAME LIKE '%?%' ";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, "%"+search+"%");
		
		ResultSet rs = st.executeQuery();
		
		while(rs.next())
		{
			EmployeesDTO employeesDTO = new EmployeesDTO();
			employeesDTO.setEmployee_id(rs.getInt("Employee_id"));
			employeesDTO.setFirst_name(rs.getString("First_name"));
			employeesDTO.setLast_name(rs.getString("Last_name"));
			employeesDTO.setEmail(rs.getString("Email"));
			employeesDTO.setPhone_number(rs.getString("Phone_number"));
			employeesDTO.setHire_date(rs.getDate("Hire_date"));
			employeesDTO.setJob_id(rs.getString("Job_id"));
			employeesDTO.setSalary(rs.getInt("Salary"));
			employeesDTO.setCommission_pct(rs.getDouble("Commission_pct"));
			employeesDTO.setManager_id(rs.getInt("Manager_id"));
			employeesDTO.setDepartment_di(rs.getInt("Department_id"));
			
			ar.add(employeesDTO);
			
			
		}
		DBConnector.disConnect(rs, st, con);
		
		
		
		return ar;
	}

}
