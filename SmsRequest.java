package com.example.Spring_SmsSender.model;

public class SmsRequest {
	public String to_phn_no;
	public String mssg;
	public String getTo_phn_no() {
		return to_phn_no;
	}
	public void setTo_phn_no(String to_phn_no) {
		this.to_phn_no = to_phn_no;
	}
	public String getMssg() {
		return mssg;
	}
	public void setMssg(String mssg) {
		this.mssg = mssg;
	}
	
}
