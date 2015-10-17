package jrout.tutorial.servlet;

import java.util.HashMap;
import java.util.Map;

public class EmployeDAO {
	static Map table = new HashMap();
	static {
		
		table.put("101", "Jayram Rout");
		table.put("103", "Raju Rout");
	}
	
	public String getName(String empId){
		return (String)table.get(empId);
	}
}
