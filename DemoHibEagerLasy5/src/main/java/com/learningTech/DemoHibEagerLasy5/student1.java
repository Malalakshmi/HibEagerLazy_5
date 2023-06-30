package com.learningTech.DemoHibEagerLasy5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class student1 {
	@Id
	private int sid;
	private String sname;
	private int smarks;
	@OneToMany(mappedBy = "student", fetch = FetchType.EAGER)
	private Collection<laptop1> laptop = new ArrayList<laptop1>();
	

	public Collection<laptop1> getLaptop() {
		return laptop;
	}
	public void setLaptop(Collection<laptop1> laptop) {
		this.laptop = laptop;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSmarks() {
		return smarks;
	}
	public void setSmarks(int smarks) {
		this.smarks = smarks;
	}
	
	
	

}
