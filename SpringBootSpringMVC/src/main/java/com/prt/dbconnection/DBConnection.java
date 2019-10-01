package com.prt.dbconnection;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import com.prt.pojo.releasePojo;


public class DBConnection {
	
	public static List<releasePojo> dateAdjustedCall(String startDate, String  endDate) throws SQLException, ParseException
	{
		getDBConnection();
    	long start= converToMillis(startDate);
    	long end= converToMillis(endDate);
		return runQuery(start,end);
	}
	
     public static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
     public static final String DB_CONNECTION = "jdbc:oracle:thin:@72.163.52.206:1541/UCODEPRD.cisco.com";
     public static final String DB_USER = "URSRAALM_RO";
     public static final String DB_PASSWORD = "Sra_urr0";

        public static Connection getDBConnection() {

            Connection dbConnection = null;
            try {
                Class.forName(DB_DRIVER);
            } catch (ClassNotFoundException e) {
                System.out.println("Error driver JDBC: "+e.getMessage());
            }

            try {
            dbConnection = DriverManager.getConnection(DB_CONNECTION,DB_USER,DB_PASSWORD);
            if (dbConnection != null) {
                System.out.println("Connected to the database!");     
            } else {
                System.out.println("Failed to make connection!");
            }
            return dbConnection;
            
            } catch (SQLException e) {
                System.out.println("Cannot open connection: "+e.getMessage());
            }
            return dbConnection;
        }
        
        public static List<releasePojo> runQuery(long start, long end) throws SQLException, ParseException
        {
        	Connection con=getDBConnection();
        	ArrayList<releasePojo> releaseArray=new ArrayList<releasePojo>();
        	String query = "SELECT a.id,\r\n" + 
        			"       ursraalm.unix_ts_to_date (a.date_created ) -7/24 date_approved,\r\n" + 
        			"       ursraalm.unix_ts_to_date (a.scheduled_date) -7/24 Scheduled_Time,\r\n" + 
        			"       a.task_approval_id,\r\n" + 
        			"       b.version_id,\r\n" + 
        			"       c.name snapshot,\r\n" + 
        			"       c.application_id,\r\n" + 
        			"       d.name App_name,\r\n" + 
        			"       e.name environment_name,\r\n" + 
        			"       f.name Release_name,\r\n" + 
        			"       h.name user_name,\r\n" + 
        			"       i.status_id,\r\n" + 
        			"       j.name\r\n" + 
        			"  FROM ursraalm.ur_scheduled_deployment a,\r\n" + 
        			"       ursraalm.ur_sched_dep_version_map b,\r\n" + 
        			"       ursraalm.ur_version c,\r\n" + 
        			"       ursraalm.ur_Application d,\r\n" + 
        			"       ursraalm.ur_environment e,\r\n" + 
        			"       ursraalm.ur_release f,\r\n" + 
        			"       ursraalm.tsk_approval g,\r\n" + 
        			"       ursraalm.sec_user h,\r\n" + 
        			"       ursraalm.ur_version_status i,\r\n" + 
        			"       ursraalm.ur_status j\r\n" + 
        			"WHERE     a.id = b.scheduled_deployment_id\r\n" + 
        			"       AND b.version_id = c.id\r\n" + 
        			"       AND c.application_id = d.id\r\n" + 
        			//"       AND a.scheduled_date BETWEEN "+start+" AND "+end+"\r\n" + 
        			"       AND a.scheduled_date BETWEEN "+start+" AND "+end+"\r\n" + 
        			"       AND A.ENVIRONMENT_ID = e.id\r\n" + 
        			"       AND a.release_id = f.id\r\n" + 
        			"       AND a.task_approval_id = g.id\r\n" + 
        			"       AND g.started_by_user_id = h.id\r\n" + 
        			"       and c.id=i.version_id\r\n" + 
        			"       and i.status_id=j.id";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next())
            {
             releasePojo newPojo=new releasePojo(rs.getDate("date_approved"), 
            		 rs.getDate("Scheduled_Time"), 
            		 rs.getString("App_name"), 
            		 rs.getString("snapshot"), 
            		 rs.getString("environment_name"), 
            		 rs.getString("Release_name"), 
            		 rs.getString("name"));
             releaseArray.add(newPojo);
            }
            st.close();
			return releaseArray;
        }
        
        public static long converToMillis(String date) throws ParseException
        {
        	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        	Date date1 = sdf.parse(date);
        	long millis = date1.getTime();
			return millis;
        	
        }

    }

