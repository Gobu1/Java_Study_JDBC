package com.iu.countries;

import java.util.ArrayList;

import com.iu.regions.RegionsDTO;

public class CountriesView {
	public void view(ArrayList<CountriesDTO> ar)
	{
		for(CountriesDTO countriesDTO : ar)
		{
			System.out.println(countriesDTO.getCountry_id());
			System.out.println(countriesDTO.getCountry_name());
			System.out.println(countriesDTO.getRegion_id());
			
		}
			
	}
	
	
	
	

}
