package core;

import java.sql.Timestamp;

public class Group_exercise_log {
	int log_no;
	String title;
	int mid;
	String activity_name;
	int gid;
	Timestamp start_time;
	Timestamp end_time;

	public Group_exercise_log(int log_no, String title, String activity_name, int mid, int gid, Timestamp start_time, Timestamp end_time) {
		this.log_no = log_no;
		this.title = title;
		this.mid = mid;
		this.activity_name = activity_name;
		this.gid = gid;
		this.start_time = start_time;
		this.end_time = end_time;
	}
	
	public int getLog_no() {
		return log_no;
	}
	public void setLog_no(int log_no) {
		this.log_no = log_no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public Timestamp getStart_time() {
		return start_time;
	}
	public void setStart_time(Timestamp start_time) {
		this.start_time = start_time;
	}
	public Timestamp getEnd_time() {
		return end_time;
	}
	public void setEnd_time(Timestamp end_time) {
		this.end_time = end_time;
	}

	public String getActivity_name() {
		return activity_name;
	}

	public void setActivity_name(String activity_name) {
		this.activity_name = activity_name;
	}
	

}
