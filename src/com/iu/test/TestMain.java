package com.iu.test;

import java.util.ArrayList;

import com.iu.countries.CountriesDAO;
import com.iu.employees.EmployeesDAO;
import com.iu.employees.EmployeesDTO;
import com.iu.employees.EmployeesView;
import com.iu.regions.RegionsDAO;
import com.iu.regions.RegionsDTO;
import com.iu.regions.RegionsView;

public class TestMain 
{

	public static void main(String[] args) 
	{
		RegionsDAO regionsDAO = new RegionsDAO();
		CountriesDAO countriesDAO = new CountriesDAO();
		RegionsDTO regionsDTO = new RegionsDTO();
		RegionsView regionsView = new RegionsView();
		EmployeesDTO employeesDTO = new EmployeesDTO();
		EmployeesDAO employeesDAO = new EmployeesDAO();
		EmployeesView employeesView = new EmployeesView();
		try {
			
//			ArrayList<RegionsDTO> ar = regionsDAO.getList();
//			regionsDAO.getDetail(2);
//			countriesDAO.getList();
//			countriesDAO.getDetail("AU");
//			regionsDAO.getList();
//			regionsView.view(ar);
//			ArrayList<EmployeesDTO> ar;
//			ar = employeesDAO.getList("S");
//			employeesView.view(ar);
			regionsDTO.setRegion_id(6);
			regionsDTO.setRegion_name("Mars");
			int result = regionsDAO.setRegions(regionsDTO);
			if(result>0){
				System.out.println("성송");
			}
			else {
				System.out.println("실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}



	}

}
