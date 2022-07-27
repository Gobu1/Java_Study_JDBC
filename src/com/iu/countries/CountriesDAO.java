package com.iu.countries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.iu.util.DBConnector;

public class CountriesDAO 
{
	public CountriesDTO getDetail(String Countries_id)throws Exception
	{
		CountriesDTO countriesDTO = null;
		Connection con = DBConnector.getConnection();
		
		String sql = "SELECT * FROM COUNTRIES WHERE REGION_ID=?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		//4. ?값 세팅
		st.setString(1, Countries_id);
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next())
		{
			countriesDTO = new CountriesDTO();
			String cid = rs.getString("country_id");
			countriesDTO.setCountry_id(cid);
			String rName = rs.getString("country_name");
			countriesDTO.setCountry_name(rName);
			int rid = rs.getInt("region_id");
			countriesDTO.setRegion_id(rid);
			
			
		}
		
		DBConnector.disConnect(rs, st, con);
		
		return countriesDTO;
	}
	
	public ArrayList<CountriesDTO> getList() throws Exception
	{
		//1.DB연결
		ArrayList<CountriesDTO> ar = new ArrayList();
				Connection con = DBConnector.getConnection();
				
				//2. Query문 작성
				String sql = "SELECT * FROM COUNTRIES";
				
				//3. Query문 미리 전송
				PreparedStatement st = con.prepareStatement(sql);
				
				//4.
				
				//5. 최종 전송 후 결과를 처리
				ResultSet rs = st.executeQuery();
				
				while(rs.next())
				{
					CountriesDTO countriesDTO = new CountriesDTO();
					countriesDTO = new CountriesDTO();
					String cid = rs.getString("country_id");
					countriesDTO.setCountry_id(cid);
					String rName = rs.getString("country_name");
					countriesDTO.setCountry_name(rName);
					int rid = rs.getInt("region_id");
					countriesDTO.setRegion_id(rid);
					
					ar.add(countriesDTO);
					
				DBConnector.disConnect(rs, st, con);
				
				}
				return ar;

	}
}
