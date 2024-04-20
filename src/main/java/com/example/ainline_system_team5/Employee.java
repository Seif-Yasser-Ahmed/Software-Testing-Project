package com.example.ainline_system_team5;

import java.util.Map;

public class Employee extends Person{
//    boolean isAdmin=false;
    float salary;
    private static int adminNextid = 1;

    public Employee(String fname, String lname) {
        super(fname, lname);
        this.adminNextid=adminNextid;
        adminNextid++;
    }
    public Employee(String fname, String lname, int id, String pass, String mail, int phone, String add) {
        super(fname, lname, pass, mail, phone, add);
        this.adminNextid=adminNextid;
        adminNextid++;
    }
    
    public Employee() {
    	this.adminNextid=adminNextid;
    	adminNextid++;
	}
	public Object getPersonDetailsbyID(int id){
//    	return PersonList.get(id-1).getPersonDetails();
		return PersonList.get(id).getPersonDetails();
    }
	public int getAdminID() {
		return adminNextid;
	}
}
