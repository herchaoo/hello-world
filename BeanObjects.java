package com.atguigu.service;

class Torder {
	private String orderid;
	private String custid;
	private double amount;
	private java.sql.Timestamp cdate;
	public Torder() {
		
	}
	public Torder(String orderid, String custid, double amount, java.sql.Timestamp cdate) {
		this.orderid = orderid;
		this.custid = custid;
		this.amount = amount;
		this.cdate = cdate;
	}
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public String getCustid() {
		return custid;
	}
	public void setCustid(String custid) {
		this.custid = custid;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public java.sql.Timestamp getCdate() {
		return cdate;
	}
	public void setCdate(java.sql.Timestamp cdate) {
		this.cdate = cdate;
	}
	@Override
	public String toString() {
		return "Torder [orderid=" + orderid + ", custid=" + custid + ", amount=" + amount + ", cdate=" + cdate + "]";
	}
}