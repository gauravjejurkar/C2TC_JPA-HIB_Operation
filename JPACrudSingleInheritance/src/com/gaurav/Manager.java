package com.gaurav;
import javax.persistence.*;
import javax.persistence.Table;


@Entity  
public class Manager extends Empolyee {  
  
   
	private static final long serialVersionUID = 1L;
    private String department;
	
    
    public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
   
	
}  