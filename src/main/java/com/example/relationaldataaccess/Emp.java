package com.example.relationaldataaccess;

public class Emp {
	public long empno;
	private String ename;
	long job,dd;
	public Emp() {
		this.ename="temp";
	}
	public Emp(long id, String sec, long thr,long fo) {
		this.empno = id;
		this.ename = sec;
		this.job = thr;
		this.dd = fo;
	}
//
//	@Override
//	public String toString() {
//		return String.format(
//				"Customer[id=%d, firstName='%s', lastName='%s']",
//				id, firstName, lastName);
//	}
	public String getid() {
		return ename;
	}
	public void setname(String name) {
		this.ename = name;
	}
}
