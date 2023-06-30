package com.learningTech.DemoHibEagerLasy5;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class laptop1 {
	@Id
	private int lid;
	private String lname;
	@ManyToOne
	private student1 student;
	
	public student1 getStudent() {
		return student;
	}
	public void setStudent(student1 student) {
		this.student = student;
	}
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "laptop1 [lid=" + lid + ", lname=" + lname + ", student=" + student + "]";
	}
	

}
