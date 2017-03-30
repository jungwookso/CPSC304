package core;
import java.util.Date;
public class Purchase {
	int pid;
	int gid;
	int mid;
	double amt_paid;
 Date paid_date;
 int type_id;
 String name;
 Double monthly_fee;
 String type;
 
 
public Purchase(int pid, int gid, int mid, double amt_paid, Date paid_date, int type_id, String name, Double monthly_fee, String type) {
	this.pid = pid;
	this.gid = gid;
	this.mid = mid;
	this.amt_paid = amt_paid;
	this.paid_date = paid_date;
	this.type_id = type_id;
	this.name = name;
	this.monthly_fee = monthly_fee;
	this.type = type;
}

public Purchase() {
	this.pid = 0;
	this.gid = 0;
	this.mid = 0;
	this.amt_paid = 0;
	this.paid_date = null;
	this.type_id = 0;
	this.name = "";
	this.monthly_fee = null;
	this.type = "";
}

public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public int getGid() {
	return gid;
}
public void setGid(int gid) {
	this.gid = gid;
}
public int getMid() {
	return mid;
}
public void setMid(int mid) {
	this.mid = mid;
}
public double getAmt_paid() {
	return amt_paid;
}
public void setAmt_paid(double amt_paid) {
	this.amt_paid = amt_paid;
}
public Date getPaid_date() {
	return paid_date;
}
public void setPaid_date(Date paid_date) {
	this.paid_date = paid_date;
}
public int getType_id() {
	return type_id;
}
public void setType_id(int type_id) {
	this.type_id = type_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Double getMonthly_fee() {
	return monthly_fee;
}
public void setMonthly_fee(Double monthly_fee) {
	this.monthly_fee = monthly_fee;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}

 
}
