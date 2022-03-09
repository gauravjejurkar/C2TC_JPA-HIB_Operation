package com.gaurav;
import javax.persistence.*;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Emp_details")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)

@DiscriminatorColumn(name="emp_type",discriminatorType=DiscriminatorType.STRING)  
public class Empolyee implements Serializable{

	
private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy=GenerationType.AUTO)

private int id;
private String name;
private int salary;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}


}
