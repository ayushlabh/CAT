package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.microsoft.sqlserver.jdbc.SQLServerDriver;

public class Database {
	
	public static void main(String[] args) {
		
		try{
			
//			Class.forName("com.mysql.cj.jdbc.Driver");
			Class.forName("net.sourceforge.jtds.jdbc.Driver");
			String urlStage = "jdbc:jtds:sqlserver://DBSES2346cls.dmzmgmt.uhc.com:1433;DatabaseName=ATF001DB" ;
			String usernameStage = "umrportqa" ;
			String passwordStage = "Testing_1s" ;
			
			String urlTest = "jdbc:jtds:sqlserver://dbset1647.ms.ds.uhc.com:1433;DatabaseName=AOS001DB" ;
			String usernameTest = "" ;
			String passwordTest = "" ;
			
//			Connection con = DriverManager.getConnection(urlTest,usernameTest,passwordTest) ;
			Connection con = DriverManager.getConnection(urlStage,usernameStage,passwordStage) ;
			
			Statement stmt = con.createStatement() ;
			
			
			String assgn_trans_nbr =  "6148442" ;
			
//			String query1 = "select top 100 * from aos.AOS0025T where ASSGN_TRANS_NBR = '" + assgn_trans_nbr + "'" ;
			
			ResultSet rs ;
					
			rs = stmt.executeQuery("select top 100 * from atf.ATF0006T where ASSGN_TRANS_NBR = '6148442'");
			
			while (rs.next()) {
					
				
				String first_name_txt = rs.getString("EMP_FIRST_NAME_TXT");
				String last_name_txt = rs.getString("EMP_LAST_NAME_TXT");
				String grp_nbr = rs.getString("GRP_NBR");
				String soc_sec_nbr = rs.getString("SOC_SEC_NBR");
				String location_cd = rs.getString("LOCATION_CD");
				String grp_name = rs.getString("GRP_NAME");
												
				System.out.println("Employee first name : " + first_name_txt);
				System.out.println("Employee last name : " + last_name_txt);
				System.out.println("Employee group number : " + grp_nbr);
				System.out.println("Soc sec number : " + soc_sec_nbr);
				System.out.println("Location cd : " + location_cd);
				System.out.println("Group name : " + grp_name);
				
			}
			
			rs = stmt.executeQuery("select top 100 * from aos.AOS0025T where ASSGN_TRANS_NBR = '6148442'");
						
			while (rs.next()) {
				
				String assgn_enrollee = rs.getString("ASSGN_ENROLLEE_NBR");
				String assgn_trans = rs.getString("ASSGN_TRANS_NBR");
				String e_member_id = rs.getString("E_MEMBER_ID");
				String e_member_nbr = rs.getString("E_MEMBER_NBR");
				String cert_nbr = rs.getString("CERT_NBR");
				String e_last_name = rs.getString("E_LAST_NAME");
				String e_first_name = rs.getString("E_FIRST_NAME");
				String e_middle_intl = rs.getString("E_MIDDLE_INTL");
				String e_suffix = rs.getString("E_SUFFIX");
				String addr1 = rs.getString("ADDR1");
				String addr2 = rs.getString("ADDR2");
				String city_nm = rs.getString("CITY_NM");
				String st_cd = rs.getString("ST_CD");
				String country = rs.getString("COUNTRY");
				String pstl_loc_cd = rs.getString("PSTL_LOC_CD");
				String email = rs.getString("EMAIL");
				String e_dob = rs.getString("E_DOB");
				String e_sex = rs.getString("E_SEX");
				String e_status = rs.getString("E_STATUS");
				String group_nbr = rs.getString("GROUP_NBR");
				String location_cd = rs.getString("LOCATION_CD");
				String work_status = rs.getString("WORK_STATUS");
				String work_state = rs.getString("WORK_STATE");
				String hire_dt = rs.getString("HIRE_DT");
													
				System.out.println("Employee first name : " + assgn_enrollee);
				System.out.println("Employee last name : " + assgn_trans);
				System.out.println("Employee group number : " + e_member_id);
				System.out.println("Soc sec number : " + e_member_nbr);
				System.out.println("Location cd : " + cert_nbr);
				System.out.println("Group name : " + e_last_name);
				System.out.println("Employee first name : " + e_first_name);
				System.out.println("Employee last name : " + e_middle_intl);
				System.out.println("Employee group number : " + e_suffix);
				System.out.println("Soc sec number : " + addr1);
				System.out.println("Location cd : " + addr2);
				System.out.println("Group name : " + city_nm);
				System.out.println("Employee first name : " + st_cd);
				System.out.println("Employee last name : " + country);
				System.out.println("Employee group number : " + pstl_loc_cd);
				
				
				}
			
			
			
			rs = stmt.executeQuery("select top 100 * from aos.AOS0025T where ASSGN_TRANS_NBR = '6148442'");
			
			while (rs.next()) {
				
				String assgn_enrollee = rs.getString("ASSGN_ENROLLEE_NBR");
				String assgn_trans = rs.getString("ASSGN_TRANS_NBR");
				String e_member_id = rs.getString("E_MEMBER_ID");
				String e_member_nbr = rs.getString("E_MEMBER_NBR");
				String cert_nbr = rs.getString("CERT_NBR");
				String e_last_name = rs.getString("E_LAST_NAME");
												
				System.out.println(assgn_enrollee);
				System.out.println(assgn_trans);
				System.out.println(e_member_id);
				System.out.println(e_member_nbr);
				System.out.println(cert_nbr);
				System.out.println(e_last_name);
				
				}
			
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
		
		
		
	}
}


