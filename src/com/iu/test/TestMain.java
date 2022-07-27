package com.iu.test;

import java.util.ArrayList;

import com.iu.countries.CountriesDAO;
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
		try {
			ArrayList<RegionsDTO> ar = regionsDAO.getList();
//			regionsDAO.getDetail(2);
			countriesDAO.getList();
//			countriesDAO.getDetail("AU");
//			regionsDAO.getList();
//			regionsView.view(ar);
		} catch (Exception e) {
			e.printStackTrace();
		}



	}

}
