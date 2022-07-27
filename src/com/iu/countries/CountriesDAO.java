package com.iu.countries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.iu.util.DBConnector;

public class CountriesDAO 
{
	public void getList() throws Exception
	{
		//1.DB연결
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
					String cid = rs.getString("country_id");
					String name = rs.getString("country_name");
					int rid = rs.getInt("region_id");
					System.out.println(cid);
					System.out.println(name);
					System.out.println(rid);
				}
	}

}
