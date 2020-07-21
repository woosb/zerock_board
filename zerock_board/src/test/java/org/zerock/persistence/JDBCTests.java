package org.zerock.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTests {
	
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String uid = "book_ex";
	String upw = "book_ex";
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testConnection() {
		
		try(Connection con = 
				DriverManager.getConnection(url,uid,upw)){
			log.info(con);
		}catch(Exception e) {
			fail(e.getMessage());
		}
	}
}
