package com.iiht.bt2.HibernateApp1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Person {
	@Id
	@GeneratedValue
	@Column(name="sid")	
    int pid;
	
	@Column(name="name")
    String pname;
    
	@Column(name="age")
    int age;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPnane() {
	return pname;
}
public void setPnane(String pnane) {
	this.pname = pnane;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
   
}