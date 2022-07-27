package com.iu.test;

import com.iu.regions.RegionsDAO;

public class TestMain 
{

	public static void main(String[] args) 
	{
		RegionsDAO regionsDAO = new RegionsDAO();
		try {
			regionsDAO.getList();
		} catch (Exception e) {
			e.printStackTrace();
		}



	}

}
